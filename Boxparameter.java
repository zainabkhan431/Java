class Box{
  double width;
  double height;
  double depth;
  
Box(double w,double h,double d)
{
  width=w;
  height=h;
  depth=d;
}
 double volume()
  {
    return width*height*depth;
   }
}
class Boxparameter{
   public static void main(String arg[])
  {
    Box mybox1=new Box(25,12,14);
    Box mybox2=new Box(4,8,12);
    System.out.println("volume is " +mybox1.volume());
    System.out.println("volume is " +mybox2.volume());
   }
}
