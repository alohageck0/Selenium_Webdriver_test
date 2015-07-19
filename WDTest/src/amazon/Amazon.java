package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws Exception {
		
		//Step1: Open Firefox 
		
		WebDriver wd = new FirefoxDriver();
		Print.printStepDate();
		
		//Step2: Go to Amazon URL 
		
		wd.get("http://www.amazon.com");
		Print.printStepDate();
		
		//Step3: Type search 
		
		wd.findElement(By.id("twotabsearchtextbox")).sendKeys("The Fault in Our Stars");
		Print.printStepDate();
		
		//Step4: Click search 
		
		wd.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
//		Thread.sleep(9000);
		Print.printStepDate();
		
		//Step5: Click link of book
		wd.findElement(By.linkText("The Fault in Our Stars")).click();
//		Thread.sleep(9000);
		Print.printStepDate();
	
		//Step6: ammount in cart before adding
		int count = new Integer(wd.findElement(By.id("nav-cart-count")).getText());
//		System.out.println(count);
		Print.printStepDate();
		
		//Step6: Count amount of numbers added to cart (before adding+added) 
		wd.findElement(By.id("quantity")).click();
		int summ = new Integer(wd.findElement(By.xpath(".//*[@id='quantity']/option[1]")).getText()) +
				count;
		System.out.println("Calculated cmount of items in cart: " + summ);
		Print.printStepDate();
		
		//Step7: Add to cart amount of items
		
		wd.findElement(By.name("submit.add-to-cart")).click();
//		Thread.sleep(9000);
		
		//Step8: Store actual cart number
		
		int actual = new Integer(wd.findElement(By.id("nav-cart-count")).getText());
		System.out.println("Actual cmount of items in cart: " + actual);
		//Compare results
		
		if (summ == actual) {
			System.out.println("Test case passed");
		} else {
			System.out.println("FAILED");
		}
		
		wd.close();
		
	}

}
