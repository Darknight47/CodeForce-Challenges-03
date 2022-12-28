/*
* ---------------------- Link for the challenge: https://codeforces.com/problemset/problem/870/A -----------------

You are given two lists of non-zero digits.

Let's call an integer pretty if its (base 10) representation has at least one digit from the first list and
at least one digit from the second list. What is the smallest positive pretty integer?

Input
The first line contains two integers n and m (1 ≤ n, m ≤ 9) — the lengths of the first and the second lists, respectively.

The second line contains n distinct digits a1, a2, ..., an (1 ≤ ai ≤ 9) — the elements of the first list.

The third line contains m distinct digits b1, b2, ..., bm (1 ≤ bi ≤ 9) — the elements of the second list.

Output
Print the smallest pretty integer.

Input:
2 3
4 2
5 7 6
Output:
25
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Pretty
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<Integer> narr = new ArrayList<>();
        ArrayList<Integer> marr = new ArrayList<>();
        int nsmallest = 10;
        int msmallest = 10;
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            if(temp < nsmallest)
                nsmallest = temp;
            narr.add(temp);
        }
        for (int i = 0; i < m; i++) {
            int temp = input.nextInt();
            if(temp < msmallest)
                msmallest = temp;
            marr.add(temp);
        }

        if(nsmallest == msmallest)
            System.out.println(nsmallest);
        else
        {
            String answer = "";
            int tempNar = 0;
            int tempMar = 0;
            boolean oneDigit = false;
            for (int i = 0; i < n; i++) {
                int temp = narr.get(i);
                if(marr.contains(temp))
                {
                    tempNar = temp;
                    oneDigit = true;
                    break;
                }
            }
            for (int i = 0; i < m; i++) {
                int t = marr.get(i);
                if(narr.contains(t))
                {
                    tempMar = t;
                    oneDigit = true;
                    break;
                }
            }
            answer = "" + Math.min(tempNar, tempMar);

            if(!oneDigit)
            {
                if(nsmallest < msmallest)
                {
                    answer = nsmallest + "" + msmallest;
                }
                else
                {
                    answer = msmallest + "" + nsmallest;
                }
            }  
            System.out.println(answer);
        }

        input.close();
    }
}