package gap;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import amazon.Print;

public class ShoppingCart {

	public static void main(String[] args) throws Exception {
		
		//Step1: Open Firefox 
		
				WebDriver wd = new FirefoxDriver();
				wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				Print.printStepDate();
				
				//Step2: Go to Gap URL 
				
				wd.get("http://www.gap.com");
				Print.printStepDate();
				wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				//Step3: click Men
				
				wd.findElement(By.id("division5063")).click();
				Print.printStepDate();
				wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				//Step4: Click Shirts link
				
				wd.findElement(By.linkText("Shirts")).click();
				wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				Print.printStepDate();
				
				//Step5: Click link shirt
				wd.findElement(By.linkText("Seersucker honeycomb dot print shirt")).click();
				wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				Print.printStepDate();
			
				//Step6: Choose size
				wd.findElement(By.id("size1Swatch_2")).click();
				Print.printStepDate();
				
				//Step6: Select quantity
				
				Select quantity = new Select(wd.findElement(By.xpath("//select[@id='qtyDropDown']")));
				quantity.selectByValue("2");
				Print.printStepDate();
				
				//Step7: Add to bag
				
				wd.findElement(By.id("addToBagBtn")).click();
				Print.printStepDate();
				wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				//Step8: Print quantity in bag
				
				String inBag = new String(wd.findElement(By.xpath("//div[@class='left g-1-2 border-box tx_left black tx_bold']")).getText());
				String subtotal = new String(wd.findElement(By.xpath("//div[@class='right g-1-2 border-box tx_right black tx_bold']")).getText());
				
				System.out.println("Result: " + inBag);
				System.out.println("Subtotal: " + subtotal);
				
				
				wd.close();
				
	}

}
