/*
--------------- Link for the challenge: https://codeforces.com/contest/1779/problem/B --------------

MKnez wants to construct an array s1,s2,…,sn satisfying the following conditions:

Each element is an integer number different from 0;
For each pair of adjacent elements their sum is equal to the sum of the whole array.
More formally, si≠0 must hold for each 1≤i≤n. Moreover, it must hold that s1+s2+⋯+sn=si+si+1 for each 1≤i<n.

Help MKnez to construct an array with these properties or determine that it does not exist.

Input
Each test contains multiple test cases. The first line contains the number of test cases t (1 ≤ t ≤ 100).
The description of the test cases follows.

The only line of each test case contains a single integer n (2 ≤ n ≤ 1000) — the length of the array.

Output
For each test case, print "YES" if an array of length n satisfying the conditions exists.
Otherwise, print "NO". If the answer is "YES", on the next line print a sequence s1,s2,…,sn satisfying the conditions.
Each element should be a non-zero integer in the range [−5000,5000], i. e. −5000 ≤ s(i) ≤ 5000 and s(i)≠0 should hold for each 1 ≤ i ≤ n.

It can be proved that if a solution exists then there also exists one which satisfies the additional constraints on the range.

If there are several correct answers, print any of them.

Input:
2
2
3

Output:
YES
9 5
NO

*/
import java.util.Scanner;

public class Forces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int num = input.nextInt();
            if(num % 2 == 0)
            {
                int temp = num / 2;
                System.out.println("YES");
                String st = temp + " " +  -temp + " ";
                String stRepeated = st.repeat(temp);
                System.out.println(stRepeated);
            }
            else if(num % 2 == 1 && num >= 5)
            {
                int minuses = (num - 1) / 2;
                int plus = minuses - 1;
                String str = plus + " " + -minuses + " ";
                String strRepeated = str.repeat(minuses);
                strRepeated += " " + plus;
                System.out.println("YES");
                System.out.println(strRepeated);
            }
            else
                System.out.println("NO");
        }
        input.close();
    }
}
