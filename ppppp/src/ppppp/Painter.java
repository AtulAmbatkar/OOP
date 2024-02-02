package ppppp;

class Shape {
	void findArea() {
		System.out.print("Shape area: ");
	}
}

class Reactangle extends Shape {
	private double l;
	private double h;
	
	public Reactangle(double l , double h) {
		this.l = l;
		this.h = h;
	}
	@Override
	void findArea() {
		System.out.println("Reactangle area: "+(l*h));
	}
}

class Circle extends Shape {
	private static final double pi = 3.14;
	private double redious;
	
	public Circle(double redious) {
		this.redious = redious;
		
	}
	@Override
	void findArea() {
		System.out.println("Circle area: "+(pi*redious*redious));
			
		}
	}
public class Painter {
	
	void draw(Shape s) {
		s.findArea();
	}
    public static void main(String [ ] ares) {
    	Painter pa = new Painter();
    	pa.draw(new Circle(10));
    	 pa.draw(new Reactangle(10,5));
    }
}
