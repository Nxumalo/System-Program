import java.util.*;


public class LinkedstackInteger {
	
	
	
	private SNodeInteger top;	
	
	
	public LinkedStackInteger(){
		top=null;
	
	}

	

	public int getHeight(){
	
		int count=0;
	
		SNodeInteger position = top;
		
		while(position !=null){
			count++;
			position=position.getLink();
	
		}
		return count;
	}
	
	
	/**
	public boolean isEmpty(){
	
	}
	*/
	public void push(Integer addData){
	
		top=new SNodeInteger(addData, top);
	
	}
	
	
	public void pop(){
		if(top !=null){
			top=top.getLink();
		}
		else{
			System.out.println("Calling from an empty list.");
			System.exit(0);
		}
	}
	

	public void head(){
		Integer headd=top.getData();
		System.out.println("headd");
	
	}

	public void display(){
		
		SNodeInteger focus=top;
		while(focus != null){	
			
			System.out.println(focus.getData());
			focus = focus.getLink();
		}
	
	}
	

}
