package practicaleleven;

/** Program illustrates how to call static methods a class
* from a method in the same class. Static methods are the methods
* that can be called without creating an instance of the object.
*
* <p>Bugs: This program has bugs and is missing source code.
*
* @author Add Your Name Here
*/
public class CallingMethodsInSameClass {

  public static void main(String args) {
    printOne();
    printOne();
    printTwo();
    // TODO: add printThree() method call
  }

  public static void printOne() {
    System.out.println("Nothing is impossible, the word itself says \"I'm possible\" !");
  }

  public static void printTwo() {
    printOne();
    printOne();
  }

  // TODO: write a new method called printThree() that calls method printTwo() one time
}
