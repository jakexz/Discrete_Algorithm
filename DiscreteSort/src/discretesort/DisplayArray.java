/*
 * What do?
 * License?
 * 
 */
package discretesort;

import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
public class DisplayArray {
    private static Object array[];
    private static int intArray[];
    
    DisplayArray(Object array[]){ // constructor that handles the array from arrayGen or an array of your choosing
        this.array = array;
    }

    DisplayArray(int intArray[]){
    	this.intArray = intArray;
    }
    DisplayArray(){}

    
    public void display(Object array[]){
        System.out.println("This is you array unsorted");
        
        for(int i = 0; i < array.length ; i++){ //prints the elements one by one
            System.out.print(array[i]+ ",");
        }
        
        System.out.println(  "\nWhat would you like to do?"                      //the selection menu
                + "\n\t1:Finding the maximum element in a finite sequence?"
                + "\n\t2:Search for a single object with linear search?"
                + "\n\t3:Search for a single object with binary search?"
                + "\n\t4:Sort the array with bubble sort?"
                + "\n\t5:Sort the array with insertion sort?"
                + "\n\t6:Make change and keep it?"
                + "\n\t7:Or schedule talks for no good reason?"
                + "\n\t8:Construct a b base expansion?"
                + "\nPlease enter a number between 1-8"
                    );
        
        Scanner input = new Scanner(System.in); //takes a number between 1 and 7 and do the operation accordingly
        int number;
        number = input.nextInt();
        // modified by Xiaoming  
        //b base expansion doesn't need an array, instead, the class have the static method take care of the rest of steps.
        if(number == 8)
        {
        	Base_B_Expansion.displayOption();
        }
        else
        {
        	do{           
                selection(number);
            }while(number > 0 || number < 8);
            
            System.out.println("Here is your array after the operation"); //prints the array 
            for(int i = 0; i < array.length ; i++){ 
                System.out.print(array[i]+ ",");
            }
        }      
                  
    } 
    
   protected static void selection(int number ){ //the bulk of the selection process
        switch(number){ //using the number input, it goes down the line and select the operation 
                case 1:
                   /* MaxElement.displayMax(array);*/break;
                case 2:
                    /*linear search*/ break;
                case 3:
                    /*binary search*/ break;
                case 4://{
                    
                   // BubbleSort bubble = new BubbleSort(array);
                    
                   // break;}
                case 5:
                    /*insertion sort*/ break;
                case 6:
                    /*make change*/ break;
                case 7:
                    /*schedule talk*/ break;
                default:{
                    System.out.println("Not in the range of selection");
                    break;
                }
        }
        
        
    }
}
