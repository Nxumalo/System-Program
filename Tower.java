import java.util.Scanner;

public class Tower{
	
	public static void tower(int n,char A, char B, char C){
			
			if(n==1){
				
				System.out.println("Move "+A+" to "+B);
				
			}
			else{
				tower(n-1,A,C,B);
				System.out.println("Move "+A+" to "+C);
				tower(n-1,C,B,A);

			}

	}
	public static void main(String[] args){
		tower(3,'R','P','Q');
		
	}




}
