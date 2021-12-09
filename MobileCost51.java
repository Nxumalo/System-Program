//Import statements
import java.util.Scanner;
/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 09/12/2021<p>

<h1><p><b>Calculating number of IM's for the price of one SMS  using string inputs<b><p>

<p>This program calculates the amount of IMs that can be send for the price of one SMS.It asks the user to enter the price of one SMS and also the price of one MB. It then calculates the ratio between the two prices. It uses that ratio to compare the difference between the two prices and the uses the ration to calculate the number of IM's that can be send with that amount of an SMS.<p>
*/
	

public class MobileCost51 {

	public double priceSMS;				//variable to store the of input double sms price
	public double priceDATA;			//variable to store the input of double mb price
	public double ratio;				//to store the ratio of the two prices for later comparisons
	public double pricePMB;				//to store the price per mb
	public int im;					//to set the final number of ims to be send				
	public int mb=(1024*1024);			//set the constant size of a mb
	public int CHAR_amount=140;			//to set the character size of an im and an sms
	private String inputSMS;			//to store the input string sms price
	public String input1;				//to set the string of sms price in the setSMSprice variable
	public String input2;				//to set the string of mb price to set in the setMBprice variable
	private String inputMB;				//to store the input string mb price
	public String SMScost;				//set the string SMS cost
	public String MBcost;				//set the string MB price

	//method to set the price of an sms	
	public void setPriceSMS(String priceS){	
		inputSMS=priceS;						//sets the price of an sms
	}
	//method to get the price of sms
	public String getSMSprice(){
		return inputSMS;						//returns the price of an sms
	}
	//method to set the price of mb
	public void setPriceMB(String priceM){
		inputMB=priceM;							//sets the price of a mb
		
	}
	//method to get the price of a mb
	public String getPriceMB(){
		return inputMB;							//returns the price of a mb
	}
	//method to get and use the user inputs
	public void userInputs(){
		Scanner inputs=new Scanner (System.in);				//setting scanner inputs to get user inputs
		 System.out.println("Cents per SMS,e.g. R0.80:");		//messege to promp the user to enter the price of an sms
          
          input1=inputs.next(); 						//stores the price of an sms
          setPriceSMS(input1);							//setting the price of an sms from input1
          
          System.out.println("Rands per MB, e.g R1.50:");			//messege to promp the user to enter the price of a mb		
          
          input2=inputs.next();							//stores the price of a mb
          setPriceMB(input2);							//setting the price of mb from input2
          SMScost=getSMSprice().replace("R", "");				//if the rand sign exist...it shall be removed throught this process
          MBcost=getPriceMB().replace("R", "");					//if the rand sign exist...it shall be removed throught this process
          priceSMS=Double.parseDouble(SMScost);    				//converting the string price of an sms mto an integer                        
	 priceDATA=Double.parseDouble(MBcost);	 				//converting the string price of of a mb to an integer                    
	}
	//method to compute the number of ims to be send for the price of one sms
	public void computeNumIMs(){                      
		
                priceSMS=(priceSMS/priceDATA); 					//setting the ratio                                 
                ratio=mb*priceSMS;  						//computing the ratio between the sms price and the mb price                          
                pricePMB=ratio/CHAR_amount;	                                            
                im= (int) pricePMB; 						//computing the number of ims using the ratio and characters of ana sms
	}
	//method to output the number of ims to be sent
	public void userOutput(){
		System.out.println("IMs for the price of one SMS:"+im);		//outputs the number of ims
	}
	
		
	

}

