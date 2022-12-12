/*
Link for the challenge: https://codeforces.com/contest/1766/problem/A

Let's call a positive integer extremely round if it has only one non-zero digit. For example, 5000, 4, 1, 10, 200 are extremely round integers; 42, 13, 666, 77, 101 are not.

You are given an integer n. You have to calculate the number of extremely round integers x such that 1 ≤ x ≤ n.

Input
The first line contains one integer t (1 ≤ t≤ 10^4) — the number of test cases.

Then, t lines follow. The i-th of them contains one integer n (1 ≤ n ≤ 999999) — the description of the i-th test case.

Output
For each test case, print one integer — the number of extremely round integers x such that 1 ≤ x ≤ n.

Input:
5
9
42
13
100
111

Output:
9
13
10
19
19

*/
import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            long num = input.nextLong();
            long ans = 0;
            while (num>9) {
                ans +=9;
                num /=10;
            }
            ans+=num;
            System.out.println(ans);
        }
        input.close();
    }
}
