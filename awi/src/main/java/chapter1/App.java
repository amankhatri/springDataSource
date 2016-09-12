package chapter1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		Node n = new Node();
		n.setNext(null);
		n.setData("Awantik");
		ll.insert(n);
		n.setData("Awantik2");
		ll.insert(n);
		n.setData("Awantik3");
        n = ll.head;
        
		for(int i = 0;i<ll.count && n != null;i++) {
            System.out.println(n.getData());
			n = n.getNext();
		}

	}

}
