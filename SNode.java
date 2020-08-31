

public class SNode<E> {
	private SNode<E> next;
	private E element;

    public SNode(E element) {
        this.element = element;
        next = null;
    }
        
    public SNode(SNode<E> next, E element) {
            super();
            this.next = next;
            this.element = element;
    }
    public SNode<E> getNext() {
            return next;
    }
    public void setNext(SNode<E> next) {
            this.next = next;
    }
    public E getElement() {
            return element;
    }
    public void setElement(E element) {
            this.element = element;
    }

    @Override
    public String toString() {
        return "SNodeE{" + "element=" + element + '}';
    }
        
	
}
