public class oneton {
    public static void main(String[]args)
    {
        int n =5;
        shubham(n);
    }
    public static void shubham(int m)
    {
        if(m<=0) {
            return;
        }
        else
        {
            System.out.println(m);
            shubham(m-1);
        }

    }

}
