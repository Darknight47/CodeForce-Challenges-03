/*
* ---------------------- Link for the challenge: https://codeforces.com/problemset/problem/1747/B -----------

You are given an integer n.

Let's define s(n) as the string "BAN" concatenated n times. For example, s(1) = "BAN", s(3) = "BANBANBAN".
Note that the length of the string s(n) is equal to 3n.

Consider s(n). You can perform the following operation on s(n) any number of times (possibly zero):

Select any two distinct indices i and j (1 ≤ i , j ≤ 3n,i≠j).
Then, swap s(n)i and s(n)j.

You want the string "BAN" to not appear in s(n) as a subsequence. What's the smallest number of operations you have to do to achieve this? Also, find one such shortest sequence of operations.

A string a is a subsequence of a string b if a can be obtained from b by deletion of several (possibly, zero or all) characters.

Input
The input consists of multiple test cases. The first line contains a single integer t (1≤t≤100)  — the number of test cases. The description of the test cases follows.

The only line of each test case contains a single integer n (1≤n≤100).

Output
For each test case, in the first line output m (0 ≤ m ≤ 10^5) — the minimum number of operations required. It's guaranteed that the objective is always achievable in at most 105 operations under the constraints of the problem.

Then, output m lines. The k-th of these lines should contain two integers ik, jk (1 ≤ ik , jk ≤ 3n, ik≠jk) denoting that you want to swap characters at indices ik and jk at the k-th operation.

After all m operations, "BAN" must not appear in s(n) as a subsequence.

If there are multiple possible answers, output any. 
*/

import java.util.Scanner;

public class Ban {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int num = input.nextInt();
            if(num == 1)
            {
                System.out.println(1);
                System.out.println(1 + " " + 2);
            }
            else
            {
                int temp = num / 2;
                if(num % 2 == 0)
                {
                    System.out.println(temp);
                }
                else
                {
                    System.out.println(temp + 1);
                    System.out.println(((num * 3) - 2) + " " + ((num * 3) - 1));
                }
                int first = 2;
                int second = 6;
                for (int i = 0; i < temp; i++) {
                    System.out.println(first + " " + second);
                    first += 6;
                    second += 4;
                }
            }
        }
        input.close();
    }
}
