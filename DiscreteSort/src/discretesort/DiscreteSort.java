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
        // TODO code application logic here
    	
    	
    	
    	// Begin - Section for Algorithm 6 -Greedy Change Maker 
		String[] coins = { ".25", ".10", ".05", ".01" }; // Coin denominations
		String[] value = { "0.81" };                     // $ amount to convert into coins		
		String displayResult = greedyChangeMaker(coins, value);
		System.out.println(displayResult);
		// End - Section for Algorithm 6 -Greedy Change Maker 
    }
    
    // Algorithm 6 - Greedy Change Maker
    protected static String greedyChangeMaker(String[] coinTypeArray, String[] totalChangeAmt) {
		String result = "";
		int sameCoinQuantity = 0;
		// coin value times 100 to work around precision problem of 'double' datatype
		double totalChangeAmount = Double.parseDouble(totalChangeAmt[0]) * 100;
		double workingBalance = totalChangeAmount;
		double coinType;

		for (int i = 0; i < coinTypeArray.length; i++) {
			// conversion of array string value to double x 100
			coinType = Double.parseDouble(coinTypeArray[i]) * 100;

			while (workingBalance >= coinType) {
				// same coin-type quantity counter
				sameCoinQuantity++;
				// decrease balance with each coin type
				workingBalance -= coinType;
			}
			// build string to record coin-type and coin-quantity
			result += coinTypeArray[i] + ": " + sameCoinQuantity + "    ";
			// reset same coin-type quantity counter
			sameCoinQuantity = 0;		
		}
		return result;
	}
    
}
