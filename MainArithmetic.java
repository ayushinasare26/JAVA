public class MainArithmetic {

	public static void main(String[] args) {
		ArithmeticOperations obj1 = new ArithmeticOperations();
		obj1.setA(10);
		obj1.setB(20);
		
		obj1.addition();
		
		System.out.println(obj1.getC());
		
		obj1.subtraction();
		
		System.out.println(obj1.getC());
		
		obj1.multiplication();
		
		System.out.println(obj1.getC());
	}

}
