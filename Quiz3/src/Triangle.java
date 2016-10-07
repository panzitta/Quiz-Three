import quiz3Exceptions.SideException;

public class Triangle extends GeometricObject{
	
	double side1=1;
	double side2=1;
	double side3=1;
	
	//Default Triangle 
	public static void defaultTriangle(){
	}
	
	//Specified Triangle
	public Triangle(double side1, double side2, double side3){
	
		if ((side1+side2)>=side3 || Math.abs(side1-side2)<=side3 ||
			(side2+side3)>=side1|| Math.abs(side2-side3)<=side1 || (side1+side3)>=side2 || Math.abs(side1-side3)<=side2	){
			try{
				throw new SideException(side1,side2,side3,"Triangle Cannot be Made: Side Error");}
			catch(SideException e){
				e.printStackTrace();}
			}
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	//Access Methods for 3 sides
	public double accessSide1(){
		return side1;
	}
	public double accessSide2(){
		return side2;
	}
	public double accessSide3(){
		return side3;
	}
	
	//"Get" Methods
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	public double getArea(){
		//Area using Heron's Formula for the Area of a Triangle
		double s=getPerimeter()/2;
		double Area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return Area;
	}
	//String Description of Triangle
	public String toString(){
		return ("The first side length is" + side1 +". The second side length is"+side2+". The last side length is"+side3+"."
			+"The area is"+getArea()+"and the perimeter is"+getPerimeter()+".");
	}
}
	