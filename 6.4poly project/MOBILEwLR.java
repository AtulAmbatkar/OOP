  class Sim {

    void networkPlan(){
       System.out.println("best for network and plan:");
    }
 }
   class Bsnl extends Sim {
  
    void networkPlan(){
        System.out.println("best for networkPlan with the calling:");
    }
}
 
  class Airtel extends Sim {
   
     void networkPlan() {
        System.out.println("best for networkPlan with messge:");
    }
}

 class Jio extends Sim {

    void networkPlan() {
        System.out.println("best for networkPlan with best plan:");
    }
}

 class Vodafone extends Sim {

     void networkPlan() {
        System.out.println("best for networkPlan with best network:");
     }
}

 class MOBILEwLR {
 
    void insertSim(Sim s) {
      s.networkPlan();
    }
  public static void main(String [ ] args){
   
      MOBILEwLR m = new MOBILEwLR();
      m.insertSim(new Airtel());
   }
}