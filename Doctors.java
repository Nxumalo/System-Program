public class Doctors extends Person
{
	private String speciality;
	private double visitFee;
	
	public Doctor()
	{
		super();
		speciality = "none";
		visitFee = 0;
	}
	
	public Doctor(String newName, String newSpeciality, double newVisitFee)
	{
		super(newName);
		speciality = newSpeciality;
		visitFee = newVisitFee;
	}
	
	public String getSpeciality()
	{
		return speciality;
	}
	
	public double getVisitFee()
	{
		return visitFee;
	}
	
	public void setSpeciality(String newSpeciality)
	{
		speciality = newSpeciality;
	}
	
	public void setFee(double newFee)
	{
		visitFee = newFee;
	}
	
	public void equals(Doctor doc)
	{
		if ((this.getName().equalsIgnoreCase(doc.getName()) == true) & (this.speciality.equalsIgnoreCase(doc.speciality) == true)
		& this.visitFee == doc.visitFee)
		{
			System.out.println("The two doctors are the same.");
		}
		
		else
		{
			System.out.print("The two doctors are NOT the same.");
			
			if ((this.getName().equalsIgnoreCase(doc.getName()) == true) & 
			(this.speciality.equalsIgnoreCase(doc.speciality) == true) & this.visitFee != doc.visitFee)
			{
				System.out.println(" The difference is their visit Fees.");
			}
			
			if ((this.getName().equalsIgnoreCase(doc.getName()) == true) & 
			(this.speciality.equalsIgnoreCase(doc.speciality) == false) & this.visitFee == doc.visitFee)
			{
				System.out.println(" The difference is their specialities.");
			}
			
			if ((this.getName().equalsIgnoreCase(doc.getName()) == false) & 
			(this.speciality.equalsIgnoreCase(doc.speciality) == true) & this.visitFee == doc.visitFee)
			{
				System.out.println(" The difference is their names.");
			}
			
			if ((this.getName().equalsIgnoreCase(doc.getName()) == false) & 
			(this.speciality.equalsIgnoreCase(doc.speciality) == false) & this.visitFee == doc.visitFee)
			{
				System.out.println(" The difference is their names and specialities.");
			}
			
			if ((this.getName().equalsIgnoreCase(doc.getName()) == false) & 
			(this.speciality.equalsIgnoreCase(doc.speciality) == true) & this.visitFee != doc.visitFee)
			{
				System.out.println(" The difference is their names and visit fees.");
			}
			
			if ((this.getName().equalsIgnoreCase(doc.getName()) == true) & 
			(this.speciality.equalsIgnoreCase(doc.speciality) == false) & this.visitFee != doc.visitFee)
			{
				System.out.println(" The difference is their specialities and visit fees.");
			}
			
			if ((this.getName().equalsIgnoreCase(doc.getName()) == false) & 
			(this.speciality.equalsIgnoreCase(doc.speciality) == false) & this.visitFee != doc.visitFee)
			{
				System.out.println(" They are completely different.");
			}
		}
	}	
	
	public void printOutput(Doctor doc)
	{
		System.out.println("The doctor is: " + doc.getName() + " and his Speciality is: " + doc.speciality + " and his visit fee is: " + doc.visitFee);
		
	}
		
}
