
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>
import java.util.Scanner;
public class countBase{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the base number: ");
		int n = input.nextInt();
		int total = 0;
		for (int i = 0; i <= n; i ++){
			total = (int)(Math.pow(n, i) - 1);
			System.out.println("Ans : " + total);	
		}
	}
}