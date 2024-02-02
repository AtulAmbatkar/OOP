class Collage {

     Persone getPersone() {
       return new Persone();
    }
}

 class Exam extends Persone {
 
    Student getPersone() {
      return new Student();         // overridding method return type must be only sub-class of overridden methode rt not mens eithe superclas ,sibling.
    }
}

  class Test_WithCR {
 
    public static void main(String [ ] args) {

     Exam e = new Exam();

     Student s = e.getPersone();
     System.out.println(s.name);
     System.out.println(s.baranch);
   }
}

     