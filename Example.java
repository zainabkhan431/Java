class Vehicle{
  Void run()
  {
    System.out.println("Vehicle is Running");
  }
}
class Bike extends Vehicle

  Void run()
  {
    System.out.println("Bike is Running");
   }
class Overriden
{
  public static void main(String arg[])
   {
     Bike obj=new Bike();
     obj.run();
    }
}