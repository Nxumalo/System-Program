import java.util.*;
import java.io.*;

public class Sieve{

	public static void main(String[] args){
	
		ArrayList<Integer> prime=new ArrayList<Integer>();
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the limit 0f primes");
		int limit=input.nextInt();
		
		boolean[] isComposite=new boolean[limit+1];
		isComposite[1]=true;
	
		for(int i=2;i<limit;i++){
			if(!isComposite[i]){
				prime.add(i);
				int multiplier=2;
				while(i*multiplier<limit+1){
					isComposite[i*multiplier]=true;
					multiplier++;
				}
	
			}
	
		}
		for(int k=0;k<prime.size();k++){
			System.out.println(prime.get(k));
	
		}
	
	
}


}
