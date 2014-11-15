/*
 * What do?
 * License?
 * 
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
        // TODO code application logic here
		
       ArrayGen a1 = new ArrayGen(); 
       Object[] array = a1.getArray(5,'i');// TODO code application logic here
       DisplayArray disp = new DisplayArray(array);
       disp.display(array);
       
    }
    
}
