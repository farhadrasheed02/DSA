package Bubblesort;

import java.util.Arrays;

public class BubbleSorting {
	public  static void bsort(int[]arr)
	{
		var i=0;
		for(i=1;i<arr.length+1;i++)
		{
			
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]<arr[j-1]) 
				swap(arr,j,j-1);
			
		}
		}
	}
	private static void swap(int array[], int index1, int index2)
	{
		int temp = array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arry[] = {10,8,7,4,6};
		bsort(arry);
		System.out.println(Arrays.toString(arry));
	}

}
