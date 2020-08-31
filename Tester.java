import java.io.*;
/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>


This method contains the mai method to test my class for drawing the arrows.
*/
public class Tester{

	public static void main(String[] args){
		ShapeBase[] s=new ShapeBase[5];					//new array for class ShapeBase


		s[0]=new RightArrow(2,4,8);					//RightArrow at index 0
		s[0].drawHere();						//evolks drawhere in RightArrow
		s[1]=new LeftArrow(5,5,9);					//LeftArrow at index 1
		s[1].drawHere();						//evolks the drawHere in leftArrow


		


	}





}
