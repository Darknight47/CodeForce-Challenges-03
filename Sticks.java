/*
* Link for the challenge: https://codeforces.com/problemset/problem/1734/A

You are given n sticks with positive integral length a1,a2,…,an.

You can perform the following operation any number of times (possibly zero):

choose one stick, then either increase or decrease its length by 1. After each operation, all sticks should have positive lengths.
What is the minimum number of operations that you have to perform such that it is possible to select three of the n sticks and use them without breaking to form an equilateral triangle?

An equilateral triangle is a triangle where all of its three sides have the same length.

Input
The first line of the input contains a single integer t (1 ≤ t ≤ 100) — the number of test cases. The description of the test cases follows.

The first line of each test case contains a single integer n (3 ≤ n ≤ 300) — the number of sticks.

The second line of each test case contains n integers a1,a2,…,an (1 ≤ ai ≤ 10^9) — the lengths of the sticks.

It is guaranteed that the sum of n over all test cases does not exceed 300.

Output
For each test case, print one integer on a single line — the minimum number of operations to be made.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sticks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int len = input.nextInt();
            int[] arr = new int[len];
            boolean threeFounded = false;
            for (int i = 0; i < arr.length; i++) {
                int temp = input.nextInt();
                arr[i] = temp;
            }
            Arrays.sort(arr);
            ArrayList<Integer> answers = new ArrayList<>();
            for (int i = 2; i < arr.length; i++) {
                int t1 = arr[i - 2];
                int t2 = arr[i - 1];
                int t3 = arr[i];
                if(t1 == t2 && t1 == t3)
                {
                    threeFounded = true;
                    break;
                }
                int diff1 = t2 - t1;
                int diff2 = t3 - t2;
                int tempAns = diff1 + diff2;
                answers.add(tempAns);
            }
            if(threeFounded)
                System.out.println(0);
            else
            {
                Collections.sort(answers);
                System.out.println(answers.get(0));
            }
        }
        input.close();
    }
}
