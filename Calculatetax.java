import javax.swing.JOptionPane;
/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Programming assignment 2.1<p>

<h1>Calculating tax due to SARS</h1>

<p>This program asks for the person's age and monthly salaries. It uses this information to calculate their net anual tax due to SARS.It only considers tax of individual monthly salaries....all other deductions are not considered in this programme.
*/
public class Calculatetax{
/**
This program asks for the person's age and monthly salaries. It uses this information to calculate their net anual tax due to SARS. It asks for the salary and stores it as a string data type. It converts the string type salary to a interger type which it then uses to calculatethe user's annual salaryIt then evaluates the user's age and their corresponding salaries....if the user qualifies for tax, the programme then evaluates the users annual salary. It groups the salary in accordance to the salary amount and which tax deduction system it falls under. It then calculates the tax, subtract the corresponding rebates. It also calculates the ratio of the final tax with the user's salary then outputs the user's annual salary and actaul net tax the user pay. 

*/
	public static void main(String args[]){
		//Declared variables
		String salaryin,salaryout,ageS,s="%";
		double tax=0,taxRATE,net_tax,salaryAA,salaryA,rebateP,rebateS,rebateT,thresU65,thresO65,thresO75,months;
		int age,salary,n_tax=0,salaryAAA=0;
		rebateP=13257;				//primary rebate
		rebateS=7407+rebateP;			//seconday rebate
		rebateT=2466+rebateS;   		//tertiary rebate
		thresU65=73650;				//threshold for under 65 years old
		thresO65=114800;			//threshold for over 65 but under 75 years old
		thresO75=128500;			//threshold for over 75 years old
		months=12;				//number of months in a year for calculating anual salaries
		char rebate='A';			//initializes the switch characters 

		
		salaryin=JOptionPane.showInputDialog("Please enter your salary: ");

		ageS=JOptionPane.showInputDialog("Please enter your age: ");
		
		                     
		
		
		
		  			    
		salaryout=salaryin.substring(1);	           //deletes the rand symbol for the salary.
		salary=Integer.parseInt(salaryout);		           //store the final salary in interger type
		salaryAA=salary*months;				    //calcuating the annual salary
		salaryA=salaryAA;
		age=Integer.parseInt(ageS);
		
		if (salaryA>0 && salaryA<=181900){  		  //salary from 0-181 900
			taxRATE=0.18;
			if(age<65 && salaryA<thresU65){		  //those who dont have to pay tax..lucky
				System.out.println("No tax. Under Threshold.");
				System.exit(0);
			}else if(age>=65 && age<75 && salaryA<thresO65){		   //those who dont have to pay tax..lucky
				System.out.println("No tax. Under Threshold.");
			        System.exit(0);
				
			}else if(age>=75 && salaryA<thresO75){	   //those who dont have to pay tax..lucky
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
		if(age<65){						//recognises ages under 65
				rebate='A';
					
		}else if(age>=65 && age<75){				//recognises ages over 65 but under 75
				rebate='B';
		}else if(age>=75){					//recognised ages over 75
				rebate='C';
			}
		//the switch statement
		switch(rebate){

		case 'A':    						 //When a user is under 65 they are rebated this amount
			tax=tax-rebateP;
			break;
		case 'B':						//When a user is over 65 and uner 75they are rebated this amount
			tax=tax-rebateS;
			break;
		case 'C':						//When a user is over they are rebated this amount
			tax=tax-rebateT;
			break;

		}
		
		net_tax= (tax/salaryAA)*100;
		n_tax=(int)(Math.ceil(net_tax));
		salaryAAA=(int)salaryAA;
		
		JOptionPane.showMessageDialog(null,"Tax for annual salary of "+ salaryAAA +" is "+tax+ " which is net "+n_tax+s);
		System.exit(0);
 }


}
