
import java.util.Random;

public class Jar {
  
  private String itemName;
  private int maxItems;
  
  public Jar(String itemName, int maxItems) {
    this.itemName = itemName;
    this.maxItems = maxItems;  
  }  
 
  public int fill() {
    Random random = new Random();
    int numItems = 1 + random.nextInt(maxItems);
    return numItems;
  }

}