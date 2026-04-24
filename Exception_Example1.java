public class Exception_Example1 {
	public static void main(String args[])
 {
		String city = null;
 
		try {
			
			int len = city.length();
			System.out.println("Length is : " + len);
			
 }
		catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		finally {
		System.out.println(" Inside finally block..");
		}
		System.out.println(" The End..");

}
}
