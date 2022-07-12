class Maindemo2Darray
{
   public static void main(String arg[])
    {
    int[][] m= new int[4][3];
   System.out.println("no.of Rows: " +m.length);
  System.out.println("no. of coloumn:" +m[0].length);
  int b=10;
  for(int i =0 ;i<m.length ;i++,b+=10 )
    {
      for( int j=0; j<m[i].length;j++)
       {
         m[i][j]=b;
        // b+=10;
        }
     }
  for(int i =0 ;i<m.length ;i++ )
    {
      for( int j=0; j<m[i].length;j++)
       {
         System.out.print(m[i][j] +"\t");
        }
         System.out.println("\n");
     }
   }
}