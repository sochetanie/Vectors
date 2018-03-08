package Vectors;

import java.util.*;

public class Vectors {
  public static void main(String[] args){
    try{
      Vector<Point> marks = new Vector<Point>(){{add(new Point(5f,4f));
        add(new Point(1f,-1f));
        add(new Point(3f,-5f));
        add(new Point(2f,-2f));
        add(new Point(-3f,-5f));
        add(new Point(0f,-1f));
        add(new Point(-5f, 3f));
      }};
      System.out.println("Entered value R (integer, non-negative, number is not greater than 2147483647)");

      int R = (new Scanner(System.in)).nextInt();
      if (R<0)
        throw new InputMismatchException();
      Outline outline = new Outline(R);
      for (Point mark: marks) {
        System.out.print("Point with coordinates"+mark);
        if (outline.didBelongsToOutline(mark)) {
          System.out.println(" in area");
        }
        else{
          System.out.println(" not in area");
        }
      }
    }
    catch(InputMismatchException e) {
      System.out.println("The entered value must be a non-negative integer not greater than 2147483647");
    }
  }
}
