package se.lexicon;


// Class: A class is a logical template or blueprint
// to create objects for sharing the common properties and methods

import com.sun.xml.internal.ws.api.ha.StickyFeature;

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
    return null;
  }


  /**
   * Should add a new name to the array.
   * Returns true when name was added and false when the array contains the name
   *
   */
  public static boolean add(final String fullName) {
    // step1: traverse on array
    // step2: split the current element of array with whitespace and get the firstName
    // step3: write a condition to compare element name with method parameter
    // step4: define an empty array 
    // step5: add the found name to array (expand the existing array)
    // step6: return the array

    String result = find(fullName); // reuse the find method
    if (result != null){
      return false;
    }

    names = addToArray(names, fullName);
    return true;
  }

  private static String [] addToArray(String[] source, String newName){
    String [] tmp = Arrays.copyOf(source, source.length + 1);
    tmp[tmp.length - 1] = newName;
    return tmp;
  }


  public static String[] findByFirstName(final String firstName){

    // step1: traverse on array
    // step2: split the fullName with whitespace and get the firstName
    // step3: write a condition or if statement
    // step4: define an empty array + add the found names to array
    // step5: return the array

    String [] result = {};
    for (String element: names){
      String[] fullNameArray = element.split(" "); //["Erik", "Svensson"]
      String fName = fullNameArray[0];
      if (fName.equalsIgnoreCase(firstName)){
        result = addToArray(result, element);
      }
    }
    return result;
  }

  public static String[] findByLastName(final String lastName){
    // todo: do it later
    return null;
  }


  public static boolean update(final String original, final String updatedName) {
    int originalIndex = -1;
    for (int i = 0; i < names.length; i++) {
      String content = names[i];
      if (content.equalsIgnoreCase(original)) {
        originalIndex = i;
      }
    }
    if (originalIndex == -1) {
      return false;
    }

    int updatedIndex = -1;
    for (int i = 0; i < names.length; i++) {
      String content = names[i];
      if (content.equalsIgnoreCase(updatedName)) {
        updatedIndex = i;
      }
    }

    if (updatedIndex != -1) {
      return false;
    }
    names[originalIndex] = updatedName;

    return true;
  }


  public static boolean remove(String fullName) {

    Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
    int findIndex = Arrays.binarySearch(names, fullName);
    if (findIndex < 0) {
      return false;
    }
    String[] anotherArray = new String[names.length - 1];
    int sequencer = 0;
    for (int i = 0; i < names.length; i++) {
      if (i == findIndex) {
        continue;
      }
      anotherArray[sequencer++] = names[i];
    }
    names = anotherArray;
    return true;
  }



}
