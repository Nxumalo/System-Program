import java.io.*;
/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>


This method calculates the days between dates basically.The user provides two dates and this methods works out the number of days from the initial date entered till the last day. 
*/
public class OurDate{

	public int dayOfMonth;				//sets the 
	public int month;
	public int year;
	public int daysbtween;
	
	public OurDate(){

		dayOfMonth=0;
		month=0;
		year=0;	
	}
	
	public OurDate(int y,int m,int d){
		dayOfMonth=d;
		month=m;
		year=y;
	}

	public void setDay(int day){
		dayOfMonth=day;
	}
	public void setMonth(int mon){
		month=mon;
	}
	public void setYear(int ye){
		year=ye;
	}

	public int getDay(){
		return dayOfMonth;
	}
		
	public int  getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}

	/**public void daysBtwn(OurDate otherDate){
		
	}*/

	public int numberOfDaysBetween(OurDate otherDate){
		int nod=0;
   		int[] monthEndValues;
		for (int a=getYear()+1;a<otherDate.getYear();a++){
			if(getYear()%4==0){
				monthEndValues=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		
			}
			else{
				monthEndValues=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
			}
			for(int i=0;i<monthEndValues.length;i++){
				nod=nod + monthEndValues[i];
	
			}
		}
		if (getYear()%4==0){
			monthEndValues=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
			int z = getMonth();
			int between=monthEndValues[z-1]-getDay();
			nod=nod+between;
			for(int q=getMonth()+1;q<12;q++){
				nod=nod+monthEndValues[q];
				//return nod;
			}				
		
		}
		else{
			monthEndValues=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
			int z = getMonth();
			int between=monthEndValues[z-1]-getDay();
			nod=nod+between;
			for(int q=getMonth()+1;q<12;q++){
				nod=nod+monthEndValues[q];
				//return nod;
			}	

		}
		if(otherDate.getYear()%4==0){
			monthEndValues=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
			int z = getMonth();
			int between=otherDate.getDay();
			nod=nod+between;
			for(int q=getMonth()+1;q<0;q--){
				nod=nod+monthEndValues[q];
				//return nod;
			}	
		}

		else{
			monthEndValues=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
			//int z = getMonth();
			int between=otherDate.getDay();
			nod=nod+between;
			for(int q=getMonth()+1;q<0;q--){
				nod=nod+monthEndValues[q];
				//return nod;
			}	
		}
	return nod;
	}
	public static void main(String[] args){
		OurDate dateOne= new OurDate(1967,12,31);
		OurDate dateTwo= new OurDate(2012,10,3);
		System.out.println(dateOne.numberOfDaysBetween(dateTwo));
	}
}
