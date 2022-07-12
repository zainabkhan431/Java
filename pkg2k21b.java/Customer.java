package pkg2k21b;
public class Customer
{
 private  String name;
 private double amount;
public Customer(String n, double m)
 {
   name = n;
   amount = m;
 }
public void setName(String n)
 {
   name = n;
  }
public void setAmount(double m)
{
  amount = m;
 }
 public String getName()
{
 return name;
 }
public double getAmount()
 {
   return amount;
 }
public void Show()
 {
  System.out.println("Name :" + "  " + "Amount :");
 }
}
 