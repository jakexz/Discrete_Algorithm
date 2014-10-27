/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discretesort;

/**
 *
 * @author Jakexz
 */
public class DiscreteSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayGen a1 = new ArrayGen(); 
       a1.getArray(5);// TODO code application logic here
       for(int i = 0; i < a1.arraySize; i++){
           System.out.println(a1.intArray[i]);
       }
       
    }
    
}
