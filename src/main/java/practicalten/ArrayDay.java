package practicalten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** Program demonstrates usage of the arrays.
*
* <p>Bugs: This program has bugs and is missing source code.
*
* @author Add Your Name Here
**/
public class ArrayDay {

  /** Main method to start execution.
  */
  public static void main(String[] args) throws IOException {
    File file = new File("input/days.txt");
    Scanner scan = new Scanner(file);
    
    String [] days = new String[7];
    int index = 0;
    while (scan.hasNext()) {
      days[index] = scan.next();
      index++;
    }
    // TODO: Using a for loop, print whether each element of 'days' is a weekday or a weekend.

  }
}
