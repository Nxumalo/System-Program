import java.util.Scanner;
public class CalculatingTax{
	
	public static double taxBeforeRebat = 0.0;
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		CalculatingTax output = new CalculatingTax();
		
		//the input inforamtion
		
		System.out.print("enter the income :");
		String stringMonthlyIncome = input.nextLine();
		int dot = stringMonthlyIncome.indexOf(".");
		int comma = stringMonthlyIncome.indexOf(",");
		String subStringIncome = "";
		
		if (dot != -1){
			if (stringMonthlyIncome.charAt(0) == 'R' && stringMonthlyIncome.charAt(dot) == '.') subStringIncome = stringMonthlyIncome.substring(1,dot);
		}
		else if (stringMonthlyIncome.charAt(0) == 'R' && stringMonthlyIncome.charAt(comma) == ',') subStringIncome = stringMonthlyIncome.substring(1,comma);
		
		double monthlyIncome = Double.parseDouble(subStringIncome);
		System.out.println(monthlyIncome);
		
		System.out.print("enter the age :");
		int age = input.nextInt();
		
		//calling the methods
		System.out.println("the final tax :" + output.calculatingTaxIncome(age, monthlyIncome));
	}
	
	public double calculatingTaxIncome(int age, double monthlyIncome){
		double annualIncome = (monthlyIncome * 12);
		
		if(annualIncome <= 165600)  taxBeforeRebat = (0.18 * annualIncome);
		
		else if(annualIncome > 165600 && annualIncome < 258750) taxBeforeRebat = (29808 + (0.25 * (annualIncome - 165600)));
		
		else if(annualIncome > 258750 && annualIncome < 358110) taxBeforeRebat = (53096 + (0.30 * (annualIncome - 258750)));
		
		else if(annualIncome > 358110 && annualIncome < 500940) taxBeforeRebat = (82904 + (0.35 * (annualIncome - 358110)));
		
		else if(annualIncome > 500940 && annualIncome < 638600) taxBeforeRebat = (132894 + (0.38 * (annualIncome - 500940)));
		
		else if(annualIncome > 638600) taxBeforeRebat = (182205 + (0.40 * (annualIncome - 638600)));
		
		return taxBeforeRebat;
	}
	
	public double taxAfterRebat(int age, double monthlyIncome){
		double compareTaxAgeAndIncome = 0.0;
		double annualIncome = (monthlyIncome * 12);
		int primary = 12080;
		int additional = 6750;
		int tertiary = 2250;
		
		if (age < 65 && annualIncome <= 67111) return 0;
		
		else if(age < 65 && annualIncome > 67111) compareTaxAgeAndIncome = (taxBeforeRebat - primary);
		
		else if ((age >= 65 && age < 75) && (annualIncome <= 104611)) return 0;
		
		else if((age > 65 && age < 75) && (annualIncome > 104611)) compareTaxAgeAndIncome = (taxBeforeRebat - (primary + additional));
		
		else if (age >= 75 && annualIncome <= 117111) return 0;
		
		else if (age >= 75 && (annualIncome > 117111)) compareTaxAgeAndIncome = (taxBeforeRebat - (primary + tertiary));
		
		return compareTaxAgeAndIncome;
	}
}
