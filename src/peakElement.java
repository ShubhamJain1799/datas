public class peakElement {
    public static void main(String[] args) {
        int[] search = {1,1,1,3,5,6,4,8,10,2};
        int s= 0;
        int e= search.length-1;
        System.out.println(peakFind(search,s,e));
}
    public static int peakFind(int[] arry,int s,int e)
    {
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arry[mid-1]< arry[mid] && arry[mid+1]<arry[mid])
            {
                return mid;
            }
            else if (arry[mid]<arry[mid-1])
            {
            e= mid-1;
            return peakFind(arry,s,e);
            }
            else
            {
                s= mid+1;
                return peakFind(arry,s,e);
            }

        }
        return 0;
    }

}


