public class ArrayIndexException {
    public static void main(String arg[])
    {
        int a =10;
        try
        {
            int c = a/arg.length;
            System.out.println("c = " + c);
        }catch(ArithmeticException e) {
            System.out.println("cannot divide by zero");
        }
        }
    }

