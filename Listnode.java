import java.io.*;
import java.util.*;

public class Listnode{

	public ListNode link;
	public String data;

	public ListNode(){
		data=null;
		link=null;
	
	
	}
	
	public ListNode(String newData,ListNode newLink){
		data=newData;
		link=newLink;	
	
	}

	public void setData(String theData){
		data=theData;
	
	}
	
	public void setLink(ListNode theLink){
		link=theLink;

	}	
	public String getData(){
		return data;
	}
	
	
}
