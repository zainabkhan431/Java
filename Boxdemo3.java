class Box
{ 
 double width;
 double height;
 double depth;
    double volume(){
       double result;
       result= width*height*depth;
       return result;
            }
       }
class Boxdemo3{
    public static void main(String arg[])
     { 
       Box mybox1=new Box();
       Box mybox2=new Box();
     
     mybox1.width=10;
     mybox1.height=15;
     mybox1.depth=20;
   
     mybox2.width=3;
     mybox2.height=6;
     mybox2.depth=9;

     System.out.println("volume is" +mybox1.volume());
     System.out.println("volume is" +mybox2.volume());
      }
}
   



 