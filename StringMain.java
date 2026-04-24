public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rollNo = 100;
		s1.studName = "Abc";
		s1.studDept = "CSE";
		
		System.out.println(" Roll Number is: " + s1.rollNo);
		System.out.println(" Name is : " + s1.studName);
		System.out.println(" Department is : " + s1.studDept);
		
		Student s2 = new Student();
		s2.rollNo = 200;
		s2.studName = "Bcd";
		s2.studDept = "BBA";
		
		System.out.println("\n Roll Number is: "+ s2.rollNo);
		System.out.println(" Name is : "+ s2.studName);
		System.out.println(" Department is : "+ s2.studDept);
		

	}

}
