public class IT26102561Lab2Q2{
	public static final double PI = 3.14159;
	public static void main (String [] args){
		double length,radius,circumference,perimeter;
		length = 10;
		perimeter = 4*length;
		circumference = perimeter;
		radius = circumference/(2*PI);
		
		System.out.println("The radius of the circle is:" + radius);
	}
}