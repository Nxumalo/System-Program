//IMPORT STATEMENTS
import java.util.Scanner;
/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 09/12/2021<p>
*/
						
public class MobileCost2 {
/** <p>This program calculates the amount of IMs that can be send for the price of one SMS.<p>It asks the user to enter the price of one SMS and also the price of one MB. It then calculates the ratio between the two prices. It uses that ratio to compare the difference between the two prices and the uses the ration to calculate the number of IM's that can be send with that amount of an SMS.
    
*/
        public static void main(String args[]){
		//DECLARED VARIABLES
                double priceSMS,priceData,ratio,pricePmb; // Variables to store input prices, calculate ratio and the price per MB                
                int im,MB,CHAR_AMOUNT;
		CHAR_AMOUNT=140;   
		MB=1024*1024;                                              
		String inputSMS,inputMB,smsCOST,mbCOST;	// String variables to store input string price and modified string prices.
		//MAIN BODY                                         
                Scanner strINPUT=new Scanner(System.in);                   
                System.out.println("Cents per SMS,e.g. R0.80:");
                
                inputSMS=strINPUT.nextLine();                                     
                
                System.out.println("Rands per MB, e.g R1.50:");		
                
                inputMB=strINPUT.nextLine(); 					
		
		smsCOST=inputSMS.substring(1);      //Modifying the input to remove rand symbol                                 
		mbCOST=inputMB.substring(1);        //Modifying the input to remove rand symbol                                      

		priceSMS=Double.parseDouble(smsCOST); //converting the remaining string to double                        
		priceData=Double.parseDouble(mbCOST); //converting the remaining string to double                       
		
                priceSMS=(priceSMS/priceData);        //calculating the ratio between price per SMS and price per MB                          
                ratio=MB*priceSMS;                    //calculating the ratio between price per SMS and price per MB           
                pricePmb=ratio/CHAR_AMOUNT;	      //calculating the number of IM's in double data type                                       
                im= (int) pricePmb;   		      //coverting the IM's double data type to interger                                   
                System.out.println("IMs for the price of one SMS:"+im); //outputs the number of IM's for the price of an SMS 


            }
 

  }
