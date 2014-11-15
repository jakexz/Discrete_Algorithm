/**
   This program tests the bubbleSort methods using Integers and string.
*/
package discretesort;

public class BubbleSort
{
	
	public static void IntbubbleSort(int[] array)
	{
		int lastPosition;     					// Position of last element
		int index;  						   // Index of an element to compare
		int temp;     						   // Used to swap to elements
   
		/* The outer loop steps through the array 
		 During each iteration, it is decreased by one. */
		
		for (lastPosition = array.length - 1; lastPosition >= 0; lastPosition--)
		{
			/* The inner loop steps through the array, comparing each element 
			 * with its neighbor. If two elements are out of order, they are swapped*/
			for (index = 0; index <= lastPosition - 1; index++)
			{
				// Compare an element with its neighbor.
				if (array[index] > array[index + 1])
				{
					// Swap the two elements.
					temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
				}
			}
		}
	}


	 public static void StringBubbleSort(String[] array)
	 {
	      int lastPosition;  		  	 // Marks the last element to compare
	      int index;       				// Index of an element to compare
	      String temp;					// Used to swap to elements
	      
	      // The outer loop 
	      for (lastPosition = array.length - 1; lastPosition >= 0; lastPosition--)
	      {
	         // The inner loop steps through the array, 
	         for (index = 0; index <= lastPosition - 1; index++)
	         {
	            // Compare an element with its neighbor.
	            if (array[index].compareTo(array[index + 1]) > 0)
	            {
	               // Swap the two elements.
	               temp = array[index];
	               array[index] = array[index + 1];
	               array[index + 1] = temp;
	            }
	         }
	      }
	   }
	
	public static void main(String[] args)
	{
      
		// Create an int array with test values.
		int[] values = { 6, 7, 1, 8, 4, 2 };
		
		// Create a String array with test values.
		String[] names = { "Annie", "Abe", "John","Smith", "William", "Jennifer" };
	      
	      
		// Display the array's contents.
		System.out.println("The Original Integer's order: ");
      
		for (int integerNumbers : values)
         System.out.print(integerNumbers + " ");
      
		// Sort the array.
		IntbubbleSort(values);

      // Display the array's contents.
		System.out.println("\nThe Sorted Integer's order: ");
		
		for (int elements : values)
         System.out.print(elements + " ");
         
		System.out.println();
		System.out.println();
		
		// Display the array's contents.
		System.out.println("The Original name's order: ");
	      
		for (String Names : names)
			System.out.print(Names + " ");
	      
		// Sort the array.
		StringBubbleSort(names);

		// Display the array's contents.
		System.out.println("\nThe Sorted name's order: ");
	      
		for (String element : names)
			System.out.print(element + " ");
	         
		System.out.println();
		
	}
}


