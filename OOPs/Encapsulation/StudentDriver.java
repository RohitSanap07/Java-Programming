package Encapsulation;

public class StudentDriver {

	public static void main(String[] args) {
		 Student s1 = new Student
		 ("Rohit","Full-Stack Development",35000.0,"Deccan",7.8,81.0,70.0,8625934751l);
		 
		 Student s2 = new Student
		("Rahul","Python Development",35000.0,"Hadapsar",9.0,85.0,76.0,8625974751l);


		s1.setBranch("Rohit", "Deccan");
		System.out.println( s1.getCgpa());
		
		System.out.println( s2.getCgpa());
		
		 
	}

}
