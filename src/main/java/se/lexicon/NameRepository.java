package se.lexicon;


// Class: A class is a logical template or blueprint
// to create objects for sharing the common properties and methods

/**
 * Stores names in a String array
 * @author Mehrdad Javan
 * @version 1.0
 * @since 2022-04-04
 */
public class NameRepository {

  // Fields or Variables
  // A variable is a container that stores values
  // Array is a data structure or group or collection of elements with the same data types


  private static String[] names = new String[0];

  // Method is a block of code which only runs when it is called
  // it is a collection of statements that grouped together to perform an operation

  /**
   * Returns number of element in the array
   *
   * @return int This returns length of elements in names array
   */
  public static int getSize(){
    return names.length;
  }

  /**
   * Sends in an array that set the private static array.
   * This should replace all existing names.
   *
   * @param names This is an array of names
   */
  public static void setNames(String[] names) {
    // use Arrays.copyOf()
    NameRepository.names = names;
  }


}
