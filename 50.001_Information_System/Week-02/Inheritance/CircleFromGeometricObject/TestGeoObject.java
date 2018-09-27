package edu.sutd.istd;

public class TestGeoObject {
	public static void main(String[] args) {
		GeometricObject myGeoObject = new GeometricObject();
		myGeoObject.setColor("black");
		myGeoObject.setFilled(true);
		System.out.println(myGeoObject);
		
		
		CircleFromGeometricObject myCir = new CircleFromGeometricObject(2.0);
		myCir.setFilled(true);
		myCir.printCircle();
		
		
	}

}
