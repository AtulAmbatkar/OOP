public class Voter1 {

   private int age;
   private String name;

          public void setAge(int age) throws IllegalArgumentException {

                  if (age <18 || age >120) 
                         throw new IllegalArgumentException("Invalid for voter id");
    
                  this.age = age ;
         }
 
        public int getAge () {
            return age ;
        }

         public void setName(String name) {
              this.name = name;
         }

         public String getName() {
             return name;
         }
  }

  