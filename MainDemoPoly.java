class A
{
  void show()
   {
     System.out.println("As show");
   }
}
class B extends A
{
  void show()
   {
     System.out.println("Bs show");
   }
}
class C extends A
{
  void show()
   {
     System.out.println("Cs show");
   }
}
class MainDemoPoly
 {
    public static void main(String arg[])
     {
        A aa= new A();
        B bb=new B();
        C cc =new C();
      aa.show();
      bb.show();
      cc.show();
//  can also be called through this method.
     A ref;
    ref= new A();
    ref.show();
    ref=bb;
   bb.show();
   ref=cc;
   cc.show();
    }
}