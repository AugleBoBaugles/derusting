import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    System.out.println(myMap);


    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    myMap.put("i", 56);
    myMap.put("me", 23);
    myMap.put("mine", 99);
    System.out.println(myMap);

    // Get the value associated with a given key in the Map
    System.out.println(myMap.get("me"));

    // Find the size (number of key/value pairs) of the Map
    System.out.println("size: " + myMap.size());

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    myMap.replace("mine", 2);
    System.out.println(myMap);

    // Check whether the Map contains a given key
    System.out.println("Contains \"you\"? " + myMap.containsKey("you"));
    System.out.println("Contains \"me\"? " + myMap.containsKey("me"));

    // Check whether the Map contains a given value
    System.out.println("Contains \"1\"? " + myMap.containsValue(1));
    System.out.println("Contains \"2\"? " + myMap.containsValue(2));

    // Iterate over the keys of the Map, printing each key
    System.out.println("--- Keys ---");
    for (String key : myMap.keySet()){
      System.out.println(key);
    }
    System.out.println();

    // Iterate over the values of the map, printing each value
    System.out.println("--- Values ---");
    for (int val : myMap.values()){
      System.out.println(val);
    }
    System.out.println();

    // Iterate over the entries in the map, printing each key and value
    System.out.println("--- Sets ---");
    for (String key : myMap.keySet()){
      System.out.println(key + " - " + myMap.get(key));
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
