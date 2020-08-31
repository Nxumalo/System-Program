import java.util.Scanner;

//  Some information about the format of my programs
//  You will notice that my programs all contain the static main method
//  The main method is not strictly part of a class and for this reason
//  I tend to merely use it to create an instance of the class that I am
//  defining. 
//  In the example below an object of the AboutMyPrograms class is created and
//  named 'objct1'. Once an abject is created it needs to do something.
//  In many of my programs I use a method called 'run' just to put the
//  ball into motion. All relevant methods are then called or invoked in the
//  'run' method. In the example below, doThis() and thenDoThat() are invoked 
//  in 'run'. 
//  Using this approach, I can easily convert my program to
//  a "proper class", by merely removing the static main method from the 
//  java file.
//  

public class AboutMyPrograms
{	
	int value;

	AboutMyPrograms()
	{	value = 0;
	}
	
	public void run()
	{	System.out.println("\n\n\n Now executing the 'run' method");
		doThis();
		thenDoThat();	
	}

	public void doThis()
	{	System.out.println("Now executing the 'doThis' method");
	}

	public void thenDoThat()
	{	System.out.println("Now executing the 'thenDoThat' method");
	}

	public static void main(String[] args)
	{
		AboutMyPrograms objct1 = new AboutMyPrograms();
		objct1.run();
	}
}