public class Util{
	

	private static String salaryIn;
	private static String salaryOut;
	private String invest;
	private String low;
	private String high;
	private String med;
	private int savingsHorison;
	
	

	public static void stripCurrency(){
		salaryIn=Tax3.getSalary();
		salaryOut=salaryIn.replace("R","");
		TaxAndSaveDemo3.salary=Integer.parseInt(salaryOut);
		
		

	}
	public static String strippedR(){
		return salaryOut;
	}
	public void stripPercSymbol(){
		System.out.println("Enter percentage of monthly salary to invest, e.g. 25%:");
		//savingsRate=TaxAndSaveDemo3.Str_input.nextDouble();
		TaxAndSaveDemo3.investIN=TaxAndSaveDemo3.Str_input.next();
		invest=TaxAndSaveDemo3.investIN.replace("%","");
		TaxAndSaveDemo3.investOUT=Integer.parseInt(invest);
		//savings=TaxAndSaveDemo3.salary*(savingsRate/100);
		//save=(int) savingsRate;
		System.out.println("Enter number of years to invest, e.g. 5:");
		TaxAndSaveDemo3.yearS=TaxAndSaveDemo3.Str_input.nextInt();

		while(savingsHorison!=100){
			System.out.println("Enter percentage to invest in low risk:");
			//lowR=TaxAndSaveDemo3.Str_input.nextDouble();
			TaxAndSaveDemo3.lowIN=TaxAndSaveDemo3.Str_input.next();
			low=TaxAndSaveDemo3.lowIN.replace("%","");
			TaxAndSaveDemo3.lowOUT=Integer.parseInt(low);
			System.out.println("Enter percentage to invest in medium risk:");
			//medR=TaxAndSaveDemo3.Str_input.nextDouble();
			TaxAndSaveDemo3.medIN=TaxAndSaveDemo3.Str_input.next();
			med=TaxAndSaveDemo3.medIN.replace("%","");
			TaxAndSaveDemo3.medOUT=Integer.parseInt(med);
			System.out.println("Enter percentage to invest in high risk:");
			//highR=TaxAndSaveDemo3.Str_input.nextDouble();
			TaxAndSaveDemo3.highIN=TaxAndSaveDemo3.Str_input.next();
			high=TaxAndSaveDemo3.highIN.replace("%","");
			TaxAndSaveDemo3.highOUT=Integer.parseInt(high);
			//savingsHorison=lowR+medR+highR;
			savingsHorison=TaxAndSaveDemo3.lowOUT+TaxAndSaveDemo3.medOUT+TaxAndSaveDemo3.highOUT;
			if(savingsHorison!=100){
				System.out.println("Please make sure the percentages add up to 100%");
			}
		}
	}

	
}
