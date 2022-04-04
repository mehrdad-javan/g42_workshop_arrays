package se.lexicon;


// Class: A class is a logical template or blueprint
// to create objects for sharing the common properties and methods

import java.util.Arrays;

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

  /**
   * Should completely empty the array.
   */
  public static void clear(){
     names = new String[0];
  }


  /**
   * Returns all names in a new array
   *
   * @return String[] This returns all array elements
   */
  public static String[] findAll(){
    return Arrays.copyOf(names, names.length);
  }


  public static String find(final String fullName){
    // step 1: define a loop
    // step 2: compare the element with fullName or if condition
    // return the result

    for (String element : names){
      if (element.equalsIgnoreCase(fullName)){
        return element;
      }
    }
    return "Error: Data not found";
  }



}
