
public class Tax3{
	private static String salaryin;
	public String salaryout;
	public String s="%";
	public double tax=0;
	public double taxRATE;
	public double net_tax;
	public double salaryAA;
	public double salaryA;
	public double rebateP=13257;
	public double rebateS=7407+rebateP;
	public double rebateT=2466+rebateS;
	public double thresU65=73650;
	public double thresO65=114800;
	public double thresO75=128500;
	private int age;
	//public int salary;
	public int n_tax;
	public int salaryAAA;
	public int n;
	public int years;
	public int months=12;
	public int period=0;
	public char rebate='A';
	public int finalSalary;

	

	public void setSalary(String sal){
		salaryin=sal;
	}
	public static String getSalary(){
		return salaryin;	
	}
	public void setFinalSalary(int fsalary){
		finalSalary=fsalary;

	}
	public int getFinalSalary(){
		return finalSalary;
	}
	
	public  void setAge(int lived){
		age=lived;
	
	}
	public int getAge(){
		return age;	
	}
	public void convert(){
		
		setFinalSalary(TaxAndSaveDemo3.salary);
		salaryAA=getFinalSalary()*months;				    //calcuating the annual salary
		salaryA=salaryAA;
	}
	public void userInput(){
		
		System.out.println("Enter monthly salary:");

		//String input1=TaxAndSaveDemo3.Str_input.next();
		//String input1=ShowButtonDemo.insalary;
		//setSalary(input1);

		//System.out.println("Enter age:");

		//int life=TaxAndSaveDemo3.Str_input.nextInt();
		//int life=ShowButtonDemo.inage;
		//setAge(life);
		
		
		}
	public void salaryTAX(){
		if (salaryA>0 && salaryA<=181900){  		       	        //salary from 0-181 900
			taxRATE=0.18;
			if(age<65 && salaryA<thresU65){		  		//those who dont have to pay tax..lucky
				System.out.println("No tax. Under Threshold.");
				System.exit(0);
			}else if(age>=65 && age<75 && salaryA<thresO65){	//those who dont have to pay tax..lucky
				System.out.println("No tax. Under Threshold.");
			        System.exit(0);
				
			}else if(age>=75 && salaryA<thresO75){	   		//those who dont have to pay tax..lucky
				System.out.println("No tax. Under Threshold.");
				System.exit(0);
			}else {
				tax=salaryA*taxRATE;
				
			}
			}		
		else if(salaryA>181900 && salaryA<=284100){	    //for salaries exceeding 181 900 yet not over 284 100
			taxRATE=0.26;
			salaryA=salaryA-181900;
			tax=(salaryA*taxRATE)+32742;
			
			}
		else if(salaryA>284100 && salaryA<=393200){	    //for salaries exceeding 284 100 yet not over 393 200
			taxRATE=0.31;
			salaryA=salaryA-284100;
			tax=(salaryA*taxRATE)+59314;
			
			}
		else if(salaryA>393200 && salaryA<=550100){	     //for salaries exceeding 393 200 yet not over 550 100
			taxRATE=0.36;
			salaryA=salaryA-393200;
			tax=(salaryA*taxRATE)+93135;
							}
		else if(salaryA>550100 && salaryA<=701300){	      //for salaries exceeding 550 100 yet not over 701 300
			taxRATE=0.39;
			salaryA=salaryA-550100;
			tax=(salaryA*taxRATE)+149619;
			
			}
		else if(salaryA>701300){			      //for salaries exceeding 701 300
			taxRATE=0.41;
			salaryA=salaryA-701300;
			tax=(salaryA*taxRATE)+208587;
			}
		else{						      // for negative salaries and those wo do not earn.
			System.out.println("Invalid salary");
			System.exit(0);
		}
		

	}
	
	public void switchREBATE(){
		if(age<65){						//recognises ages under 65
				rebate='A';
					
		}else if(age>=65 && age<75){		//recognises ages over 65 but under 75
				rebate='B';
		}else if(age>=75){			//recognised ages over 75
				rebate='C';
			}
		//the switch statement
		switch(rebate){

		case 'A':    				//When a user is under 65 they are rebated this amount
			tax=tax-rebateP;
			break;
		case 'B':				//When a user is over 65 and uner 75they are rebated this amount
			tax=tax-rebateS;
			break;
		case 'C':				//When a user is over they are rebated this amount
			tax=tax-rebateT;
			break;

		}
	}

	public void computeTAX(){
		net_tax= (tax/salaryAA)*100;
		n_tax=(int)(Math.ceil(net_tax));
		salaryAAA=(int)salaryAA;
	}	
	public void userOutput(){
		System.out.printf("Tax for annual salary of R%d is R%.2f which is net %d%s\n",salaryAAA,tax,n_tax,s);
	}


}

