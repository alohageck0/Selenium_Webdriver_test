
public class Arrays {

	public static void main(String[] args) {
		
		String[] names = {"Alex", "Bob", "Jack"};
		for (int i = 0; i < names.length; i++) {
			message(names[i]);
		}
	}

		public static void message(String names) {
		
		System.out.println("Hi " + names);
	}
}
