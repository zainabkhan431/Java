public class Average {
    void display(int a[]){
        int sum=0;
        for(int i =0; i<a.length;i++){
             sum= sum+a[i];
        }
        int avg= sum/a.length;
        System.out.println("The sum of array is :" +sum);
        System.out.println("The average of array is :" +avg);
    }
    public static void main(String arg[])
{
    int array[]={10,20,30,40,50};
    Average avg= new Average();
    avg.display(array);
}
}
