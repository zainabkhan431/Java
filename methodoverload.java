class overload{
  void test(){
   System.out.println("no parameters");
   }
  void test( int a,int b){
   System.out.println("a and b is "  +a +" "+b);
  }
  void test(double a){
  System.out.println("inside test(double) a:" +a);
  }
}
class methodoverload{
  public static void main(String arg[])
{
  overload obj =new overload();
   obj.test();
   obj.test(15,20);
   obj.test(123.2);
   int i=45;
   obj.test(i);
  }
}