public class TwoDimension {

    int[][] display() {
        int age[][] = {{100, 200}, {300, 400}};
        return age;
    }

    public static void main(String args[]) {
        // int age[][] = { {100,200}, {300, 400} };
        TwoDimension obj = new TwoDimension();
        int arr[][]= obj.display();
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.println(arr[row][col]);
                System.out.println(" ");
            }
           // System.out.println( );
        }
    }
}



