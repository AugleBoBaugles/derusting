import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myString = "bagels";
    System.out.println(myString);

    // Find the length of the string
    int myStringLength = myString.length();
    System.out.println("length: " + myStringLength);

    // Concatenate (add) two strings together and reassign the result
    myString = myString + myString;
    System.out.println("new string: " + myString);

    // Find the value of the character at index 3
    char value3 = myString.charAt(3);
    System.out.println("value at index 3: " + value3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println("contains \"abc\"? " + myString.contains("abc"));
    System.out.println("contains \"age\"? " + myString.contains("age"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < myString.length(); i++) {
      System.out.println(i + ". " + myString.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> stringList= new ArrayList<String>();
    System.out.println(stringList);

    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("lipitytoo");
    stringList.add("lipitytah");
    stringList.add("lippytappy");
    stringList.add("tootah");
    System.out.println(stringList);

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String conglomString = String.join(",", stringList);
    System.out.println(conglomString);


    // Check whether two strings are equal
    System.out.println("Are \"this\" and \"that\" equal? " + "this".equals("that"));
    System.out.println("Is \"this\" and \"this\" equal? " + "this".equals("this"));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
