class A
{
  int i,j;
  A(int x,int y)
{
   i=x;
   j=y;
}
  void show()
{
  System.out.println("i :"+i+ "j:"+j);
}
}
class B extends A{
    int k;
  B(int x,int y)
{
   super(x,y);
  k=300;
}
  void show()
  { super.show();
    System.out.println("k :"+k);
   }
}
class MainDemoConstructorSeq
{
  public static void main(String arg[])
   {
      B bb=new B(100,200);
      bb.show();
  }
}