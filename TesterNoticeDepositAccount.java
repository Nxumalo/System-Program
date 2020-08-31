import java.io.*;
/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>
*/
public class TesterNoticeDepositAccount 
{
	public static void main (String[] args)
	{
		NoticeDepositAccount b2 = new NoticeDepositAccount(90, 6.5, 246890, 500.0, "Benjamin", new OurDate(2010, 10, 25));
		System.out.println(b2);			
		NoticeDepositAccount b3 = new NoticeDepositAccount(60, 10.0, 468901, 7500.0, "Conradie", new OurDate(2011, 8, 16));
		System.out.println(b3);			
		System.out.println();			
	
		BankAccount.todaysDate.setDate(new OurDate(2011, 9, 29)); // setOurDate when transaction is performed
		System.out.println("Withdraw R800 on "+BankAccount.todaysDate+" Interest last added on "+b3.getDateLastInterestAdded()+" period: "+ b3.getDateLastInterestAdded().calculateNoOfDays(BankAccount.todaysDate)+" days");

		b3.withdraw(800);
		System.out.println(b3);			
		System.out.println();			

		BankAccount.todaysDate.setDate(new OurDate(2012, 1, 15));
		System.out.println("Deposit R500 "+BankAccount.todaysDate+" Interest last added on "+b3.getDateLastInterestAdded()+" period: "+ b3.getDateLastInterestAdded().calculateNoOfDays(BankAccount.todaysDate)+" days");
		b3.deposit(500);
		System.out.println(b3);			
		System.out.println();			
	
		BankAccount.todaysDate.setDate(new OurDate(2012, 3, 10));
		System.out.println("Before transfer ");
		System.out.println(b3);			
		System.out.println("Transfer R200 "+BankAccount.todaysDate+" Interest last added on "+b3.getDateLastInterestAdded()+" period: "+ b3.getDateLastInterestAdded().calculateNoOfDays(BankAccount.todaysDate)+" days");
		System.out.println(b2);			
		System.out.println("Transfer R200 "+BankAccount.todaysDate+" Interest last added on "+b2.getDateLastInterestAdded()+" period: "+ b2.getDateLastInterestAdded().calculateNoOfDays(BankAccount.todaysDate)+" days");
		b3.transfer(200, b2);
		System.out.println("After transfer ");
		System.out.println(b3);			
		System.out.println(b2);			
		System.out.println();			
	}
}
