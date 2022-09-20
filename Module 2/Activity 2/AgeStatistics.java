import java.util.Scanner;
/**
*Program that prints someone's name,age,and gender prompt.
*Program that converts age and calculates max heart rates.
*Activity 2
*@author Makayla McAdoo- COMP1210
*@version 08/30/2021
*/
public class AgeStatistics {
/**
*Prints the prompts, age converter, and heart rate calculations.
*
*@param args Commans line arguments - not used
*/
   public static void main(String[] args) {
   
   //declare variables
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      //convert age:
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries.");
      //display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) { //calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else { //calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
            
      
      }
      System.out.println(maxHeartRate + " beats per minute.");
   }
}
