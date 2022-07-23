public class MinimumValue {
    static void MinimumValue(int[] value)
    {
        int  min=value[0];
        int index=0;
         for(int i=0 ; i < value.length ;i++)
         {
              if(min > value[i])
              {
                   min=value[i];
                   index=i;
              }
         }
         System.out.println("minimum value is : " + min + "  at index :" + index);
    }
    public static void main(String arg[])
     {
          int[] arr= { 8,4,5,6,7};
          //int index=0;
          MinimumValue(arr );
         // min=arr[0];
         // for(int i=0 ; i < arr.length ;i++)
          //{
            //   if(min > arr[i])
              // {
                //    min=arr[i];
                  //  index=i;
              // }
          //}
         // System.out.println("minimum value is : " + min + "  at index :" + index);
     }
}
