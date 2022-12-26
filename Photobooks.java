/*
* --------------- Link for the challenge: https://codeforces.com/problemset/problem/554/A -------------

Kyoya Ootori is selling photobooks of the Ouran High School Host Club.
He has 26 photos, labeled "a" to "z", and he has compiled them into a photo booklet
with some photos in some order (possibly with some photos being duplicated).
A photo booklet can be described as a string of lowercase letters, consisting of the photos
in the booklet in order. He now wants to sell some "special edition" photobooks, each with one extra
photo inserted anywhere in the book. He wants to make as many distinct photobooks as possible,
so he can make more money. He asks Haruhi, how many distinct photobooks can he make by inserting
one extra photo into the photobook he already has?

Please help Haruhi solve this problem.

Input
The first line of input will be a single string s (1 ≤ |s| ≤ 20).
String s consists only of lowercase English letters.

Output
Output a single integer equal to the number of distinct photobooks Kyoya Ootori can make. 

Input:
a

Ouput:
51

*/

import java.util.Scanner;

public class Photobooks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int sze = str.length();
        int answer = ((sze + 1) * 26) - sze;
        System.out.println(answer);
        input.close();
    }
}
