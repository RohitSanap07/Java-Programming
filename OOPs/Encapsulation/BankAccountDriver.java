package Encapsulation;

public class BankAccountDriver {

	public static void main(String[] args) {
		
 BankAccount b1 = new BankAccount("Rohit","Union Bank of India", 4930230051l,"Union510", 2000.0,4551);
		

        System.out.println(b1.getUserName());
		
		System.out.println(b1.getBankName());
		
		System.out.println(b1.getAccNo());
		
		b1.setPin(4930230051l, 4551, 5544);
		
		System.out.println(b1.getIFSC());
		
		System.out.println(b1.getBalance(4930230051l,5544));
		
		b1.credit(4930230051l,5544,10000);
	}

}
