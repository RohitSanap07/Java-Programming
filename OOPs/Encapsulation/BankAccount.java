package Encapsulation;

class BankAccount {
  
	 private String userName;
	 private String bankName;
	 private long accno;
	 private String ifsc;
	 private double balance;
	 private int pin;
	 
     BankAccount(String userName,String bankName,long accno,String ifsc,double balance,int pin)
	 {
		 this.userName = userName;
		 this.bankName = bankName;
		 this.accno = accno;
		 this.ifsc = ifsc;
		 this.balance = balance;
		 this.pin = pin;
		 
	 }
	 
	 public String getUserName()
	 {
		 return userName;
	 }
	 
	 public String getBankName()
	 {
		 return bankName;
	 }
	 
	 public long getAccNo()
	 {
		 return accno;
	 }
	 
	 public void  setPin(long accno,int oldpin,int newpin)
	 {
		if (this.accno == accno && this.pin == oldpin )
		{
			pin = newpin;
			System.out.println("Pin Updated!");
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
		 
	 }
	 
	 public String getIFSC()
	 {
		 return ifsc;
	 }
	 
	 public double getBalance(long accno,int pass)
	 {
		 if(this.accno == accno && this.pin ==pass)
		 {
			 return balance;
		 }
		 else {
			 System.out.println("Invalid Crendentials");
			 return 0;
		 }
	 }
	 
	 public void credit(long accno,int pin,double amt)
	 {
		 if(this.accno==accno && this.pin == pin)
		 {
			 if(amt>0)
		 {
			 balance += amt;
			 System.out.println("Amount Credited");
			 System.out.println("Total balance : "+balance);
		 }
			 else
			 {
				 System.out.println("Invalid Amount");
			 }
		 }
			 
			 else {
				 System.out.println("Invalid Credentials");
			 }
		 
		 }
	 
	   public void debit(long accno,int pin,double amt)
	   {
		   if (this.accno == accno && this.pin == pin)
		   {
			   if(amt>0) {
				   if(balance-amt>1000) {
					   balance -=amt;
					   System.out.println("Amount Debited!");
					   System.out.println("Total balance : "+balance);
				   }
				   else {
					   System.out.println("Insufficient balance");
				   }
				   
			   }
			   else {
				   System.out.println("Invalid Amount!");
			   }
			   
			   
		   }
		   
		   else {
			   System.out.println("Invalid Credentials");
		   }
	   }
	 
	 
	 }
	 
	 

