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
public class Discrete_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intArray[] = {1,2,3,4,5};
        double dubArray[] = {1.1,2.2,3.3,4.4,5.5};
        String strArray[] = {"Alice", "Bob", "Chad"};
        
        /*MaxElement me = new MaxElement(strArray,intArray,dubArray);
        me.getMaxElement(intArray);
        me.getMaxElement(dubArray);
        me.getMaxElement(strArray);
        
        ArrayGen intArray1 = new ArrayGen();
        intArray1.createIntArray();
        me.getMaxElement(intArray1.intArray);
        
        ArrayGen intArray2 = new ArrayGen();        
        intArray2.createIntArray(7);
        me.getMaxElement(intArray2.intArray);
        
        
        ArrayGen doubleArray1 = new ArrayGen();
        doubleArray1.createDoubleArray();
        ArrayGen doubleArray2 = new ArrayGen();
        doubleArray2.createDoubleArray(8);
        me.getMaxElement(doubleArray1.dubArray);
        me.getMaxElement(doubleArray2.dubArray); */
        
        SelectAlgorithm select = new SelectAlgorithm();
        select.selection();
    }
    
}
