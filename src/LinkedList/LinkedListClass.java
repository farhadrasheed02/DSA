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
		if(Isempty()) // if no elemet  Isempty created method to replace the code  if(first==null)
			first=last=node;
		else
			last.next=node;
		last = node;
	}
	
	public int indexof(int item)
	{
		int index =0; // we dont have index here so we declare
		var current =first;
		while(current !=null)
			{
			if(current.value==item)
				return index;
			current=current.next;
		index++;	
		
			}
		return -1;
	}

	public boolean Contains(int item)
	{
		return indexof(item) != -1;
	}
	
	public void removeFirst()
	{
		// [10 -> 20 -> 30]
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
	private boolean Isempty()
	{
		return first==null;
	}
	
}
