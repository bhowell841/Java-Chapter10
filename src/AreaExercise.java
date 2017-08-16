import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * Project creates a Shape superclass, two subclasses 
 * Two-dimentional and Three-dimentional and four 
 * sub-subclasses circle, square, sphere and cube.
 * 
 */
public class AreaExercise {

	public static void main(String[] args) {
		
		
		// instance of scanner
		Scanner input = new Scanner(System.in);
		
		// get shape
		System.out.println("Which shape would you like to calculate the area "
				+ "for (circle, square, sphere, or cube): ");
		String answer = input.nextLine();
		
		// decision statements to get instance of object
		if (answer.equalsIgnoreCase("circle")){
		
		Circle c = new Circle();
		System.out.println("Enter the radius: ");
		double r = input.nextDouble();
		c.setCircleData(r);
		c.setTwoDimentionalShape("2");
		c.getArea();
		System.out.printf("For a " + c._twoDimensionalShape + " dimentional shape,"
				+ " the area of a circle with a radius of " + r + 
				" is %.2f units squared.", c.getArea());
		}
		
		if (answer.equalsIgnoreCase("square")){
			
		Square s = new Square();
		System.out.println("Enter the length: ");
		double l = input.nextDouble();
		s.setSquareData(l);
		s.setTwoDimentionalShape("2");
		s.getArea();
		System.out.printf("For a " + s._twoDimensionalShape + " dimentional shape,"
				+ " the area of a square with a length of " + l + 
				" is %.2f units squared.", s.getArea());
		}
		
		if (answer.equalsIgnoreCase("sphere")){
			
		Sphere sp = new Sphere();
		System.out.println("Enter the radius: ");
		double r2 = input.nextDouble();
		sp.setSphereData(r2);
		sp.setThreeDimentionalShape("3");
		sp.getArea();
		System.out.printf("For a " + sp._threeDimensionalShape + " dimentional shape,"
				+ " the area of a sphere with a radius of " + r2 + 
				" is %.2f units squared.", sp.getArea());
		}
		
		if (answer.equalsIgnoreCase("cube")){
			
		Cube cu = new Cube();
		System.out.println("Enter the length: ");
		double l2 = input.nextDouble();
		cu.setCubeData(l2);
		cu.setThreeDimentionalShape("3");
		cu.getArea();
		System.out.printf("For a " + cu._threeDimensionalShape + " dimentional shape,"
				+ " the area of a cube with a length of " + l2 + 
				"is %.2f units squared.", cu.getArea());
		}  // end decision statements.

	}  // end main

}  //  end class



class Shape{
}  // end superclass Shape



class TwoDimensionalShape extends Shape{
	String _twoDimensionalShape;
	
	public void setTwoDimentionalShape(String twoDimensionalShape){
		_twoDimensionalShape = twoDimensionalShape;
	}
	
}  // end subclass TwoDimensionalShape



class ThreeDimensionalShape extends Shape{
	String _threeDimensionalShape;
	
	public void setThreeDimentionalShape(String threeDimensionalShape){
		_threeDimensionalShape = threeDimensionalShape;
	}
	
}  // end subclass ThreeDimensionalShape



class Circle extends TwoDimensionalShape{
	// variables
	public double _radius;
	public double _pi = Math.PI;
	
	// set circle data
	public void setCircleData(double radius){
		_radius = radius;
	}  // end setCircleData
	
	public double getArea(){
		return  _pi * Math.pow(_radius, 2);
	}  // end getArea
}  // end sub-subclass Circle

	
	
class Square extends TwoDimensionalShape{
	public double _length;
	
	// set square data
	public void setSquareData(double length){
		_length = length;
	}  // end setSquareData
	
	public double getArea(){
		return Math.pow(_length, 2);
	}  // end getArea
}  //  end sub-subclass Square



class Sphere extends ThreeDimensionalShape{
	public double _radius;
	public double _pi = Math.PI;
	
	// set sphere data
	public void setSphereData(double radius){
		_radius = radius;
	}  // end setSphereData
	
	public double getArea(){
		return 4*_pi * Math.pow(_radius, 2);
	}  // end getArea
}  //  end sub-subclass Sphere



class Cube extends  ThreeDimensionalShape{
	public double _length;
	
	// set cube data 
	public void setCubeData(double length){
		_length = length;
	}  // end setCubeData
	
	public double getArea(){
		return Math.pow(_length, 3);
	}  // end getArea
}//  end sub-subclass Cube