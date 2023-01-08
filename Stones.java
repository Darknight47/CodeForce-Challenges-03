/*
----------------- Link for the challenge: https://codeforces.com/problemset/problem/1159/A --------------

Vasya has a pile, that consists of some number of stones. n times he either took one stone from the pile or added one stone to the pile.
The pile was non-empty before each operation of taking one stone from the pile.

You are given n operations which Vasya has made. Find the minimal possible number of stones that can be in the pile after making these operations.

Input
The first line contains one positive integer n — the number of operations, that have been made by Vasya (1 ≤ n ≤ 100).

The next line contains the string s, consisting of n symbols, equal to "-" (without quotes) or "+" (without quotes).
If Vasya took the stone on i-th operation, s(i) is equal to "-" (without quotes), if added, si is equal to "+" (without quotes).

Output
Print one integer — the minimal possible number of stones that can be in the pile after these n operations.
*/
import java.util.Scanner;

public class Stones
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        String str = input.next();
        int minuses = str.length() - str.replace("-", "").length();
        int pluses = str.length() - str.replace("+","").length();
        int answer = 0;
        if(minuses <= 0)
            answer = pluses;
        else if(pluses <= 0)
            answer = 0;
        else
        {
            char[] arr = str.toCharArray();
            for (int i = 0; i < len; i++) {
                char temp = arr[i];
                if(temp == '-')
                {
                    answer--;
                    if(answer < 0)
                        answer = 0;
                }
                else
                    answer++;
            }
        }
        System.out.println(answer);
        input.close();
    }
}