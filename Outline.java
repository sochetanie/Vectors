package Vectors;

public class Outline {
  private int R;

  Outline(int R) {
    this.R = R;
  }

  private boolean didBelongstoFirstQuater(float X, float Y) {
    return Math.sqrt(X*X+Y*Y)<=R&&X>=0&&Y>=0;
  }
  
  private boolean didBelongsToSecondQuater(float X, float Y) {
    return X>=Y-R&&X<=0&&Y>=0;
  }

  private boolean didBelongsToThirdQuater(float X, float Y) {
    return false;
  }

  private boolean didBelongsToFourthQuater(float X, float Y) {
    return X>=0&&X<=R&&Y>=-R&&Y<=0;
  }

  boolean didBelongsToOutline(Point point) {
    float X= point.getX();
    float Y= point.getY();

    return didBelongstoFirstQuater(X,Y)
        ||didBelongsToSecondQuater(X,Y)
        ||didBelongsToThirdQuater(X,Y)
        ||didBelongsToFourthQuater(X,Y);
  }
}