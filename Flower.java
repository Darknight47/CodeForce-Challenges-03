/*
------------ Link for the challenge: https://codeforces.com/problemset/problem/1585/A -----------

Petya has got an interesting flower. Petya is a busy person, so he sometimes forgets to water it. You are given n days from Petya's live and you have to determine what happened with his flower in the end.

The flower grows as follows:

If the flower isn't watered for two days in a row, it dies.
If the flower is watered in the i-th day, it grows by 1 centimeter.
If the flower is watered in the i-th and in the (i−1)-th day (i>1), then it grows by 5 centimeters instead of 1.
If the flower is not watered in the i-th day, it does not grow.
At the beginning of the 1-st day the flower is 1 centimeter tall. What is its height after n days?

Input
Each test contains multiple test cases. The first line contains the number of test cases t (1 ≤ t ≤ 100).
Description of the test cases follows.

The first line of each test case contains the only integer n (1 ≤ n ≤ 100).

The second line of each test case contains n integers a1,a2,…,an (ai=0 or ai=1). If a(i)=1, the flower is watered in the i-th day,
otherwise it is not watered.

Output
For each test case print a single integer k — the flower's height after n days, or −1, if the flower dies.
*/
import java.util.Scanner;

public class Flower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int sze = input.nextInt();
            int today = -1;
            int yesterday = -1;
            int height = 1;
            boolean ok = true;
            for (int i = 0; i < sze; i++) {
                today = input.nextInt();
                if(today == 1)
                {
                    if(yesterday == 1)
                        height += 5;
                    else
                        height++;
                }
                else if(today == 0 && yesterday == 0)
                {
                    ok = false;
                }
                yesterday = today;
            }
            System.out.println(ok ? height : -1);
        }
        input.close();
    }
}
