class Bsnl {
  
    void call() {
        System.out.println("best for the calling:");
    }
}
 
 class Airtel {

   void messge() {
        System.out.println("best for the message:");
   } 
}

 class Jio {
   
     void plan() {
      System.out.println("best for the plan:");
    }
}

  class VodaFone {

     void network() {
        System.out.println("best for the network:");
     }
}

 class Mobile {

  /*  void insertSim(Bsnl b) {
         System.out.println(b);
   }

   void insertSim(Airtel a) {
         System.out.println();
   }
 
   void insertSim(Jio j) {
        System.out.println(j);
   }  */

  void insertSim(Object obj) {
        System.out.println(obj);
       // obj.call();                           cannot find sysmbol
      //  Bsnl b = (Bsnl)obj;             // there is one problem CCE,bez we pass arg Airtel object then like below
      //   b.call();                                // we solution instanceof opertaor
       if(obj instanceof Bsnl) {
          Bsnl bs = (Bsnl)obj;
          bs.call();
       } else if (obj instanceof Airtel) {
          Airtel a = (Airtel)obj;
          a.messge(); 
       } else if(obj instanceof Jio) {
          Jio j = (Jio)obj;
          j.plan();
      }
  }
    
 public static void main(String [ ] args) {
 
    Mobile m = new Mobile();
  //  m.insertSim(new Airtel());,
  //  m.insertSim(new VodaFone());

      System.out.println("Above solution use cast:");
      m.insertSim(new Bsnl());
  //    m.insertSim(new Airtel());                          java.lang.ClassCastException: class Airtel cannot be cast to class Bsnl (Airtel and Bsnl are in  
 //                                                                              unnamed module of loader 'app') 
        m.insertSim(new Airtel());
   //      m.insertSim(new Vodafone());                cnnot find symbol
  }
}