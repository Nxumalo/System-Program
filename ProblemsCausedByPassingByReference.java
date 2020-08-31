import java.util.Scanner;

public class ProblemsCausedByPassingByReference
{
	// Illustrates the problem which may arise when passing by reference is used in your program
	// The problem is addressed by introducing a method that clones (creates a carbon copy of the original object)
	// -----------------------------------------------------------------------------------------------------------

	public void run()
	{	Dog dog1 = new Dog("Rover","Rotweiler");
		Dog dog2 = new Dog("Rex", "Alsation");
		Dog dog3 = new Dog("Lady", "Dalmation");

		System.out.println("\n\nBefore variable dog2 is re-assigned");
		System.out.println("dog1  : "+dog1);
		System.out.println("dog2  : "+dog2);
		System.out.println("dog3  : "+dog3);

		dog2 = dog3;		 // dog2 now refers to the same place in memory that dog3 is referring to!

		System.out.println("\n\nAfter variable dog2 has been re-assigned");
		System.out.println("dog1  : "+dog1);
		System.out.println("dog2  : "+dog2);
		System.out.println("dog3  : "+dog3);
		System.out.println("\n\nNote, dog2 refers now to dog3. Our handle on dog2 has been lost.");
		System.out.println("      all information regarding dog3 has been lost");
		
		dog2 = new Dog("Rex", "Alsation");	// recreate dog2 to original state

		Dog dog4 = dog3.clone();		// dog4 is now an identical copy of dog3

		dog4.setname("Bruno");			// now change the name of dog4

		System.out.println("\n\nAfter variable dog3 has been cloned and the name of dog4 changed we get,");
		System.out.println("dog1  : "+dog1);
		System.out.println("dog2  : "+dog2);
		System.out.println("dog3  : "+dog3);
		System.out.println("dog4  : "+dog4);		
		System.out.println();
		System.out.println("Note: While dog4's name differs from that of dog3, they are of the same breed");
	}

	private class Dog		// NB: A private class is used in this program so that all classes can be reflected in ONE Java file.
	{				//     Only one public class can be saved in a single Java file.
		String name;
		String breed;

		Dog()
		{	name = "no name";	
			breed = "no name";
		}	

		Dog(String nam, String brd)	// constructor
		{	name = nam;
			breed = brd;
		}
		
		public void setname(String nam)
		{	name = nam;
		}

		public String toString()
		{	return "Name : "+name+" and Breed : "+breed;
		}

		public Dog clone()	                    // creates a carbon copy of the original object by 
		{	String nam = this.name;             // accessing all attributes and reconstructing a different object
			String brd = this.breed;

			Dog carbonCopy = new Dog(nam, brd); // create a new object with the same attributes as that of the original

			return carbonCopy;	            // newly constructed object is returned
		}
	}

	public static void main(String[] args)
	{	ProblemsCausedByPassingByReference objct1 = new ProblemsCausedByPassingByReference();
		objct1.run();
	}
}