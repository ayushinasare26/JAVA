public class SuperSubClass {
	public static void main(String[] args) {
		try {
			int a =0;
			int b = 32/a;
			
		} catch (Exception e) {
			System.out.println("Generic catch.");
		}
		catch (ArithmeticException e) {
			System.out.println("Never reached.");
		}
	}
}
