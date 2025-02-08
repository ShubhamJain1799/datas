public class binarySearchDnQ {
    public static void main(String[] args) {
        int[] search = {1,4,6,8};
        int find = 8;
        System.out.println(searchB(search,find));
    }
    public static int searchB(int[] arry,int target)
    {
        int start = 0;
        int end = arry.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arry[mid]== target)
            {
                return mid;
            } else if(target > arry[mid])
            {
                start = mid +1;
            }
            else end = mid-1;
        }
        return -1;
    }

}
