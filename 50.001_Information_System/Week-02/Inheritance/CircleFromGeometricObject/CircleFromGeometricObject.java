package edu.sutd.istd;

public class CircleFromGeometricObject extends GeometricObject {
	private double radius;
	
	public CircleFromGeometricObject(){
		
	}

	public CircleFromGeometricObject(double radius){
		this.radius= radius;
	}
	
	public CircleFromGeometricObject(double radius, boolean filled, String color) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
		
	}
	
	public double getPerimeter() {
		return 2.0 * Math.PI * radius;
	}
	
	public void printCircle() {
		System.out.println("circle with radius: " + radius + " perimeter: " + getPerimeter() 
				+ " filled: " + isFilled() + " color: " + getColor());		
	}
	
}
