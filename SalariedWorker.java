import java.io.*;                          

public class SalariedWorker extends Worker{
	public int hours=0;
	public double pay=0;
	public SalariedWorker(){
		super();
		hours=0;
		pay=0;
	}

	public SalariedWorker(String worker,int wRate,int wPeriod){
		super(worker,wRate);
		hours=wPeriod;
		
	}
	public void newWorker(String newName,int Rate ,int period){
 		setName(newName);
		setSalaryRate(Rate);
		hours=period;
	}

	public void computePay(int hour){
		
		hours=hour;
		
		pay=40*SalaryRate;

		//return pay;
	}

	public double getPay(){
		return pay;
	}
	public void writeOutput(){

		System.out.println("Name: "+getName());
		System.out.println("Salary rate: "+getRate());
		System.out.println("hours worked: "+hours);
		System.out.println("Pay: "+getPay());
		System.out.println();
	}

}
