import java.util.Scanner;
/**
*Program that converts seconds into the days, hours, minutes, and seconds.
*
*Project 1
@author Makayla McAdoo - COMP 1210
@version 09/10/2021
*/
public class TimeInSeconds
{
/**
*Converts seconds if the input is positive.
*@param args Command line arguments - not used
*/
   public static void main(String[]args) {
   //declare variables
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int numDays = 0;
      int numHours = 0;
      int numMinutes = 0;
      int numSeconds = 0;
      int rawSeconds = 0;
   //Prompt the user for the raw time in seconds
      System.out.print("Enter the raw time in seconds: ");
      rawSeconds = userInput.nextInt();
   //Display the raw time in seconds conversion
      if (rawSeconds < 0) { //stop calculation
         System.out.println("*** Time must be non-negative. ***");
      }
      else { //convert raw time in seconds
         System.out.println();
         System.out.println("Time by combined days, hours, minutes, seconds:");
         numDays = (rawSeconds / 86400);
         numHours = ((rawSeconds % 86400) / 3600);
         numMinutes = (((rawSeconds % 86400) % 3600) / 60);
         numSeconds = (((rawSeconds % 86400) % 3600) % 60);
      
         System.out.println("\tdays: " + numDays);
         System.out.println("\thours: " + numHours);
         System.out.println("\tminutes: " + numMinutes);
         System.out.println("\tseconds: " + numSeconds);
         System.out.println();
         System.out.println(rawSeconds + " seconds = " + numDays + " days, "
            + numHours + " hours, " + numMinutes + " minutes, " + numSeconds
             + " seconds");
         
      }
   
   
   }
   
   
}
