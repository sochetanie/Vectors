package Vectors;

import java.util.*;

public class Vectors {
  public static void main(String[] args){
    try{
      Vector<Mark> marks = new Vector<Mark>(){{add(new Mark(5f,4f));
        add(new Mark(1f,-1f));
        add(new Mark(3f,-5f));
        add(new Mark(2f,-2f));
        add(new Mark(-3f,-5f));
        add(new Mark(0f,-1f));
        add(new Mark(-5f, 3f));
      }};
      System.out.println("Entered value R (integer, non-negative, number is not greater than 2147483647)");
      int R=(new Scanner(System.in)).nextInt();
      if (R<0)
        throw new InputMismatchException();
      Outline outline = new Outline(R);
      for(Mark mark: marks){
        System.out.print("Point with coordinates"+mark);
        if(outline.didBelongsToOutline(mark)){
          System.out.println(" in area");
        }
        else{
          System.out.println(" not in area");
        }
      }
    }
    catch(InputMismatchException e){
      System.out.println("The entered value must be a non-negative integer not greater than 2147483647");
    }
  }
}
