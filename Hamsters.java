/*
------------------ Link for the challenge: https://codeforces.com/problemset/problem/421/A --------------

Pasha has two hamsters: Arthur and Alexander. Pasha put n apples in front of them.
Pasha knows which apples Arthur likes. Similarly, Pasha knows which apples Alexander likes.
Pasha doesn't want any conflict between the hamsters (as they may like the same apple), so he decided
to distribute the apples between the hamsters on his own. He is going to give some apples to Arthur and
some apples to Alexander. It doesn't matter how many apples each hamster gets but it is important that
each hamster gets only the apples he likes. It is possible that somebody doesn't get any apples.

Help Pasha distribute all the apples between the hamsters. Note that Pasha wants to distribute all the apples, not just some of them.

Input
The first line contains integers n, a, b (1 ≤ n ≤ 100; 1 ≤ a, b ≤ n) — the number of apples Pasha has, the number of apples Arthur likes and the number of apples Alexander likes, correspondingly.

The next line contains a distinct integers — the numbers of the apples Arthur likes. The next line contains b distinct integers — the numbers of the apples Alexander likes.

Assume that the apples are numbered from 1 to n. The input is such that the answer exists.

Output
Print n characters, each of them equals either 1 or 2. If the i-h character equals 1, then the i-th apple should be given to Arthur, otherwise it should be given to Alexander.
If there are multiple correct answers, you are allowed to print any of them.

Input:
4 2 3
1 2
2 3 4

Output:
1 1 2 2


*/
import java.util.ArrayList;
import java.util.Scanner;

public class Hamsters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int appels = input.nextInt();
        int art = input.nextInt();
        ArrayList<Integer> arthurs = new ArrayList<>();
        int alex = input.nextInt();
        ArrayList<Integer> alexanders = new ArrayList<>();
        for (int i = 0; i < art; i++) {
            arthurs.add(input.nextInt());
        }
        for (int i = 0; i < alex; i++) {
            int temp = input.nextInt();
            if(!arthurs.contains(temp))
                alexanders.add(temp);
        }
       String answer = "";
        for (int i = 1; i <= appels; i++) {
            if(arthurs.contains(i))
                answer += "1 ";
            else if(alexanders.contains(i))
                answer += "2 ";
        }
        System.out.println(answer);
        input.close();
    }
}
