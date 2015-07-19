import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import amazon.Print;


public class Orbitz {

	private static double[] prices;

	public static void main(String[] args) throws Exception {
			
		String[] dest = {"SFO", "SVO"};
		
		
		
		
		for (int i = 0; i < dest.length; i++) {
			prices[i] = findPrice(dest[i], "JFK");
		}
//		System.out.println("Price from " + price1);
//		double price2 = findPrice("SFO", "BOS");
//		System.out.println("Price from " + price2);
		
		if (prices[0] > prices[1]) {
			System.out.println("It is cheaper to fly SFO-JFK ");
		} else {
			System.out.println("It is cheaper to fly SFO-BOS ");
		}
	}

	public static double findPrice(String arrival, String destin) throws InterruptedException {
		//Step1: Open Firefox 
		
		WebDriver wd = new FirefoxDriver();
		Print.printStepDate();
		//Step2: Go to Orbitz URL 
		
		wd.get("http://www.orbitz.com");

		Print.printStepDate();
		//Step3: Click on �Flight only� radio button 
		
		wd.findElement(By.id("search.type.air")).click();
		
		//Sleep time: 
		Thread.sleep(2000);
		Print.printStepDate();
		//Step4: Clear and Click on From City text field (not required) 
		
		
		
		//Step5: Enter �From City� data 
		wd.findElement(By.name("ar.rt.leaveSlice.orig.key")).sendKeys(arrival);
		
		Print.printStepDate();
		//Step6: Enter �To City� data 
		wd.findElement(By.name("ar.rt.leaveSlice.dest.key")).sendKeys(destin);
		
		Print.printStepDate();
		//Step7: Enter �Leave Date�
		wd.findElement(By.name("ar.rt.leaveSlice.date")).sendKeys("08/11/15");
		
		Print.printStepDate();
		//Step8: Enter �Return Date�
		wd.findElement(By.name("ar.rt.returnSlice.date")).sendKeys("09/14/15");
		
		Print.printStepDate();
		//Step9: Click on �Search� Flight 
		wd.findElement(By.name("search")).click();
		Thread.sleep(6000);
		
		Print.printStepDate();
		//Step10: Capture the Price
		
		String price = wd.findElement(By.xpath(".//*[@id='main']/div[10]/div[2]/div/div[1]/div/div[1]/span[1]/span")).getText(); 
		Thread.sleep(6000);
		
		Print.printStepDate();
		//Step11: Convert to double
		
		double minPrice = Double.parseDouble(price.replace("$", ""));
		
		Print.printStepDate();
		//Step12: Close Firefox
		
		wd.quit();
		Print.printStepDate();
		System.out.println("Price " + minPrice);
		return minPrice;
		
	}

}
