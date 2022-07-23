class MainExp
{
  public static void main(String arg[])
   {
     int a = 10;
    try
    {
     int c = a/arg.length;
     System.out.println("c=" +c);
     arg[5] = "Zainab" ;
    // System.out.println("c=" +c);
    } catch(ArithmeticException e){
     System.out.println("Cannot Divide by Zero");
      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println(" Invalid Index");
      }
     }
   }
  