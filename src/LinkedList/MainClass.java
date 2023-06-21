package LinkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var lst = new LinkedListClass();
		lst.addLast(10);
		lst.addLast(20);
		lst.addLast(30);
		
		System.out.println(lst.Contains(10));
		System.out.println(lst.indexof(20));
		//lst.print();
	}

}
