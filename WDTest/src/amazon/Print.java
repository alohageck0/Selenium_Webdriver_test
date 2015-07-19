package amazon;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Print {
	public static int step = 1;
	public static void printStepDate() {
		Date curDate = new Date();
		
		System.out.println("Step " + step  + " completed at " + new SimpleDateFormat("HH:mm:ss").format(curDate));
		step++;
	}

}
