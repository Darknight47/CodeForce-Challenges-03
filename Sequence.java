/*
* ............. Link for the challenge: https://codeforces.com/problemset/problem/1107/A .....................

You are given a sequence s consisting of n digits from 1 to 9.

You have to divide it into at least two segments (segment — is a consecutive sequence of elements)
(in other words, you have to place separators between some digits of the sequence) in such a way that each element belongs
to exactly one segment and if the resulting division will be represented as an integer numbers sequence then each next
element of this sequence will be strictly greater than the previous one.

More formally: if the resulting division of the sequence is t1,t2,…,tk, where k is the number of element in
a division, then for each i from 1 to k−1 the condition ti<ti+1 (using numerical comparing, it means that
the integer representations of strings are compared) should be satisfied.

For example, if s=654 then you can divide it into parts [6,54] and it will be suitable division.
But if you will divide it into parts [65,4] then it will be bad division because 65 > 4. If s=123 then you can divide
it into parts [1,23], [1,2,3] but not into parts [12,3].

Your task is to find any suitable division for each of the q independent queries.

Input
The first line of the input contains one integer q (1≤q≤300) — the number of queries.

The first line of the i-th query contains one integer number ni (2≤ni≤300) — the number of digits in the i-th query.

The second line of the i-th query contains one string si of length ni consisting only of digits from 1 to 9.

Output
If the sequence of digits in the i-th query cannot be divided into at least two parts in a way described in the
problem statement, print the single line "NO" for this query.

Otherwise in the first line of the answer to this query print "YES", on the second line print k(i) —
the number of parts in your division of the i-th query sequence and in the third line print k(i)
strings ti,1,ti,2,…,ti,ki — your division. Parts should be printed in order of the initial string digits.
It means that if you write the parts one after another without changing their order then you'll get the string s(i).

*/
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quries = input.nextInt();
        while(quries-- > 0)
        {
            int len = input.nextInt();
            String numStr = input.next();
            String first = numStr.substring(0, 1);
            String second = numStr.substring(1, len);
            int fnum = Integer.parseInt(first);
            int snum = Integer.parseInt(second);
            if(snum > fnum)
            {
                System.out.println("YES");
                System.out.println(2);
                System.out.println(fnum + " " + snum);
            }
            else
            {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
