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
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ArrayGen intArray = new ArrayGen(5); //create an integer array of size 5
		DisplayArray disp = new DisplayArray(intArray.getIntArray());//Initialize DisplayArray class 
		disp.display();
		
		ArrayGen doubleArray = new ArrayGen(2.0); //create a string array with selection key = integer
		DisplayArray dispDouble = new DisplayArray(doubleArray.getDubArray());
		dispDouble.display();
	}
	
	
	
	
	/**Find the max element in the array and return that array with max element at position 0***/
	protected static int[] getMaxElement(int array[]){
		
		int max = array[0]; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max < array[i]) //if the element is greater than MAX , assign it to MAX
				max = array[i];
		}
		array[0] = max; //puts MAX at the first the position of the array for easy displaying
		return array; //return the array
		
	}
	
	/*****************Display My array*******************/
	protected static void displayMax(int intArray[]){
        System.out.print("{");
		for(int i = 0; i < intArray.length ; i++){ //prints the elements one by one
            System.out.print(intArray[i]);
            if(i < intArray.length-1 )
                System.out.print(",");	
        }
        System.out.println("}");
		
		getMaxElement(intArray);
		
		System.out.println("Here is your array after the operation: " + "{"+ intArray[0]+ "}"); //prints the array 
		
	}
	
	/***********************Overloading******************/
	protected double[] getMaxElement(double array[]){ //double 
		
		double max = array[0]; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max < array[i]) //if the element is greater than MAX , assign it to MAX
				max = array[i];
		}
		array[0] = max; //puts MAX at the first the position of the array for easy displaying
		return array; //return the array
		
	}
	
	protected static String[] getMaxElement(String array[]){ //String 
	
		String max = array[0]; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max.length() < array[i].length()) //if the element is greater than MAX , assign it to MAX
				max = array[i];
		}
		array[0] = max; //puts MAX at the first the position of the array for easy displaying
		return array; //return the array
		
	}
	
	protected static void displayMax(String strArray[]){
		
		getMaxElement(strArray);
		
		System.out.println("\nHere is your array after the operation: " + "{"+ strArray[0]+ "}"); //prints the array 
		
	}

}
