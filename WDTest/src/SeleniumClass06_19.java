
public class SeleniumClass06_19 {

	public static void main(String[] args) throws Exception {
		
	
//		messageNameYear("Evgenii", 1987);
		int summ = sum (1, 2, 3);
		
		System.out.println("The summ is: " + summ);
		
		
	}

	public static void messageNameYear(String name, int year) {
		System.out.println("Hi " + name + " (" + year + ")");
	}
	
//	Message to name
	public static void message(int sum) {
		
		System.out.println("Hi " + sum);
	}

//	Function to display summ
	public static int sum (int x1, int x2, int x3) throws Exception {
		
		int total = x1 + x2 + x3;
		return total;
	}
	
		
	
}
