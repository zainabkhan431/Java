class Light
{  public static void main(String arg[])
   {
      int lightspeed=18600;
      long days=100;
      long seconds;
      long distance;
       seconds=days*24*60*60;
       distance=lightspeed*seconds;
       System.out.print("In"+ days);
       System.out.print("days light will travel about");
       System.out.println(distance +"miles");
    }
}
