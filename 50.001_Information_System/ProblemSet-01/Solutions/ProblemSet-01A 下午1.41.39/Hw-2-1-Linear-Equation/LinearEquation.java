public class LinearEquation{

  private double a;
  private double b;
  private double c;
  private double d;
  private double e;
  private double f;

  LinearEquation(double _a, double _b, double _c, double _d, double _e, double _f) {

    this.a = _a;
    this.b = _b;
    this.c = _c;
    this.d = _d;
    this.e = _e;
    this.f = _f;

  }

  double getA() {
    return this.a;
  }

  double getB() {
    return this.b;
  }

  double getC() {
    return this.c;
  }

  double getD() {
    return this.d;
  }

  double getE() {
    return this.e;
  }

  boolean isSolvable() {
    if (this.a * this.d - this.c * this.b == 0) {
      return false;
    }else {
      return true;
    }
  }

  double getX() {
    return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.c * this.b);
  }

  double getY() {
    return (this.a * this.f - this.c * this.e) / (this.a * this.d - this.c * this.b);
  }
}
