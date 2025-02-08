public class staircase {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(shubham(n));
    }

    public static int shubham(int m) {
        if (m == 1) {
            return 1;
        } else if (m==2) {
            return 2;

        } else {
            return shubham(m - 1)+shubham(m-2);
        }

    }
}


