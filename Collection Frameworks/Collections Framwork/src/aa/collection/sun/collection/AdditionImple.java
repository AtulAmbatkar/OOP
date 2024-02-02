package aa.collection.sun.collection;

//  @aproac1.outer class
public class AdditionImple implements Addition{

	@Override
	public void calculate(int a, int b) {
		System.out.println("int: " + (a+b));
	}
	
	@Override
	public void calculate(float a, float b) {
		System.out.println("float: " + (a+b));
	}
}
