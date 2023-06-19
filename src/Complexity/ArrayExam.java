package Complexity;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {

		// case Ist of declaring and initializing the array....
		int arr[] = new  int[10]; //
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		System.out.println(Arrays.toString(arr));
		// Second way of initializing....
		int arr1 [] = {2,3,5,9,11};
		for(int values : arr1)
		{
			System.out.println(values+" ");
			
		}
		System.out.println(arr1.length);
	}

}
