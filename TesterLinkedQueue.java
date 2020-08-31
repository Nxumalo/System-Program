/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bongani
 */
/*A queue can be thought of as a line. Items are
added at the end of the line and are taken from the front of the line.*/
public class TesterLinkedQueue{
    public static void main(String [] args){
        SLinkedListQueue lst = new SLinkedListQueue();
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SNode item;
        System.out.println(lst.isEmpty()+"\n");
        //Adding Node with element.
        for(int i=0;i<10;i++){
            item = new SNode(null, str.charAt(i)+"");
            System.out.println("Adding Node with element '" +item.getElement() +"' at the end of the Queue");
            lst.addToQueue(item);
            
            System.out.print("Printing the Queue list: ");
            System.out.println(lst.toString()+"\n");
        }
        System.out.println("\nRemoving Phase\n");
        //Removing Phase.
        for(int i=0;i<9;i++){
            System.out.println("Removing Node with element '" +lst.removeFromQueue().getElement() +"' at the start of the Queue");
            System.out.print("Printing the Queue list: ");
            System.out.println(lst.toString()+"\n");
        }
        
        System.out.println(lst.isEmpty()+"\n");
        
 
    }
        
    
}
