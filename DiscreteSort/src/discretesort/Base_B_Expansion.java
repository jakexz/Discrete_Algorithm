package discretesort;
import java.util.*;
/*
 * @author:  Xiaoming Chen
 */
public class Base_B_Expansion
{
	/*************************************************************************************
	* Method that displays the user selection option, validates user input and generate the
	* b expansions based on user's selection. 
	* 
	* This is the only method will be invoked by the outside
	*************************************************************************************/
   public static void displayOption()
   {
	   String result;
	   Scanner in = new Scanner(System.in);
	   System.out.println("Welcome to use base b expansions generator, please make a selection: ");
	   System.out.println("Press 1: System self-generates target integer and base");
	   System.out.println("Press 2: Enter your own target integer and base");
	   System.out.print("Please make a selection: ");
	   String userInput = in.next();
	   
	   
	   if(userInput.equals("1"))
	   {
		   result = selfGenExpansion();
	   }
	   else if (userInput.equals("2"))
	   {
		   result = userInputExpansion();
	   }
	   else
	   {
		   result ="invalid input";
	   }
	   in.close();
	   System.out.println(result);
   }
   
   
    /*************************************************************************************
	* Method that self-generates the dividend and the base and calculates the expansion
	* based on the result of self-generation.
	*  
	* @ return A string contains the Base b expansion
	*************************************************************************************/
   protected static String selfGenExpansion()
   {
	   int div = (int)(Math.random()*99999)+100;
	   int base =  (int)(Math.random()*10)+1;
	   
	   String result = Constructing_Base_b_Expansions(div, base);
	   	   
	   return result;
   }
   
   
    /*************************************************************************************
	* Method that generates the b expansion based on user input
	*  
	* @ return A string contains the Base b expansion
	*************************************************************************************/
   protected static String userInputExpansion()
   {
	   Scanner in = new Scanner(System.in);
	   System.out.print("Please enter the value you wanna divide : ");
	   int div = in.nextInt();
	
	   System.out.print("Please enter the base: ");
	   int base = in.nextInt();
	   in.close(); 
	   
	   String result = Constructing_Base_b_Expansions(div, base);
	   
	   return result;
   }
   
    /*************************************************************************************
	* Method that generates the b expansion based on user input
	*  
	* @ return A string contains the Base b expansion
	*************************************************************************************/
   protected static String Constructing_Base_b_Expansions(int div, int base)
   {
	   String stringDiv = String.valueOf(div);
       StringBuilder tempString = new StringBuilder();
       String finalString;
       String temp;
       
       while(div/base >= 1)
       {
    	   temp = String.valueOf(div%base);
    	   if(base == 16)
    	   {
    		   temp = HexadecimalFormer(temp);
    	   }
    	   div = div/base;
    	   tempString.append(temp);
       }
	   tempString.append(div);	   
	   finalString =String.valueOf(tempString.reverse());
	   String result = finalString+" is the base "+ base+" expansion of "+stringDiv;
	   
	   return result;
   }  
  
   /*************************************************************************************
	* Method that converts the number into Hexadecimal form
	*  
	* @ return A string within Hexadecimal form
	*************************************************************************************/ 
   protected static String HexadecimalFormer(String temp)
   {
	   switch (temp)
	   {
	   case "10":
		   temp = "A";
		   break;
	   case "11":
		   temp = "B";
		   break;
	   case "12":
		   temp = "C";
		   break;
	   case "13":
		   temp = "D";
		   break;
	   case "14":
		   temp = "E";
		   break;
	   case "15":
		   temp = "F";
		   break;
	   }	   
	   return temp;
   }
}
