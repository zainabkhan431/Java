class Test{
   void meth(int i,int j)
    { 
      i  *=2;
      j  /=2;
    }
}
 class callbyvalue{
  public static void main(String arg[])
 {
   Test obj = new Test();
   int a =15 ;
   int b=20;
   System.out.println("a and b before call:" +a + " " +b);
    obj.meth(a,b);
   System.out.println("a and b after call:" +a + " " +b);
 }
}
   