package cse360assign2;

/**
 * SimpleList is a class where you can create an array of integers and perform various
 * operations on the array through the use of the class methods. The underlying data
 * structure for this method is an array, which is used to hold the integers in the list.
 * 
 * @author Austin Frost
 * ClassID 308
 * AssignmentNumber 1
 */

public class SimpleList 
{
	/**
	 * This array is used to store integers in the list
	 */
	private int[] array;
	
	/**
	 * This count field is used to store the number of elements in the list
	 */
	private int count;
	
	/**
	 * These final integers are constants that are used quantify the amount
	 * that considers the array to be full or empty
	 */
	private final int EMPTY = 0;
	private final int FULL = 0;
	
	/**
	 * The SimpleList constructor initializes the array and count field
	 * The array member is initialized to a new integer array that can 
	 * hold 10 numbers. The count member is initialized to the value 0.
	 * 
	 */
	public SimpleList()
	{
		array = new int[10];
		count = 0;
	}
	/**
	 * This add method inserts an element into the beginning of the array.
	 * Elements that are already in the array will shift up one position
	 * to make room for the new element. When the array is full and we insert
	 * an element, the array will drop off the last element at the highest index.
	 * After the insertion, the count field in incremented
	 * 
	 * @param addElement 	The integer that is added to the list
	 */
	
	public void add(int addElement)
	{
		if(count == EMPTY)
		{
			array[count] = addElement;
		}
		else
		{
			//We remove the last element in the list if its full
			if(count == FULL)
				count--;
			
			for(int index = (count - 1); index >= 0; index--)
			{
				array[index + 1] = array[index];
			}
			
			//We insert the new element at the beginning of the list
			array[0] = addElement;
		}
		count++;
	}
	/**
	 * This remove method will delete an element from the array. This remove method
	 * will search in the array for the element, remove it, and shift elements in
	 * higher indexes downward to fill in the gap. After the removal process is finished
	 * the count field is decreased by one. If there are duplicates of the same value,
	 * the first instance of that value will be removed.
	 * 
	 * @param remElement 	The element that will be found and removed from the list
	 */
	public void remove(int remElement)
	{
		//Boolean flag is used to remove only one instance of that
		//number in case there are multiple
		boolean isFound = false;
		
		for(int index = 0; index < count; index++)
		{
			if((array[index] == remElement) && !isFound)
			{
				isFound = true;
				
				//There is no need to shift if the element is at the end
				if(index != (count - 1))
				{
					for(int shiftIndex = index; shiftIndex < (count - 1); shiftIndex++ )
					{
						array[shiftIndex] = array[shiftIndex + 1];
					}
				}
			}
		}
		count--;
	}
	
	/**
	 * This count method retrieves the number of elements that are in the array.
	 * It returns the value in the private field count. This variable keeps track
	 * of the number of elements that are currently in the array.
	 * 
	 * @return count 	Returns the number of elements currently stored in the list
	 */
	public int count()
	{
		return count;
	}
	/**
	 * This toString method creates a string representation of the elements in
	 * the array in order. It traverses through the array and appends it to a
	 * local string variable. Each element is spaced out.
	 * 
	 * @return elementString 	A string that contains the current set of elements in
	 * 							the array
	 */
	
	public String toString()
	{
		String elementString = "";
		
		for(int index = 0; index < count; index++)
		{
			elementString += array[index];
			
			//To avoid having a space at the end of the last element
			if(index != (count - 1))
				elementString += " ";
		}
		
		return elementString;
	}
	/**
	 * This search method finds the element in the list and returns its index.
	 * It traverses through the entire list to find the element will either
	 * return the index of that element or -1 if the element was not found.
	 * If there are duplicates of that value, the the index of the first 
	 * instance will be returned.
	 * 
	 * @param findElement	The element to be searched for in the list
	 * @return searchResult	Returns the index of the element in the list
	 * 						or -1 if the element is not found.
	 */
	public int search(int findElement)
	{
		//Boolean flag is used to find the index of only
		//one element in the list in case there are multiple duplicates
		boolean isFound = false;
		int searchResult = -1;
		
		for(int index = 0; index < count; index++)
		{
			if((array[index] == findElement) && !isFound)
			{
				searchResult = index;
				isFound = true;
			}
		}
		
		return searchResult;
	}
	
}
