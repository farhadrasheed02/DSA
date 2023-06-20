package Complexity;

public class DynamicMain {

	public static void main(String[] args) {
		
		DynamicArray darray = new DynamicArray(3);
		darray.insert(10);
		darray.insert(20);
		darray.insert(30);
		darray.insert(40);
		//darray.removeAt(2);
		System.out.println(darray.indexOf(100));
		darray.print();
	}

}
