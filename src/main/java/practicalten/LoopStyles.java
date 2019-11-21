package practicalten;

/** Program demonstrating usage of the do while and for loops with an array.
*
* <p>Bugs: This program has bugs and is missing source code.
*
* @author Add Your Name Here
**/
public final class LoopStyles {

  public static void main(String[] args) {
    String[] flavours = {"chocolate","strawberry","vanilla","mint","caramel","pistachio","pecan"};

    useDoWhileLoop(flavours);

    useForLoop(flavours);
  }

  private static void useDoWhileLoop(String[] flavours) {
    // TO DO: rewrite this loop as a do..while loop
    int count = 0;
    while (count < flavours.length) {
      System.out.println(flavours[count]);
      count++;
    }
  }

  private static void useForLoop(String[] flavours) {
    // TO DO: rewrite this loop as a for loop
    int count = 0;
    while (count > flavours.length) {
      System.out.println(flavours[count]);
      count++;
    }
  }
}
