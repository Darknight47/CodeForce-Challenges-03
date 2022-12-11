/*
Winnie-the-Pooh likes honey very much! That is why he decided to visit his friends.
Winnie has got three best friends: Rabbit, Owl and Eeyore, each of them lives in his own house.
There are winding paths between each pair of houses. The length of a path between Rabbit's and Owl's houses is a meters,
between Rabbit's and Eeyore's house is b meters, between Owl's and Eeyore's house is c meters.

For enjoying his life and singing merry songs Winnie-the-Pooh should have a meal n times a day.
Now he is in the Rabbit's house and has a meal for the first time. Each time when in the friend's house where
Winnie is now the supply of honey is about to end, Winnie leaves that house. If Winnie has not had a meal the
required amount of times, he comes out from the house and goes to someone else of his two friends. For this he
chooses one of two adjacent paths, arrives to the house on the other end and visits his friend. You may assume
that when Winnie is eating in one of his friend's house, the supply of honey in other friend's houses recover
(most probably, they go to the supply store).

Winnie-the-Pooh does not like physical activity. He wants to have a meal n times, traveling minimum possible distance. Help him to find this distance.

Input
First line contains an integer n (1 ≤ n ≤ 100) — number of visits.

Second line contains an integer a (1 ≤ a ≤ 100) — distance between Rabbit's and Owl's houses.

Third line contains an integer b (1 ≤ b ≤ 100) — distance between Rabbit's and Eeyore's houses.

Fourth line contains an integer c (1 ≤ c ≤ 100) — distance between Owl's and Eeyore's houses.

Output
Output one number — minimum distance in meters Winnie must go through to have a meal n times.

Input:
3
2
3
1

Output:
3

*/
import java.util.Scanner;

public class Meal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int meals = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int eats = 1;
        int distans = 0;
        boolean rabbitHouse = true, owelHouse = false, eyeHouse = false;
        while(eats < meals)
        {
            if(a <= b && rabbitHouse)
            {
                owelHouse = true;
                distans += a;
                rabbitHouse = false;
            }
            else if(a > b && rabbitHouse)
            {
                eyeHouse = true;
                distans += b;
                rabbitHouse = false;
            }
            else if(a <= c && owelHouse)
            {
                distans += a;
                owelHouse = false;
                rabbitHouse = true;
            }
            else if(a > c && owelHouse)
            {
                distans += c;
                owelHouse = false;
                eyeHouse = true;
            }
            else if(b <= c && eyeHouse)
            {
                distans += b;
                eyeHouse = false;
                rabbitHouse = true;
            }
            else if(b > c && eyeHouse)
            {
                distans += c;
                eyeHouse = false;
                owelHouse = true;
            }
            eats++;
        }
        System.out.println(distans);
        input.close();
    }
}
