import java.util.Scanner;

public class ForLoops
{

	public void run()
	{
		//  two variables i and j are initialized and incremented 
		//  note the placement of the semi-colons and also not the 
		//  placement of the commas that separate the initialization 
		//  and the adjustment of variables i and j

		for( int i=0, j=10; i<10;  i=i+1, j= j+ 2)  
			System.out.println("i = "+i+ " j = "+j);
	}
	
	public static void main(String[] args)
	{	ForLoops objct1 = new ForLoops();
		objct1.run();
	}
}