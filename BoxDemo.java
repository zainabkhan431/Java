class Box
{
   double width;
   double height;
   double depth;
}
class BoxDemo
{
  public static void main(String arg[])
  {
    Box mybox1=new Box( );
    double vol;
    mybox1.width=10;
    mybox1.height=20;
    mybox1.depth=15;
 
    
    vol= mybox1.width*mybox1.height*mybox1.depth;
    System.out.println("volume is" + vol);

       }
}