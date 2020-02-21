package cse360assign1;

import cse360assign2.SimpleList;

public class Test 
{
	public static void main(String args[])
	{
		SimpleList sl = new SimpleList();
		
		for(int i = 0; i < 10; i++)
		{
			sl.add(i);
		}
		
		sl.add(10);
		sl.add(11);
		
		System.out.println(sl.count());
		
		System.out.println(sl.toString());
	}
}
