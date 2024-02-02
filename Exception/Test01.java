class Test01 {

/*  // # 7. illegal start of type .bcz class level try block is usless 
  try{
   }catch (Exception e){ }  */

public static void main(String [ ] args) {

  /* // #1.try without 'catch' , 'finally' , resources decleration
    try {} 

  // #2. catch eithout 'try'
     catch{}
  
 // #3. finally without 'try'
     finally{} 
 
   // 4.
    try {
    int a = 10;
    }catch(Exception e) {
    int b = 50;
    }finally{}  

    // 5.fter final is not possible 'catch' without try 
       try{}
       finally{}
    //   catch(Exception e) {}
       try{ }
       catch (Exception e) {}
        // 6.incompatible type string can not converted to string type 
        //  catch(String s) {}  */

          try { 
          } catch (Exception e) {
          } 
          //#9.ArraIndexOutOfBoundsException & NumberFormatException ia alreadty caught  bcz..parent-chaild reletion 
         catch(ArrayIndexOutOfBoundsException e){
          } catch(NumberFormatException e){}
  }
}