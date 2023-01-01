/*
---------- Link for the challenge: https://codeforces.com/problemset/problem/1675/A ------------

In the pet store on sale there are:

a packs of dog food;
b packs of cat food;
c packs of universal food (such food is suitable for both dogs and cats).
Polycarp has x dogs and y cats. Is it possible that he will be able to buy food for all his animals in the store?
Each of his dogs and each of his cats should receive one pack of suitable food for it.

Input
The first line of input contains an integer t (1≤t≤104) — the number of test cases in the input.

Then t lines are given, each containing a description of one test case. Each description consists of five integers
a,b,c,x and y (0 ≤ a,b,c,x,y ≤ 10^8).

Output
For each test case in a separate line, output:

YES, if suitable food can be bought for each of x dogs and for each of y cats;
NO else.
You can output YES and NO in any case (for example, strings yEs, yes, Yes and YES will be recognized as a positive response).

Input:
7
1 1 4 2 3
0 0 0 0 0
5 5 0 4 6
1 1 1 1 1
50000000 50000000 100000000 100000000 100000000
0 0 0 100000000 100000000
1 3 2 2 5

Output:
YES
YES
NO
YES
YES
NO
NO

*/

import java.util.Scanner;

public class Animals
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            long dogFood = input.nextLong();
            long catFood = input.nextLong();
            long uniFood = input.nextLong();
            long dogs = input.nextLong();
            long cats = input.nextLong();

            long totalFood = dogFood + catFood + uniFood;
            long totalAnim = dogs + cats;
            boolean dogOk = false;
            boolean catOk = false;
            if(totalFood >= totalAnim)
            {
                if(dogFood >= 0 && dogs >= 0)
                {
                    if(dogFood >= dogs)
                    {
                        dogOk = true;
                    }
                    else
                    {
                        long diffDogFood = dogs - dogFood;
                        dogs -= dogFood;
                        dogFood -= diffDogFood;
                    }
                }
                if(dogs >= 0 && uniFood >= 0 && !dogOk)
                {
                    long temp = uniFood;
                    if(uniFood >= dogs)
                    {
                        dogOk = true;
                    }
                    uniFood -= dogs;
                    long diffNewUniFood = temp - uniFood;
                    dogs -= diffNewUniFood;
                }

                if(catFood >= 0 && cats >= 0)
                {
                    if(catFood >= cats)
                    {
                        catOk = true;
                    }
                    else
                    {
                        long diffCatFood = cats - catFood;
                        long tmp = cats - diffCatFood;
                        cats -= catFood;
                        catFood -= tmp;
                    }
                }
                if(cats >= 0 && uniFood >= 0 && !catOk)
                {
                    if(uniFood >= cats)
                    {
                        catOk = true;
                    }
                    long diff = Math.abs(cats - uniFood);
                    uniFood -= diff;
                    cats -= uniFood;
                }
            }
            if(catOk && dogOk)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        input.close();
    }
}