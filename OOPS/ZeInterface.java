interface ZeInterface{

   public void micTesting();
  
}

   class demo implements ZeInterface{
    
      public void micTesting(){
      System.out.println("mic testing 1 2");
      }
      
      public static void main(String[]args){
      ZeInterface obj = new demo();
      obj.micTesting();
      }
   }