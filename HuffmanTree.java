
//<p><b>Author:<b>  Fraser Nxumalo.<p>
//<p><b>Email:<b>   3538264@myuwc.ac.za<p>
//<p>Last modified: 31/08/2020<p>

public class HuffmanTree{

    public Node root;

    public HuffmanTree(){
        this.root = new Node();}

    public void add(char data, String sequence){

        Node temp = this.root;
        int i = 0;
        for(i=0;i<sequence.length()-1;i++){

          if(sequence.charAt(i)=='0'){
                if(temp.left == null){
                    temp.left = new Node();
                    temp = temp.left;}
                else{
                   temp = (Node) temp.left;}}
			
            else{
				if(sequence.charAt(i)=='1'){
					if(temp.right == null){
						temp.right = new Node();
						temp = temp.right;}
					else{
						temp = (Node) temp.right;}}}}
						
        if(sequence.charAt(i) == '0'){

            temp.left = new Node(data);}
		
        else{
            temp.right = new Node(data);}}

    public String getDecodedMessage(String encoding){

        String output = "";
        Node temp = this.root;
        for(int i = 0; i < encoding.length(); i++){

            if(encoding.charAt(i) == '0'){
                temp = temp.left;

                if(temp.left == null && temp.right == null){
                    output+= temp.getData();
                    temp = this.root;}}
			
            else{
			
                temp = temp.right;
                if(temp.left == null && temp.right == null){
                    output += temp.getData();
                    temp = this.root;  
                }}}
        return output;}
    
    public void traversal(Node node){

        if(node == null)	return;
		
        System.out.println(node);
        traversal(node.left);
        traversal(node.right);}
	
	public static void main(String[] args){
		HuffmanTree out = new HuffmanTree();
		out.getDecodedMessage("nkwebana");}}