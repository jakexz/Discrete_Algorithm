/**
 * 
 */
package discrete_sort;

/**
 * @author Jakexz
 *
 */
public class MaxElement {
    protected String[] strArray;
    protected int[] intArray;
    protected double[] dubArray;
    
    MaxElement(){}
    
    MaxElement(String strArray[], int intArray[], double dubArray[]){
        this.strArray = strArray;
        this.intArray = intArray;
        this.dubArray = dubArray;
    }
    
//Intergers*******************************     
/*****************Get the largest element in my array*******************/    
    protected void getMaxElement(int array[]){
		intArray = array;
		int max = intArray[0]; //assign MAX as the first element
		for(int i = 1; i < intArray.length; i++) //loop the thing until the end of array 
		{
			if (max < intArray[i]) //if the element is greater than MAX , assign it to MAX
				max = intArray[i];
		}

		displayMax(max); //display array
		
	}
/*****************Display My array*******************/
    private void displayMax(int maxNumber){
        System.out.print("Here is your array before the operation: ");
            
            System.out.print("{");
		for(int i = 0; i < intArray.length ; i++){ //prints the elements one by one
                    System.out.print(intArray[i]);
                     if(i < intArray.length-1 )
                    System.out.print(",");	
                }
              System.out.println("}");
		
            System.out.println("Here is your array after the operation: " + "{"+ maxNumber+ "}"); //prints the array 
		
	}   
    
//Doubles******************    
/*****************Get the largest element in my array*******************/    
    protected void getMaxElement(double array[]){
		dubArray = array;
		double max = dubArray[0]; //assign MAX as the first element
		for(int i = 1; i < dubArray.length; i++) //loop the thing until the end of array 
		{
			if (max < dubArray[i]) //if the element is greater than MAX , assign it to MAX
				max = dubArray[i];
		}

		displayMax(max); //display array
		
	}
/*****************Display My array*******************/
    private void displayMax(double maxNumber){
        System.out.print("Here is your array before the operation: ");
            
            System.out.print("{");
		for(int i = 0; i < dubArray.length ; i++){ //prints the elements one by one
                    System.out.print(dubArray[i]);
                     if(i < dubArray.length-1 )
                    System.out.print(",");	
                }
              System.out.println("}");
		
            System.out.println("Here is your array after the operation: " + "{"+ maxNumber+ "}"); //prints the array 
		
	}
    

//String******************    
/*****************Get the largest element in my array*******************/    
    protected void getMaxElement(String array[]){
		strArray = array;
		String max = strArray[0]; //assign MAX as the first element
		for(int i = 1; i < strArray.length; i++) //loop the thing until the end of array 
		{
			if (max.length() < strArray[i].length()) //if the element is greater than MAX , assign it to MAX
				max = strArray[i];
		}

		displayMax(max); //display array
		
	}
/*****************Display My array*******************/
    private void displayMax(String maxElement){
        System.out.print("Here is your array before the operation: ");
            
            System.out.print("{");
		for(int i = 0; i < dubArray.length ; i++){ //prints the elements one by one
                    System.out.print(dubArray[i]);
                     if(i < dubArray.length-1 )
                    System.out.print(",");	
                }
              System.out.println("}");
		
            System.out.println("Here is your array after the operation: " + "{"+ maxElement+ "}"); //prints the array 
		
	}       
    }    



