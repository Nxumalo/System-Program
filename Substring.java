import java.util.Scanner;
public class Substring{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the student name and surname");
		String nameAndSurname = input.nextLine();
		
		int nameAndSurnameLength = nameAndSurname.length();
		int spaceIndex = nameAndSurname.indexOf(" ");
		
		String name = nameAndSurname.substring(0,spaceIndex);
		String surname = nameAndSurname.substring(spaceIndex,nameAndSurnameLength);
		
		System.out.printf("the name is %s and the surname is %s \n",name,surname);
	}
}