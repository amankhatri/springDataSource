package chapter1;

public class LinkedList {
	public Node head;
	public int count;
	
	public LinkedList() {
		this.head = null;
		this.count = 0;
	}
	
	public void insert(Node n){
		if (this.head != null){
			n.setNext(this.head);
		}
		head = n;
		count++;
	}

}
