package aa.collection.sun.collection;

public class A implements Comparable<A> {

	private int x;
	
	public A() {
		
	}
	
	public A(int x){
		this.x =x;
	}
	
	public String toString() {
		return " "+x;
	}

	@Override
	public int compareTo(A o) {
		return 0;
	}

}
