import java.util.ArrayList;

public class LinkedlistInteger	implements SLinkedListInteger<E> {


	ArrayList <Integer> theList;//=new ArrayList <Integer>();
		
	public LinkedListInteger(){
			theList=new ArrayList <Integer>();
	}
	public void displayList(){
		for(Integer a: theList){
			System.out.println(a);
	
		}
	
			

	}								// displays the data on the list
	public int length(){						// returns the number of nodes on the list
		return theList.size();
	}
	public void addANodeToStart(Integer itemToAdd){ 		// adds a node in front of the
		theList.add(itemToAdd);
	}
									// first node
	public SNodeInteger deleteHeadNode(){				// deletes the first node on the list
			return null;
	}


	public boolean isOnList(Integer dataItem){
		 
		if(theList.contains(dataItem)){	
			System.out.println("True");
			return true;
		}
		else{
			System.out.println("False");
			return false;
		}
	
	
	}

	public static void main(String[] args){
			LinkedListInteger a= new LinkedListInteger();
			a.addANodeToStart(6);
			a.addANodeToStart(5);
			a.addANodeToStart(4);
			a.addANodeToStart(3);
			a.addANodeToStart(2);
			a.displayList();
			a.isOnList(3);
			a.isOnList(7);
	
	
	}

}
