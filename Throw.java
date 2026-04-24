public class Throw {
	static void demo() {
		try {
			throw new NullPointerException ("demo");
		}
		catch (NullPointerException e) {
			System.out.println("Caught inside demoproc.");
			throw e;
		}
	}
	public static void main (String[] args) {
		try {
			demo();
		}
		catch(NullPointerException e) {
			System.out.println("Recaught : " + e);
		}
	}
}
