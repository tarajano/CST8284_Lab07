package cst8284.solidObject;

public class SolidObject <T extends BasicShape> {

  // : Use the UML diagram to create the members required
  private double depth;
  private T shape;
  
  public double getDepth() {
    return depth;
  }

  public void setDepth(double depth) {
    this.depth = depth;
  }

  public T getShape() {
    return shape;
  }

  public void setShape(T shape) {
    this.shape = shape;
  }
  
  SolidObject(T shape, double depth){
    this(shape);
    this.setDepth(depth);
  }
  
  SolidObject(T shape){
    this.setShape(shape);
    this.setDepth(shape.getWidth());
  }

  public double getVolume() {
    return this.getShape().getArea() * this.getDepth();
  }
  
  public double getSurfaceArea() {
    return  this.getShape().getPerimeter() * this.getDepth() +
            this.getShape().getArea() * 2;
  }
  
  public String toString(){
    String solidTypeEquivalent = "unknown   ";
    String className = getShape().getClass().toString();
    className = className.substring(className.lastIndexOf('.')+1);
    switch (className) {
    case "Circle": solidTypeEquivalent = "cylinder "; break;
    case "Square": solidTypeEquivalent = "cube     "; break;
    case "Rectangle": solidTypeEquivalent = "block    "; break;
    case "Triangle": solidTypeEquivalent = "prism    "; break;
    }	
    return solidTypeEquivalent;
  }

}
