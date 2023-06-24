package InsertionAlgo;

import java.util.Arrays;

public class InsertionAlgo {

		public static void sort(int[] array)
		{
			for(var i=1;i<array.length;i++) {
				var current = array[i];
			
			var  j=i-1;
			while( j>=0 && array[j]>current)
			{
				array[j+1] =array[j];
			j--;	
			}
			array[j+1] =current;
			}	
			
		}
	public static void main(String args[])
	{
		// Insertion can be imagined like playing a card game...
		
		int [] arr = {8,7,6};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
