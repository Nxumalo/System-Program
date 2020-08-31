public class MobileCost51Demo{
/** 
 The user will be asked to input the prices for an SMS and also for a MB. These values will be stored as strings. These string values will then be altered where the Rand symbol is removed from the string. After the symbol is removed, the values will be converted to double data types. THis will allow for calculations to be done. With these values, the ratio will be calculated which allows for the comparison between the two values. Since each kb has 1024 bytes , a MB will have 1024*1024 bytes. This will be used to calculate the price of SMS with the given MB. We will then use the ratio divided by the price of an SMS with the given MB to get the number of IM's but they will be in double data type. We will need to convert this to int. After converting, we will output the number of IM's to the screen.   
*/
	public static void main(String args[]){
		
		MobileCost51 mObject= new MobileCost51();
		
		mObject.userInputs();
		mObject.computeNumIMs();
		mObject.userOutput();
		
		
	}
}
