public class MyRectangle2D {

     double x;
    double y;
    double height;
    double width;

    double getX() {

        return x;
    }

    double getY() {

        return y;
    }

    void setX(double _x) {

        x = _x;
    }

    void setY(double _y) {

        y = _y;
    }

    double getHeight() {

        return height;
    }

    double getWidth() {

        return width;
    }

    void setHeight(double _height) {

        height = _height;
    }

    void setWidth(double _width) {

        width = _width;
    }

    MyRectangle2D() {

        x = 0;
        y = 0;
        height = 1;
        width = 1;

    }

    MyRectangle2D(double _x, double _y, double _width, double _height) {

        x = _x;
        y = _y;
        width = _width;
        height = _height;

    }

    double getArea() {

        return width * height;
    }

    double getPerimeter() {

        return 2 * (width + height);
    }

    boolean contains(double newX, double newY) {

        if (newX <= x + width / 2 && newX >= x - width / 2 && newY <= y + height/2 && newY >= y + height/2) {

            return true;
        }else{
            return false;
        }

    }

    boolean contains(MyRectangle2D rec) {

        double newX = rec.x;
        double newY = rec.y;

        double newHeight = rec.height;
        double newWidth = rec.width;

        if (contains(newX, newY)) {

            double thisLeftMost = x + width / 2;
            double thisRightMost = x - width / 2;
            double thisUpMost = y + height / 2;
            double thisDownMost = y - height / 2;

            double newLeftMost = newX + newWidth / 2;
            double newRightMost = newX - newWidth / 2;
            double newUpMost = newY + newHeight / 2;
            double newDownMost = newY - newHeight / 2;

            if (thisLeftMost >= newLeftMost && thisRightMost <= newRightMost && thisDownMost <= newDownMost && thisUpMost >= newUpMost) {
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }

    }

    boolean overlaps(MyRectangle2D rec) {
        double newX = rec.x;
        double newY = rec.y;

        double newHeight = rec.height;
        double newWidth = rec.width;

        if (contains(rec)) {
            return false;
        }

        if (Math.abs(x - newX) < 0.5 * (width + newWidth) && Math.abs(y - newY) < 0.5 * (height + newHeight)) {
            return true;
        }else{
            return false;
        }
    }
 }
