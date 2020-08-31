import java.io.*;
/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

This method is to do calculation for fall changes made in the savings account of the user. Whether it be a tranfer, withdrawal or deposit. It also does interest calculations when the user makes a deposit or a withdrawal. It extends the Bank account class and makes use of some of the Bank account class methods and attributes. It is super class to the notice deposit account. 
*/
public class SavingsAccount extends BankAccount{

	private double interestRate;					//creates interest rate
	private Date dateLastInterestAdded;				//creates date last modified
	private double interestAccrued;					//creates interest accrued
/**
This is out constructor with no arguments which sets all values to zero
*/
	public SavingsAccount(){
		super();						//instantiates the super cass
		interestRate=0;						//sets interest Rate to 0
		interestAccrued=0;					//sets accrued interest to 0
	}
/**
This is the second constructor. It have a few parameters .
@param interestrate
@param accNumber
@param initBalance
@param accHolder
@param dateToday
*/
	public SavingsAccount(double interestrate,long accNumber,double initBalance, String AccHolder,OurDate dateToday ){
		super(accNumber,initBalance,accHolder,dateToday);
		interestRate=intrestrate;				//sets interest rate to a given parameter

	}
/**
get method for interest rate
@return interest rate
*/
	public double getInterestRate(){
		return interestRate;					//returns interest rate

	}		
/**
get method for date last interest added
@return date last interest added
*/
	public Date getDateLastInterestAdded(){
		return dateLastInterestAdded;				//returns date
	}
/**
get method for interest accrued
@return interest accrued
*/		
	public double getInterestAccrued(){
		return interestAccrued;					//retunrs interest accrued

	}
/**
set method for interest rate
@param initInterestRate
*/
	public void setInterestRate(double initInterestRate){
		interestRate=initInterestRate;				//sets interest rate
	}
/**
set method for last date interest got added
@param lastInterestADDED
*/
	public void setDateLastInterestAdded(Date lastInterestADDED){
		dateLastInterestAdded=lastInterestADDED;		//sets the interest added
	}
/**
set method for interest accrued
@param accruedINTEREST
*/
	public void setInterestAccrued(double accruedINTEREST){
		
		interestAccrued=accruedINTEREST;			//sets the interest accrued
	}
/**
This method overides the deposit method in the super class and accumulate the balance when requested
*/
	public void deposit(double Deposited){
		balance=balance+Deposited;				//accumulates the balance
	}
/**
This method overides the withdraw method in the super class and decreases the balance
*/
	public void withdraw(double Withdrawn){
		if(balance>Withdrawn){
			balance=balance-Withdrawn;			//decreases balance
		}
		else{
			System.out.println("Insufficient funds. Your balance is: "+ balance);
		}
		
	}

	public void addINterest(Date m){


	}

	public String toString(){

	}









}
