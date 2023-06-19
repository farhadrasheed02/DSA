package Complexity;

import java.util.ArrayList;

public class ArraysNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<>(3);
		num.add(10);
		num.add(5);
		num.add(20);
		num.add(30);
		num.set(3,7); // setting value at the index 3
		System.out.println(num.indexOf(20)); // trying to get the index value of 20, it position in the list...
		System.out.println(num.get(2));   // trying to get the element at the index position 2....
		System.out.println(num.size());   // returns the size of the ArrayList...
	}

}
