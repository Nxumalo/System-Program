import java.io.*;
/**

<p><b>Author:<b>  Fraser Nxumalo</p>
<p><b>Email:<b>   3538264@myuwc.ac.za</p>
<p>Programming assignment 4.4</p>
<P>Last edited 09/12/21</p>


This class is a subclass of ShapeBase class. It inherits methods from the super class and also overides some methodes. Its purpose however is to draw an arrow with a head facing the left direction. It has two constructors, two accessors and two mutators. The first constructor is to accomodate for no input and the second one is to accomodate with input. It takes in the number to set for the base of the arrow head, the lenght of the tail, the offset which tells it where to start drawing this arrow. It also takes in the lenght of the sides of the arrow head. This method is identical to the right arrow class except the way it draws.
*/
		
public class LeftArrows extends ShapeBase{

	public int tail;							//sets tail
	public int base;							//sets base
	public int counter;							//sets counter
	public int startOfLine = getBase();					//sets startOfLine
/**
This is the contructor which accomodates for no input from the user
sets tail lenght and base lenght to 0
*/	
	public LeftArrow(){
		super();
		tail=0;
		base=0;
		

	}
/**
This contructor takes in the offset, the tail lenght and  the base length. 
*/

	public LeftArrow(int theOffset,int initTail,int initBase){
		super(theOffset);
		tail=initTail;
		base=initBase;
		


	}
	
/**
This is the set method for setTail
@param tailLen which is the lenght of the tail
*/	public void setTail(int tailLen ){
		tail=tailLen;
		
	}
/**
The set method for the setBase
@param baselen which is the base length
*/	
	public void setBase(int baselen){
		base=baselen;

	}
/**
The get method for tail length
@return tail which is the tail length
*/
	public int getTail(){
		return tail;

	}
/**
The get method for Base length
@return base which is the base length
*/
	public int getBase(){
		return base;
		
	}
/**
This method evolks the methods drawtop, drawbase and drawbottom which allows for the arrow to be drawn when required length are provided.
*/
	public void drawHere (){                     
		     	  
		drawTop ();  							//evolks drawTop
		drawBase (); 							//evolks drawBase
		drawBottom();							//evolks drawBottom
		     
              
	      
    	}    
                  
	
   
/**
The drawBase method which draws the horizontal line or rather the tail of the arrow
*/	
	private void drawBase () {
		System.out.print('*');   					//draws		
		int last= getBase();						//sets last
		int pro=last;							//sets pro
		skipSpaces(pro+2);						//adjust spaces
		
        	
       		for (int count = 0 ; count < base ; count++){
        		System.out.print ('*');
             		
       		 }
		System.out.println();
		//counter=counter+startOfLine+4;
		//System.out.print('*');
		//System.out.println ();
		
		/**startOfLine=getBase();
		counter=counter+startOfLine;
		skipSpaces(counter+3);
		System.out.println('*');*/
		
	}
/**
This method draws the Top of the arrow head. 
*/
	public void drawTop(){
	 
        //startOfLine == number of spaces to the
        //first '*' on a line. Initially set to the
        //number of spaces before the topmost '*'.
       int startOfLine = getBase();//getOffset () + base / 2;			//sets startOfLine
        skipSpaces (startOfLine);						//adjust spaces
	//System.out.println(getBase());
	//System.out.println(startOfLine);
        System.out.println ('*'); //top '*'
        int lineCount = base / 2 - 1;						//height above base
        //insideWidth == number of spaces between the
        //two '*'s on a line.
        int insideWidth = startOfLine-2;					//sets the insidewidth
	int p=lineCount;							//sets temporary p
	counter=insideWidth;							//adjust counter
        for (int count =p  ; count > 0 ; count--)    
        {                                                    
            //Down one line, so the first '*' is one more    
            //space to the left. 
	    
	    
	                            
            startOfLine--; 							//decrement startOfLIne
	                                  
           // skipSpaces (startOfLine);                      
            //System.out.print ('*');                          
            skipSpaces (insideWidth);                        			//adjust insidewidth
            System.out.println ('*');           				//draws             
           // Down one line, so the inside is 2 spaces wider.
            insideWidth = insideWidth -2;  					//adjust inside width
	    counter=counter+2;         						//increment counter by 2        
        }                                                    
       }
/**
This method draws the bottom  of the arrow head.
*/
	public void drawBottom(){
		 int startOfLine = 2;						//sets the startOfLine to 2
        	 skipSpaces (startOfLine);					//adjust spaces
		 //System.out.println(getBase());
		//System.out.println(startOfLine);
        	System.out.println ('*'); //top '*'				//draws
        	int lineCount = base / 2 - 1; 					//height above base
        	//insideWidth == number of spaces between the
        	//two '*'s on a line.
        	int insideWidth = 1;						//sets inside witdth to 1
		counter=insideWidth;						//sets counter to 1
        	for (int count = 0 ; count < lineCount ; count++)    
        	{                                                    
        	    //Down one line, so the first '*' is one more    
        	    //space to the left. 
		   
		    //int k=startOfLine;
		                            
        	    startOfLine++; 
		                                  
        	    skipSpaces (startOfLine);      				//adjust spaces                
        	    //System.out.print ('*');                          
        	    skipSpaces (insideWidth);                        		//adjust spaces
        	    System.out.println ('*');                        		//draws
        	   // Down one line, so the inside is 2 spaces wider.
        	    insideWidth = insideWidth + 2;  				//adjust insides width
		    counter=counter+2;                 				//increment ounter
        	}  
		System.out.println();                                                  
       	}

/**
This method sets the skip spaces which skips spaces required by user
*/	
       private static void skipSpaces (int number){
      
        	for (int count = 0 ; count < number ; count++){
              	  	System.out.print (' ');
      		 }	
      }

}
