import java.util.*;
import java.io.*;

public class MagicTrick{

	int size;
	int [][] square;
	int row,col;
	int number=1;

	public void run(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of square.");
		size=input.nextInt();

		square=new int[size][size];
		placeFirst();
		placeOthers();
		display();
		
	}
	public void placeFirst(){
		int len=size/2;
		row=0;
		col=len;
		square[row][col]=number;
	
	}

	public void placeOthers(){
		while(number<=size*size){
			do{
				number=number+1;
				row=((row-1)+size)%size;
				col=((col-1)+size)%size;
				square[row][col]=number;
	
			}while(!(number%size==0));
			if(number!=size*size){
				number=number+1;
				row=(row+1)%size;
				square[row][col]=number;
	
			}
	
	
		}


	}

	public void display(){
		for(int r=0;r<size;r++){
			for(int c=0;c<size;c++){
				System.out.print(square[r][c]+"\t");
			}	
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void main(String[] args){
		Magic a=new Magic();
		a.run();	
		
	}










}
