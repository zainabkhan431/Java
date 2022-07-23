class MainLinearSearch
{
  public static void main(String arg[])
   {
     int m[] = new int[arg.length];
     int key=1;
     int index=-1;
   for(int i=0;i< m.length;i++)
   {
       if(m[i]==key)
     {
        index=i;
        System.out.println(m[index] +"is at index :" + index);
        break;
     }
  }

if(index==-1)
{
   System.out.println("search is not successful");
 }
}
}