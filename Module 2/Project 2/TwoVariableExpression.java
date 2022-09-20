import java.util.Scanner;
/**
*Simple program that calcluates a spceified expression.
*
*Project 2
@author Makayla McAdoo - COMP 1210
@version 09/01/2021
*/
public class TwoVariableExpression 
{
/**
*Prints results based on the x and y input.
*@param args Command line arguments - not used
*/
   public static void main(String[]args) {
   
   //declare variables
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double xVar = 0;
      double yVar = 0;
      double result = 0;
      //Print the equation used to calculate the result
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
      //Prompt the user for the x variable
      System.out.print("\tx = ");
      xVar = userInput.nextDouble();
      //Prompt the user for the y variable
      System.out.print("\ty = ");
      yVar = userInput.nextDouble();
      //display calculations
      System.out.print("result ");
      if (xVar * yVar == 0) { //result will be undefined
         System.out.println("is \"undefined\"");
      }
      else { //calculate result
         result = (((4.5 * xVar) + 12.5) * ((3 * yVar) - 9.0)) / (xVar * yVar);
         System.out.println("= " + result);
      }
      
   }
}
