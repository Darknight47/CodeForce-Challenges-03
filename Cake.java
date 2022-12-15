/**
Door's family is going celebrate Famil Doors's birthday party. They love Famil Door so they are planning to make his birthday cake weird!

The cake is a n × n square consisting of equal squares with side length 1. Each square is either empty or consists of a single chocolate.
They bought the cake and randomly started to put the chocolates on the cake. The value of Famil Door's happiness will be equal to the number
of pairs of cells with chocolates that are in the same row or in the same column of the cake. Famil Doors's family is wondering what is the
amount of happiness of Famil going to be?

Please, note that any pair can be counted no more than once, as two different cells can't share both the same row and the same column.

Input
In the first line of the input, you are given a single integer n (1 ≤ n ≤ 100) — the length of the side of the cake.

Then follow n lines, each containing n characters. Empty cells are denoted with '.', while cells that contain chocolates are denoted by 'C'.

Output
Print the value of Famil Door's happiness, i.e. the number of pairs of chocolate pieces that share the same row or the same column.

Input:
3
.CC
C..
C.C

Output:
4
*/

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        String[] arr = new String[sze];
        int pairsInRows = 0;
        int pairsInColumns = 0;
        for (int i = 0; i < arr.length; i++) {
            String temp = input.next();
            String cpy = temp;
            int inOneRow = cpy.length() - cpy.replace("C", "").length();
            int pairsInOneRow = inOneRow * (inOneRow - 1) / 2;
            pairsInRows += pairsInOneRow;
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            int inOneColumn = 0;
            for (int j = 0; j < arr.length; j++) {
                char c = arr[j].charAt(i);
                if(c == 'C')
                    inOneColumn++;
            }
            pairsInColumns += inOneColumn * (inOneColumn - 1) / 2;
        }

        System.out.println(pairsInRows + pairsInColumns);

        input.close();
    }
}
