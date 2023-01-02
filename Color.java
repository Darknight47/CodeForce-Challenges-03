/*
Vasya has a grid with 2 rows and n columns. He colours each cell red, green, or blue.

Vasya is colourblind and can't distinguish green from blue. Determine if Vasya will consider the two rows of the grid to be coloured the same.

Input
The input consists of multiple test cases. The first line contains an integer t (1≤t≤100) — the number of test cases. The description of the test cases follows.

The first line of each test case contains an integer n (1≤n≤100) — the number of columns of the grid.

The following two lines each contain a string consisting of n characters, each of which is either R, G, or B, representing a red, green, or blue cell, respectively — the description of the grid.

Output
For each test case, output "YES" if Vasya considers the grid's two rows to be identical, and "NO" otherwise.

You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).

Input:
6
2
RG
RB
4
GRBG
GBGB
5
GGGGG
BBBBB
7
BBBBBBB
RRRRRRR
8
RGBRRGBR
RGGRRBGR
1
G
G

Output:
YES
NO
YES
NO
YES
YES

*/
import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int sze = input.nextInt();
            String str1 = input.next();
            String str2 = input.next();
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            boolean same = true;
            for (int i = 0; i < sze; i++) {
                char c1 = arr1[i];
                char c2 = arr2[i];
                if(c1 != c2)
                {
                    if((c1 == 'R' && c2 == 'B')
                       || c1 == 'B' && c2 == 'R'
                       || c1 == 'R' && c2 == 'G'
                       || c1 == 'G' && c2 == 'R')
                    {
                        same = false;
                        break;
                    }
                }
            }
            System.out.println(same ? "YES" : "NO");
        }
        input.close();
    }
}
