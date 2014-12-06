/*
 * What do?
 * License?
 * 
 */
//Need to finish

package discretesort;
/**
 *
 * @author Jakexz
 */

import java.util.Random;
public class ArrayGen {

    private static String[] strArray;
    private static int[] intArray;
    private static double[] dubArray;
    private static char selec;
    //private static int arraySize;

	//constructor
    ArrayGen() {
    }
    
    ArrayGen(char selec){
    	ArrayGen.setStrArray(selec);
    }
    
    
    ArrayGen(int arraySize){
    	ArrayGen.setIntArray(arraySize);
    	
    }
    
    ArrayGen(double arraySize){
    	ArrayGen.setDubArray(arraySize);
    	
    }
    

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
        
        
        return array;
    }
   
    
    /*************************array converter (int -> string)**************************/
    protected static String[] convertToStr (int[] array){//converts int to string
    	
    	String strArray[] = new String[array.length]; //initialize object Array
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each int array to object
    		strArray[i] = String.valueOf(array[i]);
    	}
    	
    	return strArray;
    	
    }
    
    /*************************array converter (string -> int)**************************/
    protected static int[] convertToInt (String[] array){//converts string to int
    	
    	int intArray[] = new int[array.length]; //initialize integer Array
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each object array to int
    		intArray[i] = Integer.parseInt(array[i]);
    	}
    	
    	return intArray;
    	
    }
    
    /*************************array converter (double -> string)**************************/
    protected static String[] convertToStr (double[] array){//converts double to string
    	
    	String strArray[] = new String[array.length]; //initialize object Array
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each double array to object
    		strArray[i] = String.valueOf(array[i]);
    	}
    	
    	return strArray;
    	
    }
    
    /*************************array converter (string -> double)**************************/
    protected static double[] convertToDud (String[] array){//converts string to double
    	
    	double dudArray[] = new double[array.length]; //initialize integer Array
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each object array to double
    		dudArray[i] = Integer.parseInt(array[i]);
    	}
    	
    	return dudArray;
    	
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
