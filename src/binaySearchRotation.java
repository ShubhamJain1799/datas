public class binaySearchRotation {
    public static void main(String[] args) {
        int[] search = {15,20,62,92,1,4,6,8,10};
        int find = 20;
        System.out.println(searchB(search,find));
}
    public static int searchB(int[] arry,int target)
    {
        int start = 0;
        int end = arry.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arry[mid] == target)
            {
                return mid;
            }
             if(arry[mid]<arry[end]) {
                 if (target >= arry[mid] && target <= arry[end]) {
                    start = mid + 1;
                }
                 else{
                     end = mid -1;
                 }
            }
        }
        return -1;
    }

}

