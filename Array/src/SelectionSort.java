public class SelectionSort {
    public static void main(String arg[]) {
        int arr[] = {64, 25, 12, 22, 11};
        int i, j, temp;
        for (i = 0; i < arg.length; i++) {
            for (j = i + 1; j < arg.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            for (i=0; i< arg.length; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
      //  for (i=0; i< arg.length; ++i)
        //    System.out.print(arr[i]+" ");
        //System.out.println();
            }
        }

