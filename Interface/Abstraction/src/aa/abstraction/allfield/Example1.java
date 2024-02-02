package aa.abstraction.allfield;

public abstract class Example1 {

	   static int a = 10;
       int x ;

   static  {
          System.out.println("static block");
  }

  {
       System.out.println("Ntstic block executed");
       
  }

abstract void m1();  

 Example1(int x){
	    
	       this.x = x;
          System.out.println("Example constructor is executed");
}

static void m2(){
       System.out.println("static method is executed");
}

void m3() {
     System.out.println("NSm methos executed");
 }
  
}
