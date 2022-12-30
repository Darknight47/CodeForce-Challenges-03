/*
Joey is low on money. His friend Chandler wants to lend Joey some money, but can't give him directly, as Joey is too proud of himself to accept it. So, in order to trick him, Chandler asks Joey to play a game.

In this game, Chandler gives Joey an array a1,a2,…,an (n≥2) of positive integers (ai≥1).

Joey can perform the following operation on the array any number of times:

Take two indices i and j (1 ≤ i < j ≤ n).
Choose two integers x and y (x,y ≥ 1) such that x * y = a(i) * (a)j.
Replace a(i) by x and a(j) by y.
In the end, Joey will get the money equal to the sum of elements of the final array.

Find the maximum amount of money ans Joey can get but print 2022*ans. Why multiplied by 2022? Because we are never gonna see it again!

It is guaranteed that the product of all the elements of the array a doesn't exceed 1012.

Input
Each test contains multiple test cases. The first line contains the number of test cases t (1 ≤ t ≤ 4000). Description of the test cases follows.

The first line of each test case contains a single integer n (2 ≤ n ≤ 50) — the length of the array a.

The second line contains n integers a1,a2,…,an (1 ≤ a(i) ≤ 10^6) — the array itself.

It's guaranteed that the product of all ai doesn't exceed 1012 (i. e. a1⋅a2⋅…⋅an ≤ 10^12).

Output
For each test case, print the maximum money Joey can get multiplied by 2022.

Input:
3
3
2 3 2
2
1 3
3
1000000 1000000 1
Output:
28308
8088
2022000000004044

*/
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int n = input.nextInt();
            long[] arr = new long[n];
            long first = input.nextLong();
            long sum = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                long temp = input.nextLong();
                first *= temp;
            }
            sum = first + (n - 1);
            System.out.println(sum * 2022);
        }
        input.close();
    }
}
