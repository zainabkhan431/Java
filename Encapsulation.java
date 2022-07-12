import .pkg2k21b.*;
class Encapsulation
{
  public static void main(String arg[])
  {
    Customer obj = new Customer("Ali" , 5000);
    obj.Show();
    obj.setName("Asad");
    obj.setAmount(10000);
    System.out.println("Name :" + obj.getName());
    System.out.println("Amount :" + obj.getAmount());
  }
}