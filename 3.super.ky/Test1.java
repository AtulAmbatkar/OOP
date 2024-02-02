class Object {

 public String toString() {

     return "AFF" + this ;
   }
}

  class S {

      int x = 10;
 
     void m1(){
 
        System.out.println(this.x);
       // System.out.println(super.x);
     }
 }

   class T extends S {

     int y = 20;

     void m2() {

           System.out.println(this.x);
           System.out.println(super.x);
           System.out.println(this.y);
        //   System.out.println(super.y);
     }
 }

  class Test1 {
  
     public static void main(String [ ] args) {

       T t1 = new T();
       S s1 = t1;

       t1.toString();
       t1.m1();
       t1.m2();

       System.out.println(t1.x);
       System.out.println(t1.y);
       
       System.out.println(s1.x);
  //     System.out.println(s1.y);

     }
  }