class Exc0 {
	
	public static void submethod() {
		int a,b;
	}
	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Wohoo");
		}
		finally {
			System.out.println("Weeehoo");
		}
	}
}
