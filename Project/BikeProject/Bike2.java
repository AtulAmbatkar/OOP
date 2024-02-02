class Bike2 {

   private int gear;
 
   public void setGear(int gear) throws IllegalArgumentException {

    if(gear<0 || gear>5) 
        throw new IllegalArgumentException("Invalid gear.its value must be beetween(0,5)");

        this.gear = gear;
    }

   public int getGear() {
 
    return gear;
   }
   public void currentgear () {

     if(gear == 0) {
           System.out.println("Bike is Neutral: " + gear);
     } else {
           System.out.println("Bike Gear is currently: "+ gear);
    }
  }
}
 
 
    