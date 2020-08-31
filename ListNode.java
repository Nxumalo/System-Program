import java.util.*;
import java.io.*;

public class ListNode{

	String data;
	ListNode link;

	public ListNode(){
		data=null;
		link=null;	
		
	}

	public ListNode(String newData, ListNode newLink){

		data=newData;
		link=newLink;
	
	}

	public void setData(String theData){
		
		data=theData;
	
	}

	public String getData(){
	
		return data;	

	}

	public void setLink(ListNode theLink){

		link=theLink;
	
	}

	public ListNode getLink(){

		return link;

	}





}
