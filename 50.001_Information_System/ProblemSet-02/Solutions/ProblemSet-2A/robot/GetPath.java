package robot;

import java.util.ArrayList;
import java.util.Stack;

public class GetPath {

    private static Stack<Point> optionSite = new Stack<>();
    private static Stack<Point> passedSite = new Stack<>();
    private static Point startPoint = new Point(0,0);

    private static Point end;
    private static int [][] adjustableGird;

    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {
        end = new Point(r, c);
        adjustableGird = new int[grid.length + 1][grid[0].length + 1];

        for (int i = 0; i < grid.length + 1; i++) {
            for (int j = 0; j < grid[0].length + 1; j++){
                if (i == grid.length || j == grid[0].length) {
                    adjustableGird[i][j] = 1;
                }else{
                    adjustableGird[i][j] = grid[i][j];
                }
            }
        }

        boolean result = findPath(startPoint);
        if (result == true){

            while(!passedSite.empty()) {
                path.add(0, passedSite.pop());
            }
            return result;
        }else {
            return result;
        }

    }

    private static boolean findPath (Point currentPoint) {

        passedSite.push(currentPoint);
        adjustableGird[currentPoint.r][currentPoint.c] = 2;

        if (currentPoint.r == end.r && currentPoint.c == end.c) {
            return true;
        }

        int previousR = currentPoint.r;
        int previousC = currentPoint.c;

        int change = 0;

        if (adjustableGird[currentPoint.r + 1][currentPoint.c] < 1) {
            optionSite.push(new Point(previousR + 1, previousC));
            change ++;
        }

        if (adjustableGird[currentPoint.r][currentPoint.c + 1] < 1) {
            optionSite.push(new Point(previousR, previousC + 1));
            change ++;
        }

        if (optionSite.empty()) {
            return false;
        }

        if (change == 0) {
            while (pointDistance(passedSite.peek(), optionSite.peek()) > 1) {
                passedSite.pop();
            }
        }
        Point nextPoint = optionSite.pop();
        return findPath(nextPoint);

    }

    private static int pointDistance(Point p1, Point p2) {
        return Math.abs(p1.r - p2.r) + Math.abs(p1.c - p2.c);
    }
}

class Point {
    int r;
    int c;

    Point (int x, int y) {
        this.r=x;
        this.c=y;
    }

    public String toString() {
        return "(" + r + "," + c + ")";
    }
}
