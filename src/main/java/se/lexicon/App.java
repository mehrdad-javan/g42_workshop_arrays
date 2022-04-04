package se.lexicon;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    System.out.println(NameRepository.getSize());
    String[] names = {"Erik Svensson", "Mehrdad Javan", "Erik Alfredsson"};
    NameRepository.setNames(names);
    System.out.println(NameRepository.getSize());
    //NameRepository.clear();
    System.out.println(NameRepository.getSize());
    System.out.println(Arrays.toString(NameRepository.findAll()));
    System.out.println(NameRepository.find("Mehrdad Javan"));
    System.out.println(NameRepository.find("Test Test1"));
    System.out.println(NameRepository.add("Simon Elbrink"));
    System.out.println(Arrays.toString(NameRepository.findAll()));
    boolean newName = NameRepository.add("Mehrdad Javan");
    if (newName){
      System.out.println("Name is Added to Array");
    } else {
      System.out.println("Name is Duplicate!");
    }

    System.out.println(Arrays.toString(NameRepository.findAll()));

    System.out.println(Arrays.toString(NameRepository.findByFirstName("Erik")));


  }
}
