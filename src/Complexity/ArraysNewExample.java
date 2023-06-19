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
		System.out.println(num.indexOf(20));
		System.out.println(num.size());
	}

}
