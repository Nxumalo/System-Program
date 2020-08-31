import java.io.*;
import java.util.*;

public class Ragged{

	int[][] arr;
	int maxRows=9;

	public void run(){
		create();
		storeValues();
		display();	
	}
	
	public void create(){
		arr=new int[maxRows+1][];
		for(int row=0;row<maxRows;row++){
			arr[maxRows]=new int[row+1];
		}
	
	}
	
	public void storeValues(){
		for (int row=0;row<maxRows;row++){
			for(int col=0;col<arr[row].length;col++){
				if((col==0) || (col==row)){
					arr[row][col]=1;
				}
				else{
					arr[row][col]=arr[row-1][col-1]+arr[row-1][col];	
			
	
				}
	
			}
	
		}	
	
	
	}
	
	public void spaces(int num,int maxRows){
		int noOfTabs=maxRows-num;
		for(int k=0;k<noOfTabs;k++){
			System.out.print("\t");
		}
		
	}

	public void display(){	
		for(int i=0;i<maxRows;i++){
			spaces(i,maxRows);
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	
	}
	
	public static void main(String[] args){
		Ragged a=new Ragged();
		a.run();
		
	}



















}
