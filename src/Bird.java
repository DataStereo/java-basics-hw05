import java.lang.reflect.Modifier;

public abstract class Bird {

  public void eat() {
    System.out.println("The bird is eating");
    System.out.println(Modifier.isAbstract(Bird.class.getModifiers()) + "THE RESULT OF THE TEST");
  }
}

