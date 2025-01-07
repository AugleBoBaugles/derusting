import java.util.Arrays;

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] stringList = new String[4];
    System.out.println(Arrays.toString(stringList));

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    stringList[0] = "hi";
    stringList[1] = "hello";
    stringList[2] = "howdy";
    stringList[3] = "hey";
    System.out.println(Arrays.toString(stringList));

    // Get the value of the array at index 2
    String element2 = stringList[2];
    System.out.println("Element at index 2: " + element2);

    // Get the length of the array
    int stringListLength = stringList.length;
    System.out.println("Length: " + stringListLength); 

    // Iterate over the array using a traditional for loop and print out each item
    System.out.println("--- Traditional For Loop ---");
    for (int i = 0; i < stringList.length; i++){
      System.out.println(stringList[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    System.out.println("--- For Each Loop ---");
    for (String string : stringList){
      System.out.println(string);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
