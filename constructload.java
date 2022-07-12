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
Box(){
    width=-1;
   height=-1;
  depth=-1;
}
double volume(){
  return width*height*depth;
  }
}
 class constructload{
public static void main(String arg[])
  {
    Box mybox1=new Box(12,13,15);
     Box mybox2=new Box();
   // Box mybox3=new Box(7);
  System.out.println("volume of box1 :" +mybox1.volume());
  System.out.println("volume of box2 :" +mybox2.volume());
 // System.out.println("volume of box3 :" +mybox3.volume());
 }
}
    

  
   
   
    