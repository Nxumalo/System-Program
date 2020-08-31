import java.util.*;
/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

This class creates the nodes which will be used in stacks. It also creates the links to the nodes and has methods which gets data and links of the nodes.
*/

public class SNodeInteger{
	
    private Integer data;						//sets new data of Integer type
    private SNodeInteger link;						//sets new link of SNodeInteger type
/**
This is the constructor with no arguments of the class. It sets the instance variables to null
*/
    public SNodeInteger ()
    {
        link = null;							//sets link to null
        data = null;							//sets data to null
    }
/**
This is the constructor with parameters.It sets data to user's prefered data as well as link
@param newData which is the user's prefered data to stck
@param linkvalue which is the link to the data
*/
    public SNodeInteger (Integer newData,SNodeInteger linkValue)
    {
        data = newData;							//sets data to new data
        link = linkValue;						//sets link
    }
/**
This is the set method for the class
@param newData which is the data to set to data
*/
    public void setData (Integer newData)
    {
        data = newData;							//sets data
    }
/**
This is the get method for the data
@return data 
*/
    public Integer getData ()
    {
        return data;							//returns data
    }
/**
The set method for the link
@param newLink which is the data link
*/
    public void setLink (SNodeInteger newLink)
    {
        link = newLink;							//sets link
    }
/**
The get method for link 
@return link
*/
    public SNodeInteger getLink ()
    {
        return link;
    }





}
