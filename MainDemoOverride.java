class Figure{
  double dim1;
  double dim2;
  double area()
{
   System.out.println("the area of figure");
   return 0;
}
}
class Triangle extends Figure
{
  double area()
{
  return 1.0/2.0*dim1*dim2;
}
}
class MainDemoOverride
{
  public static void main (String arg[])
 {
   Figure f = new Figure();
   Triangle t= new Triangle();
    t.dim1=2.3;
    t.dim2=4.5;
    f.dim1=3;
   f.dim2=5;
  System.out.println("Area of Triangle :"+ t.area());
  System.out.println( f.area());
}
}

