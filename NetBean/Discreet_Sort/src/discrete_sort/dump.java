/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakexz
 */
public class dump {
    	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ArrayGen Array = new ArrayGen(5); //create an integer array of size 5
                getMaxElement(Array.intArray);
		//DisplayArray disp = new DisplayArray(intArray.getIntArray());//Initialize DisplayArray class 
		//disp.display();
                
                
		
		//ArrayGen doubleArray = new ArrayGen(2.0); //create a string array with selection key = integer
		//DisplayArray dispDouble = new DisplayArray(doubleArray.getDubArray());
		//dispDouble.display();
	}
        
                ArrayGen intArray = new ArrayGen(5);// TODO code application logic here
        MaxElement.displayMax(intArray.getIntArray());
        
            

   /*two variation of getArray
    you have a choice of returning choosing what array you want to return put 'd' for double or 'i' ,
    if you care about the size of your array, input your array size first then what type
    *by default the array size is 20
    *int's in the array are limited to 1-100 
    */
    protected static String[] getArray(char selec){ //does not take an array size 
        Random rand = new Random();
        String array[] = new String[rand.nextInt(20) + 1];
        //********** array generator*****please ignore*****//
                
      //create integer type array
        if(selec == 'i'){ 
            for(int i = 0; i < array.length ;i++ ){
                array[i] = String.valueOf(rand.nextInt(100) + 1);
            }
        
        //create double type array
        }else if(selec == 'd'){
           for(int i = 0; i < array.length ;i++ ){
                array[i] = String.valueOf(rand.nextDouble());
            } 
        }
        return array;
    }
    
    //will take an array with your size specified
    protected static String[] getArray(int arraySize,char selec){
        String[] array = new String[arraySize];
        Random rand = new Random();
        
        //create integer type array
        if(selec == 'i'){ 
            for(int i = 0; i < arraySize ;i++ ){
                array[i] = String.valueOf(rand.nextInt(100) + 1);
            }
        
        //create double type array
        }else if(selec == 'd'){
           for(int i = 0; i < arraySize ;i++ ){
                array[i] = String.valueOf(rand.nextDouble());
            } 
        }
        
        return getStrArray();
    }
    
    /********************Integer Array Generator ************/
    protected static int[] getArray(int arraySize){ // take an array size, return int array 
        Random rand = new Random();
        int array[] = new int[arraySize] ;
        //********** array generator*****please ignore*****//
               
            for(int i = 0; i < arraySize ;i++ ){
                array[i] = rand.nextInt((200 +100) + 1) - 100; //assign a random int to array 
            }
        
        
        return array;
    }
    
    /********************Double Array Generator ************/
    protected static double[] getArray(double arraySizeD){ // take an array size, return double array 
        Random rand = new Random();
        double array[] = new double[(int)arraySizeD] ;
        //********** array generator*****please ignore*****//
               
            for(int i = 0; i < arraySizeD ;i++ ){
                array[i] = rand.nextDouble(); //assign a random double to array 
            }
        
        
        return dubArray = array;
    }
   
    
    /*************************array converter (int -> string)**************************/
    protected static String[] convertToStr (int[] array){//converts int to string
    	
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each int array to object
    		strArray[i] = String.valueOf(array[i]);
    	}
    	
    	return strArray;
    	
    }
    
    /*************************array converter (string -> int)**************************/
    protected static int[] convertToInt (String[] array){//converts string to int
    	
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each object array to int
    		intArray[i] = Integer.parseInt(array[i]);
    	}
    	
    	return intArray;
    	
    }
    
    /*************************array converter (double -> string)**************************/
    protected static String[] convertToStr (double[] array){//converts double to string
    	
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each double array to object
    		strArray[i] = String.valueOf(array[i]);
    	}
    	
    	return strArray;
    	
    }
    
    /*************************array converter (string -> double)**************************/
    protected static double[] convertToDud (String[] array){//converts string to double
    	
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each object array to double
    		dubArray[i] = Integer.parseInt(array[i]);
    	}
    	
    	return dubArray;
    	
    }

    /****************************************setters and getters***************************/
	public static String[] getStrArray() {               //
		return strArray;                                 //get String Array
	}                                                    //

	public static void setStrArray(char selec) {         //
		strArray = getArray(selec);                      //set String Array
	}                                                    //
	
	public static int[] getIntArray() {                  //
		return intArray;                                 //get integer Array
	}                                                    //

	public static void setIntArray(int arraySize) {       //
		intArray = getArray(arraySize);                   //set integer Array
	}

	public static char getChar() {
		return selec;
	}

	public static void setChar(char selec) {
		ArrayGen.selec  = selec;
	}
	
	public static double[] getDubArray() {                  //
		return dubArray;                                    //get double Array
	}                                                       //

	public static void setDubArray(double arraySize) {       //
		dubArray = getArray(arraySize);                 //set double Array
	}
}


	/**Find the max element in the array and return that array with max element at position 0***/
	protected static void getMaxElement(int array[]){
		
		int max[] = array; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max[0] < array[i]) //if the element is greater than MAX , assign it to MAX
				max[0] = array[i];
		}
		array = max; //puts MAX at the first the position of the array for easy displaying
		displayMax(array); //display array
		
	}
	
	/*****************Display My array*******************/
        protected static void displayMax(int intArray[]){
            System.out.print("Here is your array before the operation: ");
            
            System.out.print("{");
		for(int i = 0; i < intArray.length ; i++){ //prints the elements one by one
                    System.out.print(intArray[i]);
                     if(i < intArray.length-1 )
                    System.out.print(",");	
                }
              System.out.println("}");
		
            System.out.println("Here is your array after the operation: " + "{"+ intArray[0]+ "}"); //prints the array 
		
	}
	
	/***********************Overloading******************/
	protected static double[] getMaxElement(double array[]){ //double 
		
		double max = array[0]; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max < array[i]) //if the element is greater than MAX , assign it to MAX
				max = array[i];
		}
		array[0] = max; //puts MAX at the first the position of the array for easy displaying
		return array; //return the array
		
	}
	
	protected static void getMaxElement(String array[]){ //String 
	
		String max = array[0]; //assign MAX as the first element
		for(int i = 1; i < array.length; i++) //loop the thing until the end of array 
		{
			if (max.length() < array[i].length()) //if the element is greater than MAX , assign it to MAX
				max = array[i];
		}
		array[0] = max; //puts MAX at the first the position of the array for easy displaying
		displayMax(array); //display array
		
	}
	
	protected static void displayMax(String strArray[]){
		
		
		System.out.println("\nHere is your array after the operation: " + "{"+ strArray[0]+ "}"); //prints the array 
		
	}

