package chapter1;

public class Node{
    protected Object data;
    protected Node next;

    public Node(){
        next = null;
        data = null;
    }
    public Node(Object d,Node n){
        data = d;
        next = n;
    }
    public void setNext(Node n){
        next = n;
    }
    public void setData(Object d){
        data = d;
    }
    public Node getNext(){
        return next;
    }
    public Object getData(){
        return data;
    }
    public String toString(){
        return ""+data;
    }
}