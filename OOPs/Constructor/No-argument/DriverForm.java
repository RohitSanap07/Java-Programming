class DriverForm  
{
	public static void main(String[] args) 
	{
		Form f1 = new Form();

		f1.displayForms();

		Form f2 = new Form("Rohit",1345224423,'M',"04/July/2003");

		f2.displayForms();

		Form f3 = new Form("Kunal",1345423223,'M',"03/May/2002",123456);

		f3.displayForms();

		Form f4 = new Form("Swapnil",1354233463,'M',"12/Jan/2000",789012,"O+");

		f4.displayForms();

		Form f5 = new Form("Pooja",1343455368,'F',"02/June/2004",532453,"A+","pooja@gmail.com");

		f5.displayForms();

      }
}
