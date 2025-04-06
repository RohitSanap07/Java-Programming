class Form 
{
	String name ;
	long phno;
	long tel;
	char gender;
	String blood;
	String email;
	String dob;

	Form(){}

	Form(String name,long phno,char gender,String dob)
	{
		this.name = name;
		this.phno = phno;
		this.gender = gender;
		this.dob = dob;
    }

	Form(String name,long phno,char gender,String dob,long tel)
	{
		this.name = name;
		this.phno = phno;
		this.gender = gender;
		this.dob = dob;
		this.tel = tel;
    }

	Form(String name,long phno,char gender,String dob,long tel,String blood)
	{
		this.name = name;
		this.phno = phno;
		this.gender = gender;
		this.dob = dob;
		this.tel = tel;
		this.blood = blood;
    }

	Form(String name,long phno,char gender,String dob,long tel,String blood,String email)
	{
		this.name = name;
		this.phno = phno;
		this.gender = gender;
		this.dob = dob;
		this.tel = tel;
		this.blood = blood;
		this.email = email;
    }

	public void displayForms()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone : "+phno);
		System.out.println("Tel : "+tel);
		System.out.println("Gender : "+gender);
		System.out.println("Blood : "+blood);
		System.out.println("Email : "+email);
		System.out.println("DOB : "+dob);
		System.out.println("---------------------------");
	}
}
