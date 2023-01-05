/*
 -------------- Link for the challenge: https://codeforces.com/problemset/problem/440/A -----------
 
Polycarpus adores TV series. Right now he is ready to finish watching a season of a popular sitcom "Graph Theory". In total, the season has n episodes, numbered with integers from 1 to n.

Polycarpus watches episodes not one by one but in a random order. He has already watched all the episodes except for one. Which episode has Polycaprus forgotten to watch?

Input
The first line of the input contains integer n (2 ≤ n ≤ 100000) — the number of episodes in a season. Assume that the episodes are numbered by integers from 1 to n.

The second line contains n - 1 integer a1, a2, ..., an (1 ≤ ai ≤ n) — the numbers of episodes that Polycarpus has watched. All values of ai are distinct.

Output
Print the number of the episode that Polycarpus hasn't watched.

Input:
10
3 8 10 1 7 9 6 5 2

Output:
4
*/
import java.util.Scanner;

public class Episode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long total = (num * (num + 1)) / 2;
        long temp = 0;
        for (int i = 0; i < num - 1; i++) {
            temp += input.nextLong();
        }
        long answer = total - temp;
        System.out.println(answer);
        input.close();
    }
}
