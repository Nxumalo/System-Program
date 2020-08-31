public class Save3{
	public double savingsRate;
	public double savingsHorison=0;
	public double savings;
	public double lowR=0;
	public double medR=0;
	public double highR=0;
	public double lowRisk;
	public double mediumRisk;
	public double highRisk;
	public double low=0;
	public double med=0;
	public double high=0;
	public double total=0;
	public int years;
	public int period=0;
	public int months=12;
	public int save=0;
	public String s="%";
	public int n;
	
	
	public void setINVEST(double invest){
		savingsRate=invest;
	}	
	public double getINVEST(){
		return savingsRate;
	}
	
	public void setLOWrisk(double l){
		lowR=l;
	}

	public double getLOWrisk(){
		return lowR;
	}

	public void setMEDrisk(double m){
		medR=m;
	}

	public double getMEDrisk(){
		return medR;
	}
	
	public void setHIGHrisk(double h){
		highR=h;
	}
	
	public double getHIGHrisk(){
		return highR;
	}

	
	public void saveInput(){

		savings=TaxAndSaveDemo3.salary*(getINVEST()/100);
		save=(int) getINVEST();
		/**
		System.out.println("Enter percentage of monthly salary to invest, e.g. 25%:");
		
		savingsRate=TaxAndSaveDemo3.Str_input.nextDouble();
		savings=TaxAndSaveDemo3.salary*(savingsRate/100);
		save=(int) savingsRate;
		System.out.println("Enter number of years to invest, e.g. 5:");
		years=TaxAndSaveDemo3.Str_input.nextInt();

		while(savingsHorison!=100){
			System.out.println("Enter percentage to invest in low risk:");
			lowR=TaxAndSaveDemo3.Str_input.nextDouble();
			System.out.println("Enter percentage to invest in medium risk:");
			medR=TaxAndSaveDemo3.Str_input.nextDouble();
			System.out.println("Enter percentage to invest in high risk:");
			highR=TaxAndSaveDemo3.Str_input.nextDouble();
			savingsHorison=lowR+medR+highR;
			if(savingsHorison!=100){
				System.out.println("Please make sure the percentages add up to 100%");
			}
		}
	}
	*/
	}
	public void saveCalculation(){

		lowRisk=(getLOWrisk()/100)*savings;
		mediumRisk=(getMEDrisk()/100)*savings;
		highRisk=(getHIGHrisk()/100)*savings;
			
		years=TaxAndSaveDemo3.yearS;
		period=TaxAndSaveDemo3.yearS*months;
		
		low=lowRisk;
		med=mediumRisk;
		high=highRisk;
		for(n=1;n<years;n++){
			lowRisk=low+(lowRisk+((0.75/100)*lowRisk));
			mediumRisk=med+(mediumRisk+((1.0/100)*mediumRisk));
			highRisk=high+(highRisk+((1.25/100)*highRisk));
			
			}
		total=lowRisk+mediumRisk+highRisk;
	}
	public void saveOutput(){
		System.out.printf("After saving %d%s for %d years \n",save,s,years);
		System.out.printf("Low risk yield is %.2f \n",lowRisk);
		System.out.printf("Medium risk yield is %.2f\n",med);
		System.out.printf("High risk yield is %.2f \n",high); 
		System.out.printf("Total yield is %.2f \n",total);
	}
   }
 

