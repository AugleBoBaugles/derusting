import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> stringSet = new HashSet<String>();
    System.out.println(stringSet);

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    stringSet.add("ahh");
    stringSet.add("ahhhhh");
    stringSet.add("ahhhhhhhhhhhhh");
    System.out.println(stringSet);

    // Check whether the Set contains a given String
    System.out.println("contains \"ah\"? " + stringSet.contains("ah"));
    System.out.println("contains \"ahh\"? " + stringSet.contains("ahh"));

    // Remove an element from the Set
    stringSet.remove("ahh");
    System.out.println(stringSet);

    // Get the size of the Set
    System.out.println("size: " + stringSet.size());

    // Iterate over the elements of the Set, printing each one on a separate line
    for (String element : stringSet){
      System.out.println(element);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
