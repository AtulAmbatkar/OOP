package aa.abstraction.allfield;

public class ImplementedI1_i2 implements i1 ,i2 {

	public ImplementedI1_i2 () {
		super();
	}
	
	public void add() {
		System.out.println("10 +20");
	}

	public void subtract() {
		i2.super.subtract();
		i1.super.subtract();
		i1.addition();
	}
	
	
}
