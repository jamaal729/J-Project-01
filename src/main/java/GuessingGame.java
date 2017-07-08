import java.util.Scanner;

public class GuessingGame {
  
  public static void main(String[] args) {
      
    String itemName;
    int maxItems;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.printf("%nAdministrator setup:%n");
    
    System.out.printf("What type of item should the jar contain: ");
    itemName = scanner.next();
    
    System.out.printf("What is the maximum amount of %s? ", itemName);
    maxItems = scanner.nextInt();
      
    Jar jar = new Jar(itemName, maxItems);
    
    System.out.printf("%nPlay game:%n");
    
    int actualItems = jar.fill();
    
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %s:%n",
                   itemName, maxItems);
    
    int guess = 0;
    int attempts = 0;
    
    while (guess != actualItems) {
      System.out.printf("Guess: ");
      guess = scanner.nextInt();
      attempts++;
    }
    
    System.out.printf("Great! You got it in %s attempts!%n%n", attempts);      
  }
  
}