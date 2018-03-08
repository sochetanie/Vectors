package Vectors;

public class Mark{
  private float X;
  private float Y;
  Mark(float X, float Y){

    this.X=X;
    this.Y=Y;
  }
  float getX(){
    return X;
  }
  float getY(){
    return Y;
  }

  public String toString() {
    return "X: " + X + ", Y: " + Y;
  }
}
