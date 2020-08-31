/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

This class is implemented by the LinkedListInteger class. All its methods are overidden.
*/

public abstract  interface SLinkedList <E>{


	public void displayList();					// displays the data on the list
	public int length();						// returns the number of nodes on the list
	public void addANodeToStart(E itemToAdd); 		// adds a node in front of the
									// first node
	public SNode deleteHeadNode();				// deletes the first node on the list
	public boolean isOnList(E dataItem); 			// returns a reference to the first node
									// containing the integer dataItem; returns
									// null if dataItem is not on the list
}
