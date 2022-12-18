/*
* ------------- 1774 A ----------------------
* Link for the challenge: https://codeforces.com/problemset/problem/1774/A

AquaMoon has a string a consisting of only 0 and 1. She wants to add + and − between all pairs of
consecutive positions to make the absolute value of the resulting expression as small as possible. Can you help her?

Input
The first line contains a single integer t (1 ≤ t ≤ 2000)  – the number of test cases. The description of test cases follows.

The first line of each test case contains a single integer n (2 ≤ n ≤ 100) — the length of a.

The second line of each test case contains a string a of length n, consisting of only 0 and 1.

Output
For each test case, output a string of length n−1 consisting of − and + on a separate line.
If there is more than one assignment of signs that produces the smallest possible absolute value, any of them is accepted.
*/

import java.util.Scanner;

public class Sign
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int len = input.nextInt();
            String str = input.next();
            char[] arr = str.toCharArray();
            String answer = "";
            int current = Character.getNumericValue(arr[0]);
            for (int i = 1; i < len; i++) {
                int temp = Character.getNumericValue(arr[i]);
                if(current > 0)
                {
                    current = current - temp;
                    answer += "-";
                }
                else
                {
                    current = current + temp;
                    answer += "+";
                }
            }
            System.out.println(answer);
        }
        input.close();
    }
}