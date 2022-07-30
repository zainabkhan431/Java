public class MaxNum {
    void display(int array[]){
        int i;
        //int array[];
        int max =array[0];
        for(i =0; i<array.length; i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        System.out.println("The greater number in loop is :" +max);
    }

    public static void main(String arg[]) {
        int arr[]={10,20,30,40,50};
        MaxNum obj = new MaxNum();
        obj.display(arr);
    }
}
