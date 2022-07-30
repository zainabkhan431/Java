class MainDemoExp
{
    public static void main(String arg[])
    {
        try{
            int a = 10;
            int c = a/arg.length;
            System.out.println("c=" +c);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}

