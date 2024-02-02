public class Bike_Gear {

    private int gear ;
 
    public void setGear ( int gear) {

        if (gear<0 || gear >5) {

                System.out.println("Invalid gear it's value must be in beetwin(0,5)");
            }
            
                this.gear = gear;  
    }

    public int getGear() {
 
        if (gear == 0) {
              System.out.println("Gear is nutral:" + gear);
        } else {
             System.out.println("Running gear is : " + gear );
       }
 
              return gear;        
    }

  }

      