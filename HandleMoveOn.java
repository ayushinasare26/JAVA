import java.util.Random;

public class HandleMoveOn {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Random r = new Random();
		
		for (int i = 0; i<= 5; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b/c);
			}
			catch(ArithmeticException e) {
				System.out.println("Div by 0: " + e);
				a = 0;
			}
			System.out.println("a: " + a);
		}
	}
}
