class Box1
{ 
 double width;
 double height;
 double depth;
    void volume()
      System.out.println(width*height*depth);
}
class Boxdemo3{
    public static void main(String arg[])
     { 
       box1 mybox1=new Box1();
       box1 mybox2=new Box1();
     
     mybox1.width=10;
     mybox1.height=15;
     mybox1.depth=20;
   
     mybox2.width=10;
     mybox2.height=15;
     mybox2.depth=20;
     System.out.println("volume is" +mybox1.volume());
     System.out.println("volume is" +mybox2.volume());
      }
}
   



 