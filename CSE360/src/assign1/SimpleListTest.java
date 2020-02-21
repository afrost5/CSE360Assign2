package assign1;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import cse360assign2.SimpleList;

/**
 * SimpleListTest class is used to test the functionality of the SimpleList class.
 * This class rigorously tests the constructor and methods through various test
 * cases to determine if they function properly.
 * 
 * @author Austin Frost
 * @ClassID 308
 * @AssignmentNumber 1
 */

public class SimpleListTest {

	/**
	 * Tests the instantiation of the SimpleList object.
	 * It determines if its successful if the field is null or not.
	 */
	@Test
	public void testSimpleListNotNull() 
	{
		SimpleList list = new SimpleList();
		assertNotNull(list);
	}
	
	/**
	 * Tests the instantiation of the SimpleList object.
	 * This test will fail if it successfully instantiates.
	 */
	@Test
	public void testSimpleListNullFail()
	{
		SimpleList list = new SimpleList();
		assertNull(list);
	}
	
	/**
	 * Tests the search method in the SimpleList class on
	 * a single element list. It tests if the method can 
	 * successfully search the list if even is only one 
	 * element in it. It adds the element four to the 
	 * beginning of the list and search for it.
	 */
	@Test
	public void testSearchFirstElement()
	{
		SimpleList list = new SimpleList();
		list.add(4);
		assertEquals(list.search(4), 0);
	}
	
	/**
	 * Tests the search method in the SimpleList class on
	 * a full list. It tests if the method can successfully 
	 * search the list even if the list is full. It add the
	 * elements one through ten in to the list and search
	 * for the element one. 
	 */
	@Test
	public void testSearchFullList()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		assertEquals(list.search(1), 9);
	}
	
	/**
	 * Tests the search method of the SimpleList class after
	 * using the drop off functionality when adding more than
	 * ten elements. It tests if the method can successfully
	 * search the list even if there is a drop off. It adds
	 * the elements one through ten then add eleven to the
	 * list. This checks that the element 1 is not in index 9.
	 */
	@Test
	public void testSearchDropOff()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		assertNotEquals(list.search(1), 9);
	}
	
	/**
	 * Tests the search method in the SimpleList class when
	 * it is not able to find the element in the list. It
	 * tests if the method can successfully return -1 after
	 * being unable to find the value to be searched. This
	 * method adds element one through eleven in the list.
	 * It searches for the value 88 in the list and return -1.
	 */
	@Test
	public void testSearchNotFound()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		assertEquals(list.search(88), -1);
	}
	
	/**
	 * Tests the search method in the SimpleList class. It
	 * purposefully creates a failed test case that checks 
	 * that the element eleven is not in index nine of the
	 * array.
	 */
	@Test
	public void testSearchFail()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		assertEquals(list.search(11), 9);
	}
	
	/**
	 * Tests the add function in the SimpleList class.
	 * It adds one element to the list and see if the 
	 * method successfully runs. This adds the element
	 * four into the list and checks to see if the
	 * element is placed into index zero.
	 */
	@Test
	public void testAddOneElement()
	{
		SimpleList list = new SimpleList();
		list.add(4);
		
		assertEquals(list.toString(), "4");
	}
	
	/**
	 * Tests the add function in the SimpleList class.
	 * It creates a list and adds numbers one through ten
	 * in it thus making a full list. The method determines
	 * if it is successful by calling the toString method and
	 * comparing the expected elements in the array to the
	 * actual value in the array.
	 */
	@Test
	public void testAddFullList()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		assertEquals(list.toString(), "10 9 8 7 6 5 4 3 2 1");
	}
	
	/**
	 * Test the add method in the SimpleList class to determine
	 * if it runs successfully after using the drop off functionality
	 * when the list is full. The method creates a new list and adds
	 * the numbers one through ten in it. Afterwards, it adds the number
	 * eleven into the array. The method then calls the toString method
	 * to get a string representation of the array and compares it to
	 * what we expect the output to be.
	 */
	@Test
	public void testAddFullDropOff()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		
		assertEquals(list.toString(), "11 10 9 8 7 6 5 4 3 2");
	}
	/**
	 * Test the add method in the SimpleList class. We
	 * add elements one through nine in the list and determine
	 * that there is not an element ten in the list.
	 */
	@Test
	public void testAddFail()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		assertEquals(list.toString(), "10 9 8 7 6 5 4 3 2 1");
	}
	
	/**
	 * Tests the remove method in the SimpleList class when there
	 * is one element in the list. The function adds one element to
	 * the list and test if the function can successfully remove it.
	 * It checks if this process was successful by converting the 
	 * string into a list and checking if the list is empty.
	 */
	@Test
	public void testRemoveOneElement()
	{
		SimpleList list = new SimpleList();
		list.add(4);
		list.remove(4);
		assertEquals(list.toString(), "");
	}
	
	/**
	 * Tests the remove function in the SimpleList class when the
	 * list is full. The function adds numbers one through ten into
	 * the list and removes the first element in the list. The method
	 * checks if its successful by comparing the actual list to its
	 * expected value.
	 */
	@Test
	public void testRemoveFromFullList()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.remove(10);
		
		assertEquals(list.toString(), "9 8 7 6 5 4 3 2 1");
	}
	
	/**
	 * Tests the remove method in the SimpleList class
	 * from a full list. This tests how the shift algorithm
	 * works when we remove an element in the middle of the
	 * list. It determines if it is successful by comparing
	 * its actual value with an expected value.
	 */
	@Test
	public void testRemoveMidFromList()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.remove(5);
		
		assertEquals(list.toString(), "10 9 8 7 6 4 3 2 1");
	}
	
	/**
	 * Test the remove function in the SimpleList class.
	 * This method creates a purposeful failed result to
	 * determine that the number five will not be in the
	 * string after removing it.
	 */
	@Test
	public void testRemoveFail()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.remove(5);
		
		assertEquals(list.toString(), "10 9 8 7 6 5 4 3 2 1");
	}
	
	/**
	 * Tests the count method in the SimpleList class. It
	 * determines if the correct amount is counted if we insert
	 * one element into the list. It adds the number five into
	 * the list and should return count as the value one.
	 */
	@Test
	public void testCountOneElement()
	{
		SimpleList list = new SimpleList();
		list.add(5);
		
		assertEquals(list.count(), 1);
	}
	
	/**
	 * Tests the count method in the SimpleList class
	 * using a full list and testing if count has recorded
	 * the correct number of elements in the list. Adds the
	 * numbers one through ten into the list
	 */
	@Test
	public void testCountFullList()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		assertEquals(list.count(), 10);
	}
	
	/**
	 * Tests the count method in the SimpleList class.
	 * This method adds the numbers one through ten into
	 * the list and then removes the element five from it.
	 * It checks to see if count updates the value accordingly
	 * after the removal.
	 */
	@Test
	public void testCountWithRemove()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.remove(5);
		
		assertEquals(list.count(), 9);
	}
	
	/**
	 * Tests the count method in the SimpleList class.
	 * It determines if the count keeps the correct amount
	 * of elements in the list after we use the drop off
	 * functionality of the list. This adds elements one
	 * through ten into the list then adds the element eleven.
	 * The method tests the count value to its expected value.
	 */
	@Test
	public void testCountWithDropOff()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		
		assertEquals(list.count(), 10);
	}
	
	/**
	 * Tests the count method in SimpleList class.
	 * This creates a test case where we add elements
	 * one through ten in the list and remove a single
	 * element from it. It checks that the count value
	 * updates after the removal.
	 */
	@Test
	public void testCountFail()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.remove(5);
		
		assertEquals(list.count(), 10);
	}
	
	/**
	 * Tests the toString method in the SimpleList class.
	 * It determines if the method can print all the elements
	 * in the array even if there is only one. This method inserts
	 * a single value into the array and checks if that value gets
	 * displayed.
	 */
	@Test
	public void testToStringOneElement()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		
		assertEquals(list.toString(), "1");
	}
	
	/**
	 * Tests the toString method in the SimpleList class.
	 * It determines if the method can print all the elements
	 * in the array when the list is full. The method inserts
	 * elements one through ten into the array and checks to
	 * see if those values are displayed.
	 */
	@Test
	public void testToStringFullList()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		assertEquals(list.toString(), "10 9 8 7 6 5 4 3 2 1");
	}
	
	/**
	 * Tests the toString method in the SimpleList class.
	 * It determines if the method outputs the proper string
	 * after using the drop off functionality when the list is
	 * full. The method inserts elements one through ten inside 
	 * the list and then adds element eleven. The method then checks
	 * to see if the output is correct.
	 */
	@Test
	public void testToStringDropOff()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		
		assertEquals(list.toString(), "11 10 9 8 7 6 5 4 3 2");
	}
	
	/**
	 * Tests the toString method in the SimpleList class.
	 * This method inserts the elements one through ten into
	 * the string then removes element ten at the beginning of
	 * the string. This method checks to see if the output string
	 * will display the proper array and exclude the integer ten
	 * that was just removed.
	 */
	@Test
	public void testToStringRemove()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.remove(10);
		
		assertEquals(list.toString(), "9 8 7 6 5 4 3 2 1");
	}
	
	/**
	 * Tests the toString method in the SimpleLit class.
	 * This method add elements one through ten into the
	 * list and removes element ten in the list. The test
	 * purposefully fails to determine that element ten is
	 * removed from the list after calling the remove method.
	 */
	@Test
	public void testToStringFail()
	{
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.remove(10);
		
		assertEquals(list.toString(), "10 9 8 7 6 5 4 3 2 1");
	}
}
