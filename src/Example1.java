
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
			// complexity depends upon the num of input....cost increase linearly and depend upon number of inputs
//			Run time complexity --> 0(n)
			for(int i=0;i<num.length;i++)
			{
				System.out.println();
				
				System.out.println(num[i]);  // 0(n)
				System.out.println(); 
			}
		}
		
	public static void main(String[] args) {

		int [] arr = {1,3,5,8,9,16,20};
		case2(arr);
	}

}
