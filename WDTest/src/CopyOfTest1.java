import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CopyOfTest1 {

	public static void main(String[] args) throws Exception {
			
		//Step1: Open Firefox 
		
		WebDriver wd = new FirefoxDriver();
		
		//Step2: Go to Orbitz URL 
		
		wd.get("http://www.orbitz.com");

		
		//Step3: Click on ‘Flight only’ radio button 
		
		wd.findElement(By.id("search.type.air")).click();
		
		//Sleep time: 
		Thread.sleep(1000);
		
		//Step4: Clear and Click on From City text field (not required) 
		
		
		
		//Step5: Enter ‘From City’ data 
		wd.findElement(By.name("ar.rt.leaveSlice.orig.key")).sendKeys("SFO");
		
		//Step6: Enter ‘To City’ data 
		wd.findElement(By.name("ar.rt.leaveSlice.dest.key")).sendKeys("BOS");
		
		//Step7: Enter ‘Leave Date’
		wd.findElement(By.name("ar.rt.leaveSlice.date")).sendKeys("08/11/15");
		
		//Step8: Enter ‘Return Date’
		wd.findElement(By.name("ar.rt.returnSlice.date")).sendKeys("09/14/15");
		
		//Step9: Click on ‘Search’ Flight 
		wd.findElement(By.name("search")).click();
		Thread.sleep(9000);
		
		//Step10: Capture the Price
		
		String price = wd.findElement(By.xpath(".//*[@id='main']/div[10]/div[2]/div/div[1]/div/div[1]/span[1]/span")).getText(); 
		Thread.sleep(8000);
		
		//Step11: Display the Price
		
		System.out.println("Price is: " + price);
		//Step12: Close Firefox
		
		wd.close();
	}

}
