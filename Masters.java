import java.util.*;
import java.io.*;

public class Masters{

	int[] solution=new int[4];
	int[] copySolu=new int[4];
	int[] user=new int[4];

	public void getUser(){
		Scanner input=new Scanner(System.in);
		String color=new String();
		for(int i=0;i<4;i++){
			System.out.println("Please enter color peg"+(i+1)+">>>>>");
			color=input.nextLine().trim().toUpperCase();
			user[i]=convertInt(color);
			
	
		}
	
	
	
	}
	
	public int convertInt(String aColor){
		int result=1;
		if(aColor=="GREEN"){
			result=1;
	
		}
		else if(aColor=="BLUE"){
			result=2;

		}
		else if(aColor=="YELLOW"){
			result=3;
		}
		else if(aColor=="RED"){
			result=4;
		}
		return result;

	}
	
	public String convertString(int aColor){
		String result="";
		if(aColor==1){
			resut="GREEN";
		}
		else if(aColor==2){
			result="BLUE";
		}
		else if(aColor==3){
			result="YELLOW";
		}
		else if(aColor==4){
			result="RED";
		}
		return result;	
	}

	public void genSolu(){
		for(int i=0;i<4;i++){
			solution[i]=(int)(1+Math.random()*4);
		}

	}
	
	public void copy(){
		for(int i=0;i<4;i++){
			copySolu[i]=solution[i];
		}
	
	}
		
	public int BlackP(){
		int counter=0;
		for(int i=0;i<4;i++){
			if(user[i]==copySolu[i]){
				counter++;
				copySolu[i]=-1;
				user[i]=-4;	
			}
		}
		return counter;
	}
	
	public int WhiteP(){
		int counter=0;
		
		for(int i=0;i<4;i++){
		
			for(int j=0;j<4;j++){
				if(user[i]==copySolu[j]){
					counter++;
					user[i]=-4;
					copySolu[j]=-2;
				}	
			
			}
		}
		return counter;
	}


	public void display(){
		for(int k=0;k<4;k++){
			System.out.println(convertString(solution[k]));

		}
	
	}

	public void run(){
		int maxChances=10;
		int chances=0;
		int noOfblack=0;
		int noOfwhite=0;
		
		do{
			genSolu();
			copy();
			getUser();
			noOfblack=BlackP();
			
			System.out.println("Black: "+noOfblack);
			noOfwhite=WhiteP();
			System.out.println("White: "+noOfwhite);
			

		}while((noOfblack!=4)&&(chances<maxChances));
	
	}
	
	public static void main(String[] args){
		Master a=new Master();
		a.run();

	}



}
