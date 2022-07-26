class StrChar
{
   public static void main(String args[])
   {
      String str = "Anirudh";
      for(int i=0; i<str.length();i++){
        char ch = str.charAt(i);
        System.out.println("At "+i+" Location "+ch);
      } 
   }
}