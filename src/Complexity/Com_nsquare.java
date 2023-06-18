package Complexity;

public class Com_nsquare {
	
	public static void n2(int [] numbers)
	{
		
		// so the overall run time complexity is 0(n*n) --> 0(n^2)
		for(int num : numbers)  // run time complexity is 0(n)
		{
		for(int num1 : numbers)   // run time complexity is 0(n)
		
			System.out.println(num+" "+num1);
		}
		
	}
	
	public static void main(String args[])
	{
		int [] arr = {1,3,5,1,5,6};
		n2(arr);
	}

}
