package aa.collection.sun.collection;

import java.io.PrintStream;
import java.util.EnumSet;

enum FoodIteam{
	IDELY(40),DOSA(40),PURI(30),BONDA(50),PONGAL(30),UPMA(30);
	
	private  double price;
	
	private FoodIteam(double price) {
		this.price =price;
	}
	
	public double price() {
		return price;
	}
	
}
public class Test08_Set_EnumSet {

	public static void main(String[] args) {
		
		System.out.println(FoodIteam.IDELY);
		System.out.println(FoodIteam.DOSA);
		
		System.out.println("s.no\tname\tprice");
		System.out.println("=========================================");

		FoodIteam[] foodIteams = FoodIteam.values();
		for(int i=0; i<foodIteams.length; i++) {
			FoodIteam foodIteam = foodIteams[i];
			
			System.out.print(foodIteam.ordinal()+1+"\t");
			System.out.print(foodIteam.name()+"\t");
			System.out.println(foodIteam.price()+"\t");
			System.out.println();
		}
		
		EnumSet<FoodIteam> es1 =EnumSet.noneOf(FoodIteam.class);
		EnumSet<FoodIteam> es2 =EnumSet.allOf(FoodIteam.class);
		EnumSet<FoodIteam> es3 =EnumSet.of(FoodIteam.IDELY,FoodIteam.DOSA,FoodIteam.PURI);
		EnumSet<FoodIteam> es4 =EnumSet.copyOf(es3);
		EnumSet<FoodIteam> es5=EnumSet.complementOf(es3);
		EnumSet<FoodIteam> es6=EnumSet.range(FoodIteam.DOSA,FoodIteam.PONGAL);
		
		System.out.println(es1);
		System.out.println(es2);
		System.out.println(es3);
		System.out.println(es4);
		System.out.println(es5);
		System.out.println(es6);
		
		es1.add(FoodIteam.IDELY);
		es1.add(FoodIteam.IDELY);
		es1.add(FoodIteam.BONDA);
		es1.add(FoodIteam.UPMA);
		es1.add(FoodIteam.PURI);
//		es1.add(null);
//		es1.add("a");
//		es1.add(5);
		System.out.println(es1);
		System.out.println();
		
		es1.remove(FoodIteam.IDELY);
		System.out.println(es1);
	}
}
