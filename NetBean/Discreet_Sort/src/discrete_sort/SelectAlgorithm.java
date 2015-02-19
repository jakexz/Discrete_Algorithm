/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discrete_sort;

/**
 *
 * @author Jakexz
 */

import java.util.Arrays;
import java.util.Scanner;

public class SelectAlgorithm {
    protected String[] strArray;
    protected int[] intArray;
    protected double[] dubArray;

    /*******************Constructors**********/
    protected SelectAlgorithm (String strArray[]){
        this.strArray = strArray;
    }
    protected SelectAlgorithm (int intArray[]){
        this.intArray = intArray;
    }    
    protected SelectAlgorithm (double dubArray[]){
        this.dubArray = dubArray;
    }
    protected SelectAlgorithm (){}
    /*******************Selection Method**********/
    protected void selection(){
        int selectionNumber =0;//creates a selecton number
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Welcome to Discrete Sort"
                + "\nHow would you like to go about this"
                + "\n\t1.Generate an integer array"
                + "\n\t2.Generate an integer array with a specific size of your choosing"
                + "\n\t3.Generate a decimal array"
                + "\n\t4.Generate a decimal array with a specific size of your choosing"
                + "\n\t5.Create a string array"
                + "\n\t6.Go straight to the sorting algorithms");
        
        selectionNumber = input.nextInt(); //handling which menu # to use
        while(selectionNumber = ){
            if(selectionNumber >= 1 && selectionNumber <=6)
                submenu(selectionNumber);
            else{
                System.out.println("Not a number!\n"
                        + "Do it again: ");
                selectionNumber = input.nextInt(); //initializing array generato
            }
        }
        
        
        
    }
   
    private void submenu(int select){
        ArrayGen anArray = new ArrayGen();//creates an array 
        Scanner input = new Scanner(System.in);//creates the input for user
        int take;
        //subselect to print out the array user just generated
        switch(select){
            case 1:{ //integer array with predetermined size
                intArray = anArray.createIntArray();
                System.out.println("Done! " + Arrays.toString(intArray));break;
            }
            case 2:{ //custom integer array
                System.out.print("What Size: ");
                take = input.nextInt();
                intArray = anArray.createIntArray(take);
                System.out.println("Done! " + Arrays.toString(intArray));break;
            }
            case 3:{//predetermined decimal array
                dubArray = anArray.createDoubleArray();
                System.out.println("Done! " + Arrays.toString(dubArray));break;
            }
            case 4:{//custom size decimal array
                System.out.print("What Size: ");
                take = input.nextInt();
                dubArray = anArray.createDoubleArray(take);
                System.out.println("Done! " + Arrays.toString(dubArray));break;
            }
            case 5:{//custom string array
                System.out.print("What Size: ");
                take = input.nextInt();
                strArray = new String[take];
                for(int i = 0; i <strArray.length ;++i){
                    strArray[i] = input.next();
                }
                System.out.println("Done! " + Arrays.toString(strArray));break;
            }
            case 6:{
                sortSelect();break;
            }
        }
    }
    
    private void sortSelect(){
        
    }
}