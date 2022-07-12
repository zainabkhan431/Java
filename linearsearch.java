public class linearsearch {
    public static void main(String arg[])
    {
        int[] m = new int[arg.length];
        int key= 4;
        int index=-1;
        for(int i=0;i < m.length ;i++)
        {
            if(m[i]==key)
            {
                index = i;
                break;
            }
        }
        if(index>=0)
        {
            System.out.println("Search is succesful");
            System.out.println(m[index] + "is at" + index);
        }
    }
}