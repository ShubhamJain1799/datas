// Problem statement
//For a given integer array/list 'ARR' of size 'N' containing all distinct values, find the total number of 'Inversions' that may exist.
//
//An inversion is defined for a pair of integers in the array/list when the following two conditions are met.
//
//A pair ('ARR[i]', 'ARR[j]') is said to be an inversion when:
//
//1. 'ARR[i] > 'ARR[j]'
//2. 'i' < 'j'
//
//Where 'i' and 'j' denote the indices ranging from [0, 'N').
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= N <= 10^5
//1 <= ARR[i] <= 10^9
//
//Where 'ARR[i]' denotes the array element at 'ith' index.
//
//Time Limit: 1 sec
//Sample Input 1 :
//3
//3 2 1
//Sample Output 1 :
//3
//Explanation of Sample Output 1:
//We have a total of 3 pairs which satisfy the condition of inversion. (3, 2), (2, 1) and (3, 1).
//Sample Input 2 :
//5
//2 5 1 3 4
//Sample Output 2 :
//4
//Explanation of Sample Output 1:
//We have a total of 4 pairs which satisfy the condition of inversion. (2, 1), (5, 1), (5, 3) and (5, 4).
//

public class Inversion {

    public static int getInversions(int arr[], int n){
        int count =0;
         for(int i=0;i<arr.length-1;i++)
         {
             for(int j=i;j<arr.length-1;j++)
             {
                 count++;
             }
         }
         return count;
    }
    // Merges two subarrays of a[]
    void merge(int a[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts a[l..r] using
    // merge()
    void sort(int a[], int l, int r)
    {
        if (l < r) {

            int m = (l + r) / 2;

            // Sort first and second halves
            sort(a, l, m);
            sort(a, m + 1, r);

            // Merge the sorted halves
            merge(a, l, m, r);
        }
    }

    // Driver method
    public static void main(String args[])
    {
        int a[] = {3,2,1};

        // Calling of Merge Sort
        Inversion ob = new Inversion();
        ob.sort(a, 0, a.length - 1);


        int n = a.length;
        System.out.print(getInversions(a,n));
    }
}

