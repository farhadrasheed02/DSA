package Complexity;

public class DynamicArray{
	 private int  [] items;
	 private int count;
	
	public DynamicArray(int length)
	{
		items = new int[length];
	}
	
	public int indexOf(int indxitem)  // search operation ....
	{
		 for(int i=0;i<count;i++)
		 {
			if(items[i]==indxitem)
				{return i;
				}
		 }
		 return -1;
	}
	
	public void insert(int item)
	{
		// if Array is full we will make new array double the size of items array and copy the element in it
		if(items.length==count) {
			int [] newitems = new int[count*2];   // count *2 double the size of first array i.e. items
		
			for(int i=0;i<count;i++)
				newitems[i] = items[i];  // copying all existing elements...
			
			items=newitems;  // set items of this new array...
		}
		  
		
		
		
		
		// we will add item at the end of the array, for now the size of the array is count so when we add the item it goes to count++ and so on...
		items[count++] = item;
	
	}

	public void removeAt(int index)
	{
		//validate the index
		if(index<0 || index>=count)
		{
			throw new IllegalArgumentException();
		}	
			// shift the element to the left ...
			for(int i=index;i<count;i++)
				{items[i]=items[i+1];
				}
		count --;
	}
	public void print()
	{
		for(int i=0;i<count;i++)  // if we uses items.length --> it will take the memory you can use to check the difference....
		{
			System.out.println(items[i]);
		}
	}
}
