/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>
*/
/**
This code checks the doctors whether are the same or not, and then record the patient fee.
Its also checks even a single thing that is common between the doctors and tell the user.
*/
public class TestDoctors
{
	public static void main (String args[])
	{
		//Creating a polymorphic array.
		Doctor[] doc = new Doctor[5];
		doc[0] = new Doctor("Buyisile Nkwebana", "Physician", 50.0);/*Because its a polymorphic array, we are able to store information
															of different types.*/
		doc[1] = new Doctor("Buyisile Nkwebana", "Physician", 50.0);
		doc[2] = new Doctor("Yasse", "Gynae", 10.0);
		doc[3] = new Doctor("Yasser", "Gynae", 30.0);
		doc[4] = new Doctor("Sipho", "Optometrist", 85);


		doc[0].equals(doc[1]);/*The compute pay methods are invoked and the one that is used is specified by the "doc type"
								above*/
		doc[2].equals(doc[3]);
		doc[0].setName("Buyisile Only");
		doc[0].setSpeciality("Art");
		doc[0].printOutput(doc[0]);
			
	}
}
