import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> stringList = new ArrayList<String>();
    System.out.println(stringList);

    // Add 3 elements to the list (OK to do one-by-one)
    stringList.add("hello");
    stringList.add("world");
    stringList.add("!");
    System.out.println(stringList);

    // Print the element at index 1
    System.out.println(stringList.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    stringList.set(1, "you");
    System.out.println(stringList);

    // Insert a new element at index 0 (the length of the list will change)
    stringList.add(0, "why");
    System.out.println(stringList);

    // Check whether the list contains a certain string
    System.out.println("Does the list contain \"hello\"? " + stringList.contains("hello"));
    System.out.println("Does the list contain \".\"? " + stringList.contains("."));

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < stringList.size(); i++) {
      System.out.println("Index: " + i + " Value: " + stringList.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(stringList);
    System.out.println(stringList);

    // Iterate over the list using a for-each loop
    // Print each value on a second line --a seperate line?
    for (String string : stringList) {
      System.out.println(string);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}