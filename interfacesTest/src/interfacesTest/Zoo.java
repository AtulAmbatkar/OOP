package interfacesTest;

public class Zoo {
	
	 public void allow(LivingThings lt) {
		 lt.move();
	 }
	 
	public static void main(String[] args) {
		
		Zoo hkzoo = new Zoo();
		
		hkzoo.allow(new Animal());
		hkzoo.allow(new Birds());
		hkzoo.allow(new Fish());
		hkzoo.allow(new Persone());
		
   }
}
