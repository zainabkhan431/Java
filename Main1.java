public class Main1 {
   public void fullthrottle()
   {
    System.out.println("the car is going as fast as it can!");
   }
  public void speed(int maxspeed)
  {     
    System.out.println("max speed is"+maxspeed);
   }
}
class Car{
   public static void main(String args[])
  {
   Main1 mycar= new Main1();
   mycar.fullthrottle();
   mycar.speed(200);
   }
}