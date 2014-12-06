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

    //constructor
    ArrayGen() {
    }
    

   /*two variation of getArray
    you have a choice of returning choosing what array you want to return put 'd' for double or 'i' ,
    if you care about the size of your array, input your arrary size first then what type
    *by default the arraysize is 20
    *int's in the array are limited to 1-100 
    */
    protected static Object[] getArray(char selec){ //does not take an array size 
        Random rand = new Random();
        Object array[] = new Object[rand.nextInt(20) + 1];
        //********** array generator*****please ignore*****//
                
        //create integer type array
        if(selec == 'i'){
            for(int i = 0; i < array.length;i++ ){
                array[i] = rand.nextInt();
            }
        
        //create double type array
        }else if(selec == 'd'){
           for(int i = 0; i < array.length;i++ ){
                array[i] = rand.nextDouble();
            } 
        }
        
        return array;
    }
    //will take an array with your size specified
    protected static Object[] getArray(int arraySize,char selec){
        Object[] array = new Object[arraySize];
        Random rand = new Random();
        
        //create integer type array
        if(selec == 'i'){ 
            for(int i = 0; i < arraySize ;i++ ){
                array[i] = rand.nextInt(100) + 1;
            }
        
        //create double type array
        }else if(selec == 'd'){
           for(int i = 0; i < arraySize ;i++ ){
                array[i] = rand.nextDouble();
            } 
        }
        
        return array;
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
   
    
    /*************************array converter (int -> obj)**************************/
    protected static Object[] convertToObj (int[] array){//converts int to obj
    	
    	Object objArray[] = new Object[array.length]; //initialize object Array
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each int array to object
    		objArray[i] = array[i];
    	}
    	
    	return objArray;
    	
    }
    
    /*************************array converter (obj -> int)**************************/
    protected static int[] convertToInt (Object[] array){//converts obj to int
    	
    	int intArray[] = new int[array.length]; //initialize integer Array
    	for (int i = 0; i < array.length; i++) { //a for loop that assigns each object array to int
    		intArray[i] = (int) array[i];
    	}
    	
    	return intArray;
    	
    }
}
