import java.util.Scanner;
/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

<h1>Calculating tax due to SARS</h1>

<p>This program asks for the person's age and monthly salaries. It uses this information to calculate their net anual tax due to SARS.It only considers tax of individual monthly salaries....all other deductions are not considered in this programme.
*/

public class TaxAndSaveDemo3{
/**
This program asks for the person's age and monthly salaries. It uses this information to calculate their net anual tax due to SARS. It asks for the salary and stores it as a string data type. It converts the string type salary to a interger type which it then uses to calculatethe user's annual salaryIt then evaluates the user's age and their corresponding salaries....if the user qualifies for tax, the programme then evaluates the users annual salary. It groups the salary in accordance to the salary amount and which tax deduction system it falls under. It then calculates the tax, subtract the corresponding rebates. It also calculates the ratio of the final tax with the user's salary then outputs the user's annual salary and actaul net tax the user pay. It then asks the user to save some of their salary but in three different option accounts (low,medium and high) risks.It the projects into the future to calculate the net savings of the user for the user's favourable period of time given their salary remains.

*/
	public static int salary;
	public static int salaryout;
	public static String investIN;
	public static int investOUT;
	public static String lowIN;
	public static int lowOUT;
	public static String medIN;
	public static int medOUT;
	public static String highIN;
	public static int highOUT;
	public static int yearS;


	public static void main(String args[]){
		
		
		
		
		Tax3 tax3Object=new Tax3();	//sets the object for claa Tax3
		Save3 save3Object=new Save3();	//sets the objecdt for class Save3
		Util util3Object=new Util();	//sets the objecdt for class utils
		//tax3Object.userInput();		//evolks the user input in class Tax3
		util3Object.stripCurrency();	//evolks the method stripCurrency in class utils
		tax3Object.convert();		//evolks the method convert in class Tax3
		tax3Object.salaryTAX();		//evolks the method salaryTAX in class Tax3
		tax3Object.switchREBATE();	//evolks the method switchREBATE in class Tax3
		tax3Object.computeTAX();	//evolks the method computeTAX in class Tax3
		tax3Object.userOutput();	//evolks the method userOutput in class Tax3
		util3Object.stripPercSymbol();	//evolks the method StripPercSymbol in class Utils
		save3Object.setINVEST(investOUT);// set the invest percent to investOUT in method SaVE3
		save3Object.setLOWrisk(lowOUT);	//sets the low risk percentage to lowOUT in class Save3
		save3Object.setMEDrisk(medOUT); //sets the medium risk percent to medOUT in class Save3
		save3Object.setHIGHrisk(highOUT); //sets the high risk percent to highOUT in class Save3
		save3Object.saveInput();	  //evolks the method saveInput in class Save3

		save3Object.saveCalculation();	//evolks the method saveCalculation in class Save3
		save3Object.saveOutput();	//evolks the method saveOutput in class Save3
	}

public static final Scanner Str_input = new Scanner(System.in); //sets a public scanner which is static and can be used throught all classes in the project
}
