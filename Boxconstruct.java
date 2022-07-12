class Boxcons{
   double width;
   double height;
  double depth;

  Boxcons()
  {
   width=10;
   height=15;
   depth=20;
   }
  double volume(){
   return width*height*depth;
  }
}
class Boxconstruct{
   public static  void main(String arg[])
  {
   Boxcons mybox1=new Boxcons();
   Boxcons mybox2=new Boxcons();
     
   System.out.println("volume is " +mybox1.volume());
   
   System.out.println("volume is " +mybox1.volume());
  }
}
