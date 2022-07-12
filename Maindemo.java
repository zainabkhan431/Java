class Refrence
{ 
 int x,y;
 void Change (Refrence p)
  {
    int temp;
   temp=p.x;
   p.x=p.y;
  p.y=temp;
 }
}
class Maindemo
{
 public static void main(String arg[])
  {
    Refrence obj=new Refrence();
    obj.x=1;
    obj.y=2;
  System.out.println("x=" +obj.x +"y=" +obj.y);
  obj.Change(obj);
  System.out.println("x=" +obj.x +"y=" +obj.y);
  }
}
  