/**
 * 
 */
package discretesort;

/**
 * @author Jakexz
 *
 */
public class MaxElement {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		 int myArray[] = ArrayGen.getArray(5);//create an int array 
		 DisplayArray disp = new DisplayArray(myArray);//initialze DisplayArray class 
		 disp.display(                          //print objArray 
				 ArrayGen.convertToObj(myArray)); //convert array from int -> obj
	}
	
	
	/**Find the max element in the array and return that array with max element at position 0***/
	protected static int[] getMaxElement(int array[]){
		
		int max = array[0]; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max < array[i]) //if the element is greater than MAX , assign it to MAX
				max = array[i];
		}
		max = array[0]; //puts MAX at the first the position of the array for easy displaying
		return array; //return the array
		
	}
	
	/*****************Display My array*******************/
	
	
	/***********************Overloading******************/
	protected double[] getMaxElement(double array[]){ //double 
		
		double max = array[0]; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max < array[i]) //if the element is greater than MAX , assign it to MAX
				max = array[i];
		}
		max = array[0]; //puts MAX at the first the position of the array for easy displaying
		return array; //return the array
		
	}
	
	protected String[] getMaxElement(String array[]){ //String 
	
		String max = array[0]; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max.length() < array[i].length()) //if the element is greater than MAX , assign it to MAX
				max = array[i];
		}
		max = array[0]; //puts MAX at the first the position of the array for easy displaying
		return array; //return the array
		
	}
	
	

}
