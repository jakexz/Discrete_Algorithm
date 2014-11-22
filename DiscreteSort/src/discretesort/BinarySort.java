package discretesort;
import java.util.Scanner;

public class BinarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int results, searchValue;
        String input;
		
        int numbers[] = {101, 142, 147, 189, 199, 207, 222, 234, 289, 296, 
        		         310, 319, 388, 394, 417, 429, 447, 521, 536, 600}; 
       
        int number1[];
		//Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Before we search make sure the array is sorted in ascending order
		
		
		do{
			//Get a value to search for.
			System.out.print("Enter a value to search for: ");
			searchValue = keyboard.nextInt();
			
		//Search for the value
			results = search(numbers, searchValue);
			
		//Display the result	
		  if(results == -1)
			   System.out.println(searchValue + " was not found.");
		  else  
			  System.out.println(searchValue + " was found at " + "element " + results);
		
		//Consume the remaining newline....
			keyboard.nextLine();
		
	//Does the user want to search 	
		System.out.print("Do you want to search again? (Y or N): ");
		input = keyboard.nextLine();
		
		}while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
		
	}




	public static int search(int[] array, int value)
	{
		int first; //First array element
		int last; //Last array element
		int middle; //Mid point of search
		int position; //First array element
		boolean found; //Flag
		
		//Set the initial values.
		 first = 0;
		 last= array.length - 1;
		 position = -1;
		 found = false;
		 
		 //search for the value
		 while(!found && first <= last)
		 {
			 //calculate midpoint
			 middle = (first + last) /2;
			 
			 //if value is found at mid point...
			 if(array[middle] == value)
			 {
				 found = true;
				 position = middle;
			 }
		 	 //else if value is in lower half...
			 else if(array[middle] > value)
			 last = middle - 1;
			 //else if value is in upper half...
			 else
			 first = middle + 1;
			 
		 }
		 //Return the position of the item, or -1 if it was not found
		 return position;
	}



}

