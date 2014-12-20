/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays.*;
/**
 *
 * @author nolanb
 */
//  procedure insertion sort(a1, a2, . . . , an: real numbers with n ≥ 2)
//for j := 2 to n
//i := 1
//while aj > ai
//i := i + 1
//m := aj
//for k := 0 to j − i − 1
//aj−k := aj−k−1
//ai := m
//{a1, . . . , an is in increasing order}
public class InsertionSort {
   static int j;
   static int i;
   static int m[];
    private static int k;
    private static int l;
    private static int n;
    //private static int[] numbers2;
  
    List sortList= new ArrayList  () ;
   
   @SuppressWarnings("empty-statement")
   public static int Sorter(){
        
     
   
 
 
        int[] numbers = {3, 2, 4, 1, 5};
        n = numbers.length;
        String ac = java.util.Arrays.toString(numbers);
        System.out.println("first array " + new String(ac));
        java.util.Arrays.sort(numbers, 0, 4);
        int[] aj;
        aj = java.util.Arrays.copyOf(numbers, n);
        for (i = 0; i < aj.length; i++) {
        }
        String ab = java.util.Arrays.toString(aj);

//    

        System.out.println("new array " + new String(ab));
        return n;

    }
}

