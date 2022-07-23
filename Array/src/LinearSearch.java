public class LinearSearch{
    static void linearSearch(int values[], int key){
        int index=-1;
        for(int i =0 ;i<values.length ; i++)
        {
            if(key==values[i])
            {
                index = i;
                System.out.println("Key is found at index with linear search:" +i);
                break;
            }
        }
        if(index== -1)
        {
            System.out.println("key value is not found");
        }
    }
    public static void main(String arg[])
    {
        int[] a ={10,20,30,40,50};
        int key=20;
        linearSearch(a, key);
//        int index=-1;
//        for(int i =0 ;i<a.length ; i++)
//        {
//            if(key==a[i])
//            {
//                index = i;
//                System.out.println("Key is found at index :" +i);
//                break;
//            }
//        }
//        if(index== -1)
//        {
//            System.out.println("key value is not found");
//        }
    }
}

