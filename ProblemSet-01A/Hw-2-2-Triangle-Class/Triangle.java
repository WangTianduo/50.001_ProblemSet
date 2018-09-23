class Triangle extends GeometricObject {

  private double side1;
  private double side2;
  private double side3;

  Triangle() {
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
  }

  Triangle(double _side1, double _side2, double _side3) {
    this.side1 = _side1;
    this.side2 = _side2;
    this.side3 = _side3;
  }

  double getArea() {
    double p = getPerimeter() / 2;
    return Math.sqrt((p * (p - side1) * (p - side2) * (p - side3)));
  }

  double getPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  public String toString() {
    return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
  }

}
