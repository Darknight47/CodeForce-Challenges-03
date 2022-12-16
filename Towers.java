/**
* There are n block towers, numbered from 1 to n. The i-th tower consists of ai blocks.

In one move, you can move one block from tower i to tower j, but only if a(i) > a(j).
That move increases aj by 1 and decreases ai by 1. You can perform as many moves as you would like (possibly, zero).

What's the largest amount of blocks you can have on the tower 1 after the moves?

Input
The first line contains a single integer t (1 ≤ t ≤ 10^4) — the number of testcases.

The first line of each testcase contains a single integer n (2 ≤ n ≤ 2⋅10^5) — the number of towers.

The second line contains n integers a1,a2,…,an (1 ≤ a(i) ≤ 10^9) — the number of blocks on each tower.

The sum of n over all testcases doesn't exceed 2⋅105.

Output
For each testcase, print the largest amount of blocks you can have on the tower 1 after you make any number of moves (possibly, zero).

Input:
4
3
1 2 3
3
1 2 2
2
1 1000000000
10
3 8 6 7 4 1 2 4 10 1

Output:
3
2
500000001
9

*/
import java.util.Scanner;

public class Towers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        Towers tower = new Towers();
        while(cases-- > 0)
        {
            int sze = input.nextInt();
            int[] tempArr = new int[sze];
            for (int i = 0; i < tempArr.length; i++) {
                tempArr[i] = input.nextInt();
            }
            int towerOne = tempArr[0];
            tower.sort(tempArr, 0, sze - 1);
            for (int i = 1; i < sze; i++) {
                int temp = tempArr[i];
                if(temp > towerOne)
				{
					int dif = temp - towerOne;
					if(dif % 2 == 0)
					{
						towerOne = towerOne + dif/2;
					}
					else
					{
						towerOne = towerOne + dif/2 + 1;
					}
						
				}
            }
            System.out.println(towerOne);
        }
        input.close();
    }

    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}