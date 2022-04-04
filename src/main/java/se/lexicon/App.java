package se.lexicon;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
      System.out.println(NameRepository.getSize());
      String [] names = {"Erik Svensson", "Mehrdad Javan"};
      NameRepository.setNames(names);
    System.out.println(NameRepository.getSize());

  }
}
