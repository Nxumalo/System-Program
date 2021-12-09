import java.util.*;
import java.io.*;


public class Magic{

	int number = 1;
	int[][] square;
	int row,col;
	int size;

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
		row=0;
		col=size/2;

		square[row][col]=number;

	}
	public void placeOthers(){
		while(number<size*size){
			do{
				number=number+1;
				//System.out.println(number);
				row=((row-1)+size)%size;
				col=((col-1)+size)%size;
				square[row][col]=number;
	
			}while(!((number%size)==0));
			if(number!=size*size){
				number++;
				row=(row+1)%size;
				square[row][col]=number;
			}

		}
	
	}

	public void display(){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(square[i][j]+"\t");
			}
			System.out.println();
		}
			
	}
	public static void main(String[] args){
		Magic a = new Magic();
		a.run();

	}


}
