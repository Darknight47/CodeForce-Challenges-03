/**
You are given a string A. Find a string B, where B is a palindrome and A is a subsequence of B.

A subsequence of a string is a string that can be derived from it by deleting some (not necessarily consecutive)
characters without changing the order of the remaining characters. For example, "cotst" is a subsequence of "contest".

A palindrome is a string that reads the same forward or backward.

The length of string B should be at most 10^4. It is guaranteed that there always exists such string.

You do not need to find the shortest answer, the only restriction is that the length of string B should not exceed 10^4.

Input
First line contains a string A (1 ≤ |A| ≤ 10^3) consisting of lowercase Latin letters, where |A| is a length of A.

Output
Output single line containing B consisting of only lowercase Latin letters.
You do not need to find the shortest answer, the only restriction is that the length of string B should not exceed 10^4.
If there are many possible B, print any of them.

Input:
ab
Output:
aabaa

*/
import java.util.Scanner;

public class Supersequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String temp = new StringBuilder(str).reverse().toString();
        String answer = str + temp;
        System.out.println(answer);
        input.close();
    }
}
