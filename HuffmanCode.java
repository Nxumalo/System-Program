
//<p><b>Author:<b>  Fraser Nxumalo.<p>
//<p><b>Email:<b>   3538264@myuwc.ac.za<p>
//<p>Last modified: 09/12/2021<p>

import java.util.*;

public class HuffmanCode {

    public static HuffmanTree buildTree(int[] charFreqs) {
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0) trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));
 
        assert trees.size() > 0;
        while (trees.size() > 1){
            HuffmanTree a = trees.poll();
            HuffmanTree b = trees.poll();
            trees.offer(new HuffmanNode(a, b));}
        return trees.poll();}
 
    public static void printCodes(HuffmanTree tree, StringBuffer prefix) {
        assert tree != null;
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf)tree;
            System.out.println(leaf.value + "\t" + leaf.frequency + "\t" + prefix);} 
			
		else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;
            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length()-1);
 
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length()-1);}}
 
    public static void main(String[] args) {
        String test = "nkwebana";
 
        int[] charFreqs = new int[256];
        for (char c : test.toCharArray()) charFreqs[c]++;
        HuffmanTree tree = buildTree(charFreqs);
 
        System.out.println("SYMBOL\tWEIGHT\tHUFFMAN CODE");
        printCodes(tree, new StringBuffer());}}
