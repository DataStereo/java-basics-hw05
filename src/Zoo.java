import java.util.List;

public class Zoo {
  public static void feed(List<? extends Bird> list) {
    System.out.println("Feeding birds");
    for (Bird bird : list) {
      System.out.println("Feeding " + bird);
    }
  }

  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Accepting a bird to the flying section");
    bird.checkWings();
    list.add(bird);
    System.out.println("Added " + bird + " to the flying section");
  }

  public static void registerBird(List<Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    System.out.println("Added " + newBird + " to the birds list");
  }
}