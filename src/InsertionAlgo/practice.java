package InsertionAlgo;

import java.util.Arrays;

public class practice {

	public static void inser(int arr[])
	{ 
		 var i=1;
		 int count=0;
		
		 for(i=0;i<arr.length;i++)
		 {
			 var current = arr[i];
			 
			 var j=i-1;
			while(j>=0 && arr[j]<current)   // we make the condition like this(while(j>0 && a[j]> cuurent) it will be for the ascending order
				// i.e. 1,1, 4,5,6,8 .. so on
			{
				arr[j+1]=arr[j];
				
				j--;
			}
			arr[j+1]=current;
			
		 }
		
		 
	}
		
	public static void main(String args[])
	{
		int arr [] = {1,1,8,6,4,5};
		inser(arr);
		System.out.println(Arrays.toString(arr));
	}
}
