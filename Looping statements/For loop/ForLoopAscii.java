class ForLoopAscii

{
	public static void main(String[] args) 
	{

     System.out.println("ASCII Values of character");

     // Loop goes from 1 to 127 
     for (int i = 1;i <=127;i++ ) 
     {
		 
		 System.out.print(i+" "+((char)(i))+" "); // Typecast char to print ASCII value 1 to 127
     }

     System.out.println("Number from 0 to 9");

     // Loop of char goes 0 to 9 to print numbers
     for (char ch = '0';ch<='9' ;ch++ )
	 {
		 System.out.print(ch+" ");
	 }
	 
	 
	 System.out.println("Reverse alphabet print from z to a");

     // Loop starts from 'z' and goes upto 'a' with i-- to print reverse alphabets 
	 for (char i = 'z'; i>='a' ;i-- )
	  {
		  System.out.print(i+" ");
	  }
	 
	 System.out.println("Alphabet print from A to Z");
     
	 // Loop starts from 'A' and goes upto 'Z' to print alphabet
	 for (char i = 'A';i<='Z' ;i++ )
	  {
		  System.out.print(i+" ");
	  } 

     System.out.println("Number print from 1 to 10");
      
	 // Loop starts form 1 and goes upto less than equals to 10 to print numbers
     for (int i = 1;i<=10 ;i++ )
		{
			System.out.print(i+" ");
		}

}
}
