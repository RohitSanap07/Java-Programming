package Encapsulation;

public class Student {

  private String institute = "Qspiders / Jspiders";
  private String name ;
  private String course;
  private double fees;
  private String branch;
  private double cgpa;
  private double sscPer;
  private double hscPer;
  private long phono ;
  
  public Student(String name ,String course,double fees,
		         String branch,double cgpa,double sscPer,double hscPer,long phono)
  
  {
	     this.name = name;
	     this.course = course;
	     this.branch = branch;
	     this.fees = fees;
	     this.cgpa = cgpa;
	     this.sscPer = sscPer;
	     this.hscPer = hscPer;
	     this.phono = phono;
	     
	 }
  
     public String getInstituteName()
     {
  	 return institute;
     }
  
    public String getName()
    {
    	return name;
    }
    
    public String getCourse()
    {
    	return course;
    }
    
    public double getFees()
    {
    	return fees;
    }

    public void setBranch(String name,String branch)
    {
       if (this.name == name) {
    	   
    	   this.branch = branch;
    	   System.out.println("Current branch : "+branch);
       }
       else {
    	   System.out.println("Invalid Details");
       }
    }

    public double getCgpa()
    {
        return cgpa;
    }

    public double getSscPer()
    {
        return sscPer;
    }

    public double getHscPer()
    {
        return hscPer;
    }
    
    public long getPhono()
    {
        return phono;
    }

  

}
