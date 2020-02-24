import java.util.Scanner;
 
/**
* Author: Simon Cordero
* Last Updated: 2020/02/23
* This Program calculates how long the microwave should be on for.
*/
class Microwave {
  public static void main(String[] args) {
    
    int foodType;
    int quantity;
    double time = 0;
    double cookTime;
    
    Scanner wordScanner = new Scanner(System.in);
    
    try {
      System.out.println("To choose a food option, enter the numbers" 
          + " [1] for a Sub; [2] for Pizza; [3] for Soup"); 
      foodType = wordScanner.nextInt();
      System.out.println("Enter how many you would like to heat up."); 
      quantity = wordScanner.nextInt();

      if (quantity > 3 | quantity < 1) {
        System.err.println("Choose between one to three only.");
      }
      if (foodType == 1) {
        time = 60;
        
      } else if (foodType == 2) {
        time = 45;
        
      } else if (foodType == 3) {
        time = 105;
        
      } else {
        System.err.println("Enter 1-3 only");
        
      }
      cookTime = time + time * (0.5 * (quantity - 1));
      System.out.println("----------------------------------------");
      System.out.println("The timer has been set for " + cookTime + " seconds");
      
    } catch (NumberFormatException nfe) {
      System.err.println("Invalid");
      
    }
    
  }
  
}