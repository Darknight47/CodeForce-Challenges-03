/*
* ---------------------- Link for the challenge: https://codeforces.com/problemset/problem/32/A ---------------

According to the regulations of Berland's army, a reconnaissance unit should consist of exactly two soldiers.
Since these two soldiers shouldn't differ much, their heights can differ by at most d centimeters.
Captain Bob has n soldiers in his detachment. Their heights are a1, a2, ..., an centimeters.
Some soldiers are of the same height. Bob wants to know, how many ways exist to form a reconnaissance unit
of two soldiers from his detachment.

Ways (1, 2) and (2, 1) should be regarded as different.

Input
The first line contains two integers n and d (1 ≤ n ≤ 1000, 1 ≤ d ≤ 109) — amount of soldiers in Bob's detachment
and the maximum allowed height difference respectively. The second line contains n space-separated integers — heights of all
the soldiers in Bob's detachment. These numbers don't exceed 109.

Output
Output one number — amount of ways to form a reconnaissance unit of two soldiers, whose height difference doesn't exceed d.

Input:
5 10
10 20 50 60 65

Output:
6
*/
import java.util.Arrays;
import java.util.Scanner;

public class Reconnaissance
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int lim = input.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int diff = arr[j] - temp;
                if(diff <= lim)
                    answer++;
                else
                    break;
            }
        }
        System.out.println(answer * 2);
        input.close();
    }
}