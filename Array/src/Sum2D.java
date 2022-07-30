public class Sum2D {
    int i ,j;
    int sum = 0;
   // int arr[][] ={{20,30} ,{40,50}};
    void row_sum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0 ;j< arr.length;j++){
                sum = sum+arr[i][j];
            }
        }
        System.out.println("The sum of row is :" +sum);
    }
    public static void main(String arg[])
    {
        int array[][] ={{20,30} ,{40,50}};
        Sum2D obj = new Sum2D();
        obj.row_sum(array);
    }
}
