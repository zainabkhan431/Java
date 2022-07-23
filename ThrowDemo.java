class ThrowDemo
{
   static void Demoproc()
{
 try{
     throw new NullPointerException("Demo");
    }catch(NullPointerException e){
     System.out.println("Caught Inside Demo");
     throw e;
     }
public static void main(String arg[])
   {
     try {
        Demoproc();
       }catch(NullPinterException e){
    System.out.println("Recaught :  " + e);
  }
}
 