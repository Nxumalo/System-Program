import java.io.*;

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Programming assignment 4.4<p>
<p>Last modified: 09/12/2021<p>

This is a sub class for class person. It prints out the doctors at a hospital with their respective specialties. It has two constructors. One which takes no parameters and one which does. It has methods that will be ovrriden by its sub class.

*/
public class Doctor extends Person{

	public String specialty;						//sets specialty
	public String officeHours;						//sets office hours
/**
constructor for no parameters
*/
	public Doctor(){
		super();				//evolks the super class 				
		specialty="No mentioned specialty";			//sets the specialty to No mentioned specialty
		officeHours="No hours yet";				//sets the office hours to No hours yet
	}
/**
This is the constructor which has parameters
@param Dname for doctors name
@param SP for specialty
@param InOffice for office hours
*/	
	public Doctor(String Dname,String SP,String InOffice){
		super(Dname);						//calls the super class with its Doctors name
		specialty=SP;						//sets specialty to SP
		officeHours=InOffice;					//sets officeHours to InOffice


	}
/**
This is the set method for doctor which is inherited from the super class
@param initName which is the name of the doctor

*/
	public void newDoctor(String initName){ //,String Specialize,String officeIN	){
		setName(initName);					//sets the name to initNmae
		
	}
/**
This is the set method for the specialty
@param Nname which is the specialty name
*/
	public void setSpecial(String Nname){
		specialty=Nname;					//sets specialty to Nname
	}
/**
This is the set method for office hours
@param InOffc which is the time in office for the doctor
*/
	public void setofficeHours(String InOffc){
		officeHours=InOffc;					//sets officeHours to InOffc
	}
/**
This is the get method for Specialty 
@return specialty 
*/
	public String getSpecialty(){
		return specialty;					//return specialty
	}
/**
This is he get method for office hours
@return officeHours
*/	
	public String getOfficeHours(){
		return officeHours;
	}

/**
This method overrides the one in the supre class. It prints out the doctor's name ,specialty and office hours in order
*/
	public void writeOutput ()
    	{
		System.out.println("----------------------------------------------------------------------");
        	System.out.println("Doctor's name: " + getName());
		System.out.println("Doctor's Specialty: "+ getSpecialty());
		System.out.println("Doctor's office hours: "+ getOfficeHours());
		System.out.println("");
		System.out.println("----------------------------------------------------------------------");
    	}

	public boolean hasSameName (Doctor otherDoctor){
    
        	return this.name.equalsIgnoreCase (otherDoctor.name);
    	}	




}
