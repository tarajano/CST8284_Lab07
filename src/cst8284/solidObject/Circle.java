/**
 * 
 */
package cst8284.solidObject;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Mar 22, 2018  
 */
public class Circle extends BasicShape {

  /* 
   * In Circle class, the width is equivalent to the circle's perimeter.
   * This is reflected in the computation of circle's area and perimeter.  
   */
  
  public Circle() {
    this(1.0);  // default width = diameter = 1
  }
  
  public Circle(double width) {
    this.setWidth(width); 
  }
  
  public Circle(Circle circle) {
    this(circle.getWidth()); 
  }

  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getArea()
   */
  @Override
  public double getArea() {
    return Math.pow(this.getWidth()/2, 2) * Math.PI;
  }

  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getPerimeter()
   */
  @Override
  public double getPerimeter() {
    return this.getWidth() * Math.PI;
  }
  
  // TODO test
  @Override
  public String toString(){
    return ("Circle Overrides " + super.toString());
  }

  // TODO test
  public boolean equals(Object that) {
    return (that instanceof Circle &&
            this.getWidth() == ((Circle) that).getWidth());
  }

}
