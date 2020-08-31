import java.io.*;
import java.util.*;
/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

This class converts any time given by the user to regular time. It also checks that the user entered time that exists e.g time within the 24 hour zone and 60 minutes zone, anything else will make the program throw an exception. 

*/
public class Time{
	int hours;						//sets hours
	int minutes;						//sets minutes
	int hourIn;						//sets hours in as a string
	int minuteIn;						//sets minutes in as a string
	String theTime;						//sets time 
	String initHour;					// extracts hour from time
	String initMinute;					//extracts minutes from time
	Scanner input=new Scanner(System.in);			//new scanner
	String AmPm="AM";					//sets the time of day
	
/**
This is an empty constructor. It sets minutes to zero and also hours to zero
*/
	public Time(){
		minutes=0;					//sets minutes to zero
		hours=0;					//sets hours to zero
	}
/**
This constructor has parameters 
@param hour which is the user's prefered hour
@param minute which is the user's prefered minute
*/	
	public Time(int hour,int minute){
		hours=hour;					//sets hours to the user's prefered hour
		minutes=minute;					//sets minutes to the user's prefered minutes
		//Convert();
		//System.out.println(hours+":"+minutes);
	}
/**
the set method for hours
@param h which is the user's prefered hour
*/	
	public void sethours(int h){
		hours=h;					//sets hours to user's prefered hours
	}
/**
the set method for minutes
@param m which is the user's prefered minutes
*/
	public void setminutes(int m){
		minutes=m;					//sets minutes to user's prefered minutes
	}
/**
the get method for hours
@return hours which returns the time hours
*/
	public int gethours(){

		return hours;					//returns hours
	}
/**
the get method for minutes
@return minutes which is te user's prefered minutes
*/	
	public int getminutes(){
		return minutes;					//returns minutes
	}
/**
This method does the convertion of time in string data type to time in two parts, with hours seperate from minutes and both converted to integer data types. An exception is also thrown in the class so as to chech that the time entered exist within the 24 hour zone and the 60 minutes zone.

*/	
	public void Convert() throws TimeFormatException {
		if(gethours()>=0 && gethours()<24 && getminutes()>=0 && getminutes()<=59){	//checks for zones
			if(hours>12 && hours<24){			//checks for the hours zones
			hours=hours%12;					//converts to regular
			AmPm="PM";					//sets day time to PM

			}
		
			else if(hours==24){		
				hours=0;				//hour at 24 = 0
			}
		

		}
		else {
			throw new TimeFormatException();		//throws an exception if time is wrong

		}
		

	}
/**
This method gets all the user inputs and checks for validity and also parse the strings to int
*/
	public void inputs(){
		
		//Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your time:  ");
		theTime=input.next();					//saves the user input to theTime
		if(theTime.length()==5){				//check that the lenght is 5
			initHour=theTime.substring(0,2);		//extracts hour from time
			hourIn=Integer.parseInt(initHour);		//parse hour to integer
			sethours(hourIn);				//sets hour
			
			initMinute=theTime.substring(3);		//extracts minutes from time
			minuteIn=Integer.parseInt(initMinute);		//parse mintes to integer
			setminutes(minuteIn);				//sets minutes 
		
		}
		else if(theTime.length()==4){				//check that the lenght is 4
			initHour=theTime.substring(0,1);		//extracts hour from time
			hourIn=Integer.parseInt(initHour);		//parse hour to integer
			sethours(hourIn);				//sets hour
			
			initMinute=theTime.substring(2);		//extracts minutes from time
			minuteIn=Integer.parseInt(initMinute);		//parse mintes to integer
			setminutes(minuteIn);				//sets minutes 
		}
		
	}
/**
This method runs the whole program. It also checks if the user wants to convert more than one time
*/	
	public void run() {
		
		
		//inputs();
		//Convert();
		//System.out.println("The converted time is: ");
		//System.out.println(gethours()+":"+getminutes());
		char exit='y';						//sets exit to y for yess
				
		while(exit=='y' || exit=='Y'){				//checks if the exit is yes or no
			inputs();					//evolks inputs()
			
			//Convert();
			try{						//error checking
				Convert();				//evolks convert()
			}catch(TimeFormatException e){
				System.out.println("There is no time as "+gethours()+":"+getminutes());
				System.exit(0);				//exits after encounting error
			}
			System.out.println("The converted time is: ");		//outputs
			System.out.println(gethours()+":"+getminutes()+AmPm);	//outputs the converted time
			System.out.println("Again? (y/n)");			//prompts the user for another time
			exit=(input.next()).charAt(0);				//exits
			
			
		}
	}
/**
This is the main method. It just just makes a new objects for the class and runs.
*/	
	public static void main(String[] args){
		
		
		Time now=new Time();					//new object for the class
		
		now.run();						//evolks run
	}










}
