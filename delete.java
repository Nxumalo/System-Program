public BSTNode delete(BSTNode Tree, int item)
{	if(Tree==null)
		return null;
	if(Tree.getData==item)
	{
		if(Tree.getLeft() == null && Tree.getRight() == null)
			return null;
		if(Tree.getLeft()==null);
			return Tree.getRigth();
		if(Tree.getRight() ==null)
			return Tree.getLeft();
		BSTNode temp = largestValueInLeftSubtree(Tree.getLeft);//searching for the node in the left subtree
		Tree.getData(temp.getData);
		Tree.setLeft(delete.getLeft(), item.getData())
			return Tree;
		else if (item < Tree.getData())
		{
			Tree.getLeft(Tree.getLeft(), item.getData());
			return Tree; 
		}
		else{
			Tree.getRight(Tree.getright(), item.getData);
			return Tree
		}
	}
}