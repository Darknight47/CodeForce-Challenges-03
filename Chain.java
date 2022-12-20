/*
* ------------------- Link for the challenge: https://codeforces.com/problemset/problem/215/A

Vasya's bicycle chain drive consists of two parts: n stars are attached to the pedal axle,
m stars are attached to the rear wheel axle. The chain helps to rotate the rear wheel by
transmitting the pedal rotation.

We know that the i-th star on the pedal axle has ai (0 < a1 < a2 < ... < an) teeth, and the j-th
star on the rear wheel axle has bj (0 < b1 < b2 < ... < bm) teeth. Any pair (i, j) (1 ≤ i ≤ n; 1 ≤ j ≤ m)
is called a gear and sets the indexes of stars to which the chain is currently attached.
Gear (i, j) has a gear ratio, equal to the value .

Since Vasya likes integers, he wants to find such gears (i, j), that their ratios are integers.
On the other hand, Vasya likes fast driving, so among all "integer" gears (i, j) he wants to choose
a gear with the maximum ratio. Help him to find the number of such gears.

In the problem, fraction  denotes division in real numbers, that is, no rounding is performed.

Input
The first input line contains integer n (1 ≤ n ≤ 50) — the number of stars on the bicycle's pedal axle.
The second line contains n integers a1, a2, ..., an (1 ≤ a(i) ≤ 10^4) in the order of strict increasing.

The third input line contains integer m (1 ≤ m ≤ 50) — the number of stars on the rear wheel axle.
The fourth line contains m integers b1, b2, ..., bm (1 ≤ bi ≤ 10^4) in the order of strict increasing.

It is guaranteed that there exists at least one gear (i, j), that its gear ratio is an integer.
The numbers on the lines are separated by spaces.

Output
Print the number of "integer" gears with the maximum ratio among all "integer" gears. 

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chain
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int as = input.nextInt();
        int[] arr = new int[as];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int bs = input.nextInt();
        int[] brr= new int[bs];  
        for (int i = 0; i < brr.length; i++) {
            brr[i] = input.nextInt();
        }
        ArrayList<Integer> answers = new ArrayList<>();
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                double temp = (double) brr[i] / (double) arr[j];
                if(temp % 1 == 0)
                {
                    answers.add((int)temp);
                }
            }
        }
        Collections.sort(answers);
        int biggest = answers.get(answers.size() - 1);
        int answer = 1;
        for (int i = answers.size() - 2; i >= 0; i--) {
            int temp = answers.get(i);
            if(biggest == temp)
            {
                answer++;
            }
            else
                break;
        }
        System.out.println(answer);

        input.close();

    }
}