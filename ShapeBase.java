import java.io.*;
/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>


This class is a super class for two sub  classes , RightArrow and LeftArrow. It has methods which will be used by both classes and also some methods will be overridden. It has two contructs which accommodate for either no attributes or with attributes.
*/
public abstract class ShapeBase //implements ShapeInterface
{
    private int offset;							//sets offset
    public abstract void drawHere ();					//sets new abstract method which will be overidden
    
/**
This is the first contructor which takes no arguments
*/  
     public ShapeBase ()
    {
        offset = 0;							//sets offset to 0
    }

/**
This is the second constructor which takes the attribute for the offset
@param theOffset
*/
    public ShapeBase (int theOffset)
    {
        offset = theOffset;					//sets offset to theOffSet
    }

/**
The set method for offset
@param newOffset
*/
    public void setOffset (int newOffset)
    {
        offset = newOffset;					//sets the offset value to newOffset
    }

/**
the get method for the offset
@return offset
*/
    public int getOffset ()
    {
        return offset;						//returns offset
    }

/**
The drawing method
*param lineNumber
*/
    public void drawAt (int lineNumber)
    {
        for (int count = 0 ; count < lineNumber ; count++)
            System.out.println ();
        drawHere ();						//evolks drawHere
    }


   

    
}

 
