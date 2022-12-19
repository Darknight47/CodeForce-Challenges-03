/**
You are given an expression of the form a+b, where a and b are integers from 0 to 9. You have to evaluate it and print the result.

Input
The first line contains one integer t (1≤t≤100) — the number of test cases.

Each test case consists of one line containing an expression of the form a+b (0≤a,b≤9, both a and b are integers). The integers are not separated from the + sign.

Output
For each test case, print one integer — the result of the expression.

Input:
1+1
Output:
2

*/

import java.util.Scanner;

public class ApB{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            String str = input.next();
            char[] arr = str.toCharArray();
            int first = Character.getNumericValue(arr[0]);
            int second = Character.getNumericValue(arr[2]);
            System.out.println(first + second);
        }
        input.close();
    }
}