import java.util.Arrays;

public class sortZeroOne {
    public static int[] twoSum1(int[] arry)
    {
        int start =0;
        int end = arry.length-1;
        int swap =0;
        while(start<end)
        {
          if(arry[start]==1 && arry[end]==0)
          {
              swap = arry[start];
              arry[start] = arry[end];
              arry[end] = swap;
          }
            if(arry[start]==1 && arry[end]==1)
            {
               end--;
            }
            if(arry[start]==0 && arry[end]==0)
            {
                start++;
            }
            if(arry[start]==0 && arry[end]==1)
            {
                start++;
                end--;
            }
        }
        return arry;
    }
    public static void main(String[] arg)
    {
        int[] arr = {0,1,0,0,0,1,1,1,0,0};

        System.out.println(Arrays.toString(twoSum1(arr)));
    }
}

