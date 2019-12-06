package hwpackone;

public class HelloWorld {

  //Main method, entry point of the application.
  public static void main(String[] args) {
    salute((args.length > 0) ? args[0] : "World");
  }

  private static void salute(String target) {
    System.out.println("Hello " + target + "!");
  }

}