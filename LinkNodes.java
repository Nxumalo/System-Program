import java.util.*;
import java.io.*;

public class LinkNodes{
	
	int data;
	linkNode link;	
	
	public LinkNode(){
		data=null;
		link=null;
	
	}
	public LinkNode(int newData,LinkNode newLink){
		data=newData;
		link=newLink;
	
	}
	public void setData(int theData){
		data=theData;
	
	}
	public void setLink(linkNode theLink){
		Link=theLink;
	
	}
	public int getData(){
		return data;	
	
	}
	
	
}
