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
    protected Object[] getArray(char selec){ //does not take an array size 
        Random rand = new Random();
        Object array[] = new Object[rand.nextInt(20) + 1];
        
        if(selec == 'i'){
            for(int i = 0; i < array.length;i++ ){
                array[i] = rand.nextInt();
            }
        }else if(selec == 'd'){
           for(int i = 0; i < array.length;i++ ){
                array[i] = rand.nextDouble();
            } 
        }
        
        return array;
    }
    
    protected Object[] getArray(int arraySize,char selec){
        Object[] array = new Object[arraySize];
        Random rand = new Random();
        
        if(selec == 'i'){
            for(int i = 0; i < arraySize ;i++ ){
                array[i] = rand.nextInt(100) + 1;
            }
        }else if(selec == 'd'){
           for(int i = 0; i < arraySize ;i++ ){
                array[i] = rand.nextDouble();
            } 
        }
        
        return array;
    }
    

    
   
}
