/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bongani
 */
public class Vertice<E>{
    private Vertice<E> next;
    private Vertice<E> left;
    private Vertice<E> right;
    private String bin;
    private QueueElement data;

    public Vertice(Vertice<E> next, QueueElement data) {
        this.next = next;
        this.data = data;
    }
        
    public Vertice(Vertice<E> left,Vertice<E> right , QueueElement data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
    
     public Vertice(QueueElement data) {
         this.data = data;
         left = null;
         right = null;
    }
    


    public QueueElement getData() {
        return data;
    }


    public void setData(QueueElement data) {
        this.data = data;
    }
    public Vertice<E> myClone(Vertice<E> n){
        return new Vertice(left, right, data);
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    
    public Vertice<E> getNext() {
        return next;
    }

    public void setNext(Vertice<E> next) {
        this.next = next;
    }

    
    public Vertice<E> getLeft() {
        return left;
    }

    public void setLeft(Vertice<E> left) {
        this.left = left;
    }

    public Vertice<E> getRight() {
        return right;
    }

    public void setRight(Vertice<E> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Vertice{" + " data=" + data + '}';
    }
    
    
    
}
