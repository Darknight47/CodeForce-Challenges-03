/*
* ---------------- Link for the challenge: https://codeforces.com/contest/1772/problem/B

You have a matrix 2×2 filled with distinct integers. You want your matrix to become beautiful.
The matrix is beautiful if the following two conditions are satisfied:

in each row, the first element is smaller than the second element;
in each column, the first element is smaller than the second element.

You can perform the following operation on the matrix any number of times:
rotate it clockwise by 90 degrees, so the top left element shifts to the top right cell,
the top right element shifts to the bottom right cell, and so on:

Determine if it is possible to make the matrix beautiful by applying zero or more operations.

Input
The first line contains one integer t (1 ≤ t ≤ 1000) — the number of test cases.

Each test case consists of two lines. Each of those lines contains two integers — the elements of the corresponding row of the matrix.
In each matrix, all four elements are distinct integers from 1 to 100.

Output
For each test case, print YES if the matrix can become beautiful, or NO otherwise.
You may print each letter in any case (YES, yes, Yes will all be recognized as positive answer, NO, no and nO will all be recognized as negative answer).

Input:
6
1 3
5 7
8 10
3 4
8 10
4 3
6 1
9 2
7 5
4 2
1 2
4 3

Output:
YES
YES
NO
YES
YES
NO

*/

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            boolean possible = false;

            if((a < b && c < d) && (a < c && b < d)) //Row
            {
                possible = true;
            }

            else
            {
                for (int i = 0; i < 4; i++) {
                    int tempC = c;
                    int tempA = a;
                    int tempB = b;
                    int tempD = d;
                    a = tempC;
                    b = tempA;
                    d = tempB;
                    c = tempD;
    
                    if((a < b && c < d) && (a < c && b < d)) //Row
                    {
                        possible = true;
                        break;
                    }
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        input.close();
    }
}
