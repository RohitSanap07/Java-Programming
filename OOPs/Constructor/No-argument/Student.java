class Student 
{
	String name;
	int age;
	String college;
	String degree;
	int rolno;

	Student(){
		System.out.println("Constructor starts ");
		
		System.out.println(this);
	}

	public void studentDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
        System.out.println("College : "+college);
		System.out.println("Degree : "+degree);
        System.out.println("Roll no : "+rolno);
		
	}
}
