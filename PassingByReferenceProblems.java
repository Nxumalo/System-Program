import java.util.Scanner;

public class PassingByReferenceProblems
{
	// Illustrates the problem which may arise when passing by reference is used in your program
	// -----------------------------------------------------------------------------------------

	public void run()
	{	Dog dog1 = new Dog("Rover","Rotweiler");
		Dog dog2 = new Dog("Rex", "Alsation");
		Dog dog3 = new Dog("Lady", "Dalmation");

		System.out.println("\n\nBefore variable dog2 is re-assigned");
		System.out.println("dog1  : "+dog1);
		System.out.println("dog2  : "+dog2);
		System.out.println("dog3  : "+dog3);
		dog2 = dog3;					// dog2 now refers to the same place in memory that dog3 is referring to!
		System.out.println("\n\nAfter variable dog2 has been re-assigned");
		System.out.println("dog1  : "+dog1);
		System.out.println("dog2  : "+dog2);
		System.out.println("dog3  : "+dog3);
		System.out.println("\n\nNote, dog2 refers now to dog3. Our handle on dog2 has been lost.");
		System.out.println("      all information regarding dog3 has been lost");
		
		dog2 = new Dog("Rex", "Alsation");	// recreate dog2 to original state
		Dog dog4 = dog3;
		dog4.setname("Bruno");
		System.out.println("\n\nAfter variable dog3 has been cloned and name of dog4 has been changed");
		System.out.println("dog1  : "+dog1);
		System.out.println("dog2  : "+dog2);
		System.out.println("dog3  : "+dog3);
		System.out.println("dog4  : "+dog4);		
		System.out.println();
	}

	private class Dog		// NB: A private class is used in this program. 
	{				//     Only one public class is allowed in Java.
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

		public Dog clone(Dog original)	        // creates a carbon copy of the original object by 
		{	String nam = original.name;     // accessing all attributes and reconstructing a different object
			String brd = original.breed;
			Dog carbonCopy = new Dog(nam, brd);
			return carbonCopy;		// newly constructed object is returned
		}
	}

	public static void main(String[] args)
	{	PassingByReferenceProblems objct1 = new PassingByReferenceProblems();
		objct1.run();
	}
}