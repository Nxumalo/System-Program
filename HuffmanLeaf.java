
//<p><b>Author:<b>  Fraser Nxumalo.<p>
//<p><b>Email:<b>   3538264@myuwc.ac.za<p>
//<p>Last modified: 31/08/2020<p>

import java.util.*;

class HuffmanLeaf extends HuffmanTree{
    public final char value; 
 
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        value = val;}}