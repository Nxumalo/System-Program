import java.io.*;                          

public class HourlyWorked extends Worker{
	public int hours=0;
	public double pay=0;
	public HourlyWorker(){
		super();
		hours=0;
		pay=0;
	}

	public HourlyWorker(String worker,int wRate,int wPeriod){
		super(worker,wRate);
		hours=wPeriod;
		
	}
	public void newWorker(String newName,int Rate ,int period){
 		setName(newName);
		setSalaryRate(Rate);
		hours=period;
	}

	public void computePay(int hour){

		if(hour>40){
			int over=hour-40;
			double exact=SalaryRate*40;
			double extra=(150.0/100.0)*(double)SalaryRate;
			double excess=extra*over;
			pay=exact+excess;
			
		}
		else{
			 pay=hour*SalaryRate;
		}
		
		
	}

	public double getPay(){
		return pay;
	}
	public void writeOutput(){

		System.out.println("Name: "+getName());
		System.out.println("Salary rate: "+getRate());
		System.out.println("Pay: "+getPay());
		System.out.println();
	}


}
