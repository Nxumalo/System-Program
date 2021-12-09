import java.io.*;
import java.util.Scanner;

public class Sentinell{
	
	int len;
	String sentence;
	int counter1;
	int counter2;
	int count;
	String focall;
	char focal;
	int [] letterNos={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	char [] letter={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};



	public void run(){
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a sentence of preference and end with a full stop.: ");
		//boolean fullstop=false;
	
		sentence=input.next();
	
		len=sentence.length();
		
	 		counter1=0;
			counter2=1;
			count=0;
			sentence=sentence.replace(" ","1");
			focall=sentence.substring(counter1,counter2);
			focal=focall.charAt(0);
			do{
				for(int i=0;i<25;i++){
					if(focal==letter[i]){
						letterNos[i]=letterNos[i]+1;
						counter1++;
						counter2++;
						focall=sentence.substring(counter1,counter2);
						focal=focall.charAt(0);
						//System.out.println(focal);
						
					}

				}




			}while(counter2<len);
			for (int a=0;a<26;a++){
				System.out.println(letterNos[a]+ "\t" + letter[a]);
			}
	}
	
	public static void main(String[] args){
		sentinel a=new sentinel();
		a.run();
	}






}
