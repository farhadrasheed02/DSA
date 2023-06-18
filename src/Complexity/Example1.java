package Complexity;

public class Example1 {
	
//	Case 1 :
		public void print(int [] num)

		{
			// the output will not depend on the input as it will always print first index, so have constant time
			// we can say then it have time complexity as    0(1)  --> run time complexity  constant time..
			System.out.println(num[0]);
			
		}
//		Case 2 :
		
		public static  void case2(int [] num)
		{
			// complexity depends upon the number of input....cost increase linearly and depend upon number of inputs
//			Run time complexity --> 0(n)
			for(int i=0;i<num.length;i++)
			{
				
				System.out.println(num[i]);  // 0(n)
				
			}
			// Note down that 0(n) or 0(n+2) or 0(n+n)= 0(2n) are equal to 0(n) if the user input is very large....
		}
		
		// case 3 
		public static  void case3(int [] num, String[] name)
		{
			 // overall complexity is 0(n+m) --> 0(n)
			for(int numbers : num)  // run time complexity 0(n)
			{
				System.out.println(numbers);
			}
			
			for(String names: name)			// run time complexity 0(m)
			{
				System.out.println(names);
			}
		}
		
	public static void main(String[] args) {

		int [] arr = {1,3,5,8,9,16,20};
		case2(arr);
	}

}
