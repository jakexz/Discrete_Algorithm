

public class Greedy_Change_Making_Algorithm {

	public static void main(String[] args) {
		String[] coins = { ".25", ".10", ".05", ".01" };
		String[] value = { "0.81" };
		
		String displayResult = greedyChangeMaker(coins, value);
		System.out.println(displayResult);
	}
    
	/*  The Greedy Change Making Algorithm 6 (page 199) is "for making change using any finite set 
	    of coins with denominations": quarter, dime, nickel, and penny.  "This algorithm leads to an
	    optimal solution in the sense that it uses the fewest coins possible."  
	    	parameter: coinTypeArray- String array of coin types  e.g. { .25, .10, .05, .01 }
	    	parameter: totalChangeAmount- String array of single value representing amount for coin conversion
	    	           (this amount should be less than $1 practically, but will work with $1+ amounts)
	*/
	
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
