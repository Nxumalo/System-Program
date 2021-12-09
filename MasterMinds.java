import java.util.*;
import java.io.*;


public class MasterMinds{
	Scanner input = new Scanner(System.in); 
	int[] solution = new int[4];
	int[] copySolu = new int[4];
	int[] userResp = new int[4];

	public void genUser(){
		
		String colour=new String();

		for(int i=0;i<4;i++){
			System.out.println("Enter peg"+i+">>>");
			colour=input.next().trim().toUpperCase();
			userResp[i]=convertToInt(colour);

		}

	}
	
	public String convertToString(int colour){
		String colourS="";

		if(colour==1){
			colourS="GREEN";
		}
		else if(colour==2){
			colourS="BLUE";

		}
		
		else if(colour==3){
			colourS="YELLOW";

		}

		else if(colour==4){
			colourS="RED";

		}

		return colourS;
	}
	
	public int convertToInt(String colour){

		int num=1;
		if(colour.equals("GREEN")){
			num=1;

		}

		else if(colour.equals("BLUE")){
			num=2;

		}
		
		else if(colour.equals("YELLOW")){
			num=3;

		}

		else if(colour.equals("RED")){
			num=4;

		}

		return num;	
	}

	public void copySolution(){
		for(int i=0;i<4;i++){
			copySolu[i]=solution[i];

		}

	}
		
	public void generateSolution(){
			int colour;
			for(int i=0; i<4; i++){
				colour=(int) (1+Math.random()*4.0);
				solution[i]=colour;		//convertToString(colour);
			}
	
	}

	public void display(){
	
		for(int i=0; i<4;i++){
			System.out.println(convertToString(Solution[i]));
	
		}	
	
	}

	public int calculateBlack(){
		int count=0;
		for(int i=0; i<4; i++){
			if(copySolu[i]==userResp[i]){
				count=count+1;
				//userResp[i]=-1;
				copySolu[i]=-1;
				userResp[i]=-4;
			}
		
		}

		return count;
	}

	public int calculateWhite(){
		int count=0;
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				if(copySolu[i]==userResp[j]){
					count=count+1;
					copySolu[i]=-2;
					userResp[j]=-4;
					//copySolu[i]=-2;
					break;
				}

			}


		}
		return count;
	
	}

	public void run(){
	
		final int maxChances=10;
		int chances=0,noOfBlack=0,noOfWhite=0;

		generateSolution();
		/**genUser();
		for(int k=0;k<4;k++){
			System.out.println(userResp[k]);
	
		}*/
		do{
			genUser();
			copySolution();
			//noOfWhite=calculateWhite();
			noOfBlack=calculateBlack();
			noOfWhite=calculateWhite();
			System.out.println("Black pegs: "+ noOfBlack );
			System.out.println("White pegs : "+ noOfWhite );



		}while((noOfBlack !=4) && (chances<maxChances));
			
		display();
	
	}
	
	public static void main(String[] args){
		MasterMind a = new MasterMind();
		a.run();


	}




}
