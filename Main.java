import java.util.Scanner;
public class Main
{
  public static void main(String arg[])
   { 
     Scanner S=new Scanner(System.in);
     System.out.print("Enter First Number-");
     int a=S.nextInt();
     System.out.print("Enter Second Number-");
     int b=S.nextInt();
     System.out.print("Enter third Number-");
     int c=S.nextInt();
     System.out.print("Enter fourth Number-");
     int d=S.nextInt();
     System.out.print("Enter Fifth Number-");
     int e=S.nextInt();
     int f=a+b+c+d+e;
     System.out.println("sum="+f);
     int per=(f*100)/500;
    System.out.println("percentage="+per);
    if(per>=80)
    System.out.println("Exceptional");
      if(per>=70&&per<80)
    System.out.println("Very Good");
     if(per>=60&&per<70)
    System.out.println("Good");
    if(per>=50&&per<60)
    System.out.println("pass");
    if(per<50)
    System.out.println("Fail");
     }
}