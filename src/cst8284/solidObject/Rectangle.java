/**
 * 
 */
package cst8284.solidObject;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Mar 23, 2018  
 */
public class Rectangle extends Square {
  
  private double height;

  /**
   * 
   */
  public Rectangle() {
    this(1.0, 1.0); // default width and height to 1
  }

  public Rectangle(double width, double height) {
    super(width); // 
    this.setHeight(height);
  }

  public Rectangle(Rectangle rectangle) {
    this(rectangle.getWidth(), rectangle.getHeight());
  }
  
  public void setHeight(double height){
    this.height = height;
  }

  public double getHeight(){
    return this.height;
  }
  
  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getArea()
   */
  @Override
  public double getArea() {
    return this.getWidth() * this.getHeight();
  }

  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getPerimeter()
   */
  @Override
  public double getPerimeter() {
    return 2 * (this.getHeight() + this.getWidth());
  }

  // TODO test
  @Override
  public String toString(){
    return ("Rectangle Overrides " + super.toString());
  }
  
  // TODO test
  @Override
  public boolean equals(Object that) {
    return (that instanceof Rectangle && // are both Rectangles ?
            super.equals(that) &&  // have equal widths?
            this.getHeight() == ((Rectangle) that).getHeight() //have equal heights?
            );
  }
}
