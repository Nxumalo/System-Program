import java.io.*;
public class Doct extends Person{

	public String specialty;
	public String officeHours;

	public Doctor(){
		super();
		specialty="No mentioned specialty";
		officeHours="No hours yet";
	}
	
	public Doctor(String Dname,String SP,String InOffice){
		super(Dname);
		specialty=SP;
		officeHours=InOffice;


	}

	public void newDoctor(String initName,String Specialize,String officeIN	){
		setName(initName);
		
	}
	public void setSpecial(String Nname){
		specialty=Nname;
	}

	public void setofficeHours(String InOffc){
		officeHours=InOffc;
	}
	public String getSpecialty(){
		return specialty;
	}
	
	public String getOfficeHours(){
		return officeHours;
	}

	public void writeOutput ()
    	{
		
        	System.out.println("Doctor's name: " + getName());
		System.out.println("Doctor's Specialty: "+ getSpecialty());
		System.out.println("Doctor's office hours: "+ getOfficeHours());
		System.out.println("");
		System.out.println("----------------------------------------------------------------------");
    	}


}
