/*
-------------------- Link for the challenge: https://codeforces.com/problemset/problem/1043/A ------------

Awruk is taking part in elections in his school. It is the final round. He has only one opponent — Elodreip.
The are n students in the school. Each student has exactly k votes and is obligated to use all of them.
So Awruk knows that if a person gives ai votes for Elodreip, than he will get exactly k−a(i) votes from this person.
Of course 0 ≤ k−a(i) holds.

Awruk knows that if he loses his life is over. He has been speaking a lot with his friends and now he knows
a1,a2,…,an — how many votes for Elodreip each student wants to give. Now he wants to change the number k to
win the elections. Of course he knows that bigger k means bigger chance that somebody may notice that he has
changed something and then he will be disqualified.

So, Awruk knows a1,a2,…,an — how many votes each student will give to his opponent.
Help him select the smallest winning number k. In order to win, Awruk needs to get strictly more votes than Elodreip.

Input
The first line contains integer n (1 ≤ n ≤ 100) — the number of students in the school.

The second line contains n integers a1,a2,…,an (1 ≤ a(i) ≤ 100) — the number of votes each student gives to Elodreip.

Output
Output the smallest integer k (k ≥ max a(i)) which gives Awruk the victory. In order to win, Awruk needs to get strictly more votes than Elodreip.

Input:
5
1 1 1 5 1

Output:
5
*/
import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int biggest = 0;
        int eldorp = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = input.nextInt();
            if(temp > biggest)
                biggest = temp;
            arr[i] = temp;
            eldorp += temp;
        }
        boolean founded = false;
        while(!founded)
        {
            int tempAns = 0;
            for (int i = 0; i < arr.length; i++) {
                int tempNum = arr[i];
                int diff = biggest - tempNum;
                tempAns += diff;
            }
            if(tempAns > eldorp)
            {
                founded = true;
                break;
            }
            else
            {
                biggest++;
            }   
        }
        System.out.println(biggest);
        input.close();
    }
}
