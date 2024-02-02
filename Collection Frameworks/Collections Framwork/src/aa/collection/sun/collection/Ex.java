package aa.collection.sun.collection;

public class Ex {

	private int x ;
	private int y ;
	
	Ex(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void sety(int y) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public int gety() {
		return y;
	}
	
	public String toString() {
		return " " + x +","+ y ;
	}
}
