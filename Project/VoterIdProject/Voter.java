public class Voter {

   private int age;
   private String name;

   public void setAge ( int age) {

       if (age<18 || age>120) {
              System.out.println(" Issue : Voter id is applicable in only beetwin (18,120)");
           }
       this.age = age;
   }

  public int getAge() {

            if(age < 18) {
                  System.out.println("Nabalik :"+ age);
             }else {
                   System.out.println("adult : " + age);
             }
         return age;
   }

   public void setName( String name) {

           this.name = name;
    }

   public String getName() {
       return name;
     }

}

       

  
                   