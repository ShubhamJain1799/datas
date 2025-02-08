import java.util.Arrays;

public class twoSum{
    public static int[] twoSum1(int[] arry, int t)
    {
        int start =0;
        int end = arry.length-1;
      //  int[] res = {};
        while(start<end)
        {
            int sum = arry[start]+arry[end];
            if(sum==t)
            {
               int res[] = {arry[start],arry[end]};

             //  res = res.append(res1);
            } else if (sum<t) {
                start++;
          }
            else {
                end--;
            }
        }
        int[] res ={-1,-1};
        return res;
    }
    public static void main(String[] arg)
    {
        int[] arr = {1,2,4,5,6};
        int target = 7;
        System.out.println(Arrays.toString(twoSum1(arr, target)));
    }
}
