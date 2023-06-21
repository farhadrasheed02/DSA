package LinkedList;

public class LinkedListClass {
	
	private class Node {
		private int value;
		private Node next;
		public Node(int value)
		{
			this.value=value;
			this.next=null;
		}
	}
	
	private Node first;
	private Node last;
	private Node current;
	
	// method to add element at the end of the list...
	public void addLast(int item)
	{
		var node = new Node(item);
		if(first==null) // if no elemet 
			first=last=node;
		else
			last.next=node;
		last = node;
	}
	public void print() {
        current = first;
        
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
	
}
