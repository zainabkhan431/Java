public class MaximumValue {
    static void MaxValue(int[] value)
    {
        int  max=value[0];
        int index=0;
        for(int i=0 ; i < value.length ;i++)
        {
            if(max < value[i])
            {
                max=value[i];
                index=i;
            }
        }
        System.out.println("minimum value is : " + max + "  at index :" + index);
    }
    public static void main(String arg[])
    {
        int[] arr= { 0,4,5,9,7};
        MaxValue(arr);
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
