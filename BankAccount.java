import java.io.*;

public class BankAccount{


	public long accountNo;
	public double balance;
	public String accountHolder;
	public OurDate dateOpened;
	
	public BankAccount(){
		accountHolder="No name yet";
		accountNo=0;
		balance=0;
		
	
	}

	public BankAccount( long no, double bal,String name, OurDate date){
		accountHolder=name;
		accountNo=no;
		balance=bal;
		dateOpened=date;
	
	}
	public long getAccount(){
		return accountNo;
	}
	
	public double getBalance(){
		return balance;
	}


	public String getAccountHolder(){
		return accountHolder;
	}
	
	public Date getDateOpened(){
		return dateOpened;
	}
	
	public void setAccountNo(long accNum){
		accountNo=accNum;
	}
	
	public void setBalance(double initialBalance){
		balance=initialBalance;
	}

	public void setDateOpened(Date accOpenDay){
		//dateOpened=accOpenDay;
	}

	public void deposit(double deposited){
		balance=balance+deposited;
	}

	public void withdraw(double withdrawn){

		if(balance>=withdrawn){
			balance=balance-withdrawn;
		}
		else{
			System.out.println("Insufficient funds. Your balance is: "+ balance);
		}

	}

	public void transfer(double f,BankAccount g){
		
	}

	public String toString(){

	}
}
