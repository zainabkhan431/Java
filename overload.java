class Overloaddemo{
   void test(){
   System.out.println("method with no paramter");
    }
 void test(int a){
  System.out.println(" a :" +a);
  }
 void test(int a ,int b){
  System.out.println("a and b :" +a +" " +b);
   }
double test(double a){
   System.out.println(" double a :" +a );
   return a*a;
  }
}

class overload{
  public static void main(String arg[])
  {
     Overloaddemo ob = new Overloaddemo();
   ob.test();
   ob.test(12);
   ob.test(10,20);
  ob.test(123.25);
   double result= ob.test(123.20); 
  System.out.println("Result of ob.test(123.20) is " +result);
  }
}  