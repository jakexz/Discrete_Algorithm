/*
 * What do?
 * License?
 * 
 */
//Need to finish

package discrete_sort;
/**
 *
 * @author Jakexz
 */

import java.util.Random;
public class ArrayGen {

    protected String[] strArray;
    protected int[] intArray;
    protected double[] dubArray;

    
    /********************Integer Array Generator ************/
    protected int[] createIntArray (){ //by default creates an array 20 wide
        Random rand = new Random();
        int array[] = new int[20];
        //********** array generator*****please ignore*****//
        for(int i = 0; i < array.length ;i++ ){
            array[i] = rand.nextInt((200 +100) + 1) - 100; //assign a random int (-200 <= i <= 200) to array 
        }
        return intArray = array;
    }
    
        protected int[] createIntArray (int arraySize){ // creates an array with size selected by the user
        Random rand = new Random();
        int array[] = new int[arraySize];
        //********** array generator*****please ignore*****//
        for(int i = 0; i < array.length ;i++ ){
            array[i] = rand.nextInt((200 +100) + 1) - 100; //assign a random int (-200 <= i <= 200) to array 
        }
        return intArray = array;
    }

    /********************Double Array Generator ************/
    protected double[] createDoubleArray (){ //by default creates an array 20 wide
        Random rand = new Random();
        double array[] = new double[5];
        //********** array generator*****please ignore*****//
        for(int i = 0; i < array.length ;i++ ){
            array[i] = rand.nextDouble(); //assign a random double to array 
        }
        return dubArray = array;
    }
    
        protected double[] createDoubleArray (int arraySize){ // creates an array with size selected by the user
        Random rand = new Random();
        double array[] = new double[arraySize];
        //********** array generator*****please ignore*****//
        for(int i = 0; i < array.length ;i++ ){
            array[i] = rand.nextDouble(); //assign a random double to array 
        }
        return dubArray = array;
    }        

    

}
