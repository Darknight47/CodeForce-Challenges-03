/*
* ---------------- Link for the challenge: https://codeforces.com/problemset/problem/991/B ------------------

Translator's note: in Russia's most widespread grading system, there are four grades: 5, 4, 3, 2, the higher the better,
roughly corresponding to A, B, C and F respectively in American grading system.

The term is coming to an end and students start thinking about their grades. Today, a professor told his students
that the grades for his course would be given out automatically  — he would calculate the simple average (arithmetic mean)
of all grades given out for lab works this term and round to the nearest integer. The rounding would be done in favour
of the student — 4.5 would be rounded up to 5 (as in example 3), but 4.4 would be rounded down to 4.

This does not bode well for Vasya who didn't think those lab works would influence anything, so he may receive
a grade worse than 5 (maybe even the dreaded 2). However, the professor allowed him to redo some of his works of
Vasya's choosing to increase his average grade. Vasya wants to redo as as few lab works as possible in order to get 5
for the course. Of course, Vasya will get 5 for the lab works he chooses to redo.

Help Vasya — calculate the minimum amount of lab works Vasya has to redo.

Input
The first line contains a single integer n — the number of Vasya's grades (1≤n≤100).

The second line contains n integers from 2 to 5 — Vasya's grades for his lab works.

Output
Output a single integer — the minimum amount of lab works that Vasya has to redo.
It can be shown that Vasya can always redo enough lab works to get a 5.

Input:
3
4 4 4
Output:
2
*/

import java.util.Arrays;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = input.nextInt();
            sum += temp;
            arr[i] = temp;
        }
        double mean = Math.round((double)sum / n);
        if(mean >= 5.0)
        {
            System.out.println(0);
        }
        else
        {
            int ans = 0;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                sum -= temp;
                sum += 5;
                mean = Math.round((double)sum / n);
                ans++;
                if(mean >= 5.0)
                {
                    break;
                }
            }
            System.out.println(ans);
        }

        input.close();

    }
}
