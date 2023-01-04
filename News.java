/*
As it's the first of April, Heidi is suspecting that the news she reads today are fake, and she does not want
to look silly in front of all the contestants. She knows that a newspiece is fake if it contains heidi as a
subsequence. Help Heidi assess whether the given piece is true, but please be discreet about it...

Input
The first and only line of input contains a single nonempty string s of length at most 1000 composed of lowercase letters (a-z).

Output
Output YES if the string s contains heidi as a subsequence and NO otherwise.

Input:
abcheaibcdi
Output:
YES
*/
import java.util.Scanner;

public class News {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] arr = str.toCharArray();
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(answer.isBlank() && ch == 'h')
                answer += ch;
            else if(answer.contains("h") && ch == 'e' && !answer.contains("he"))
                answer += ch;
            else if(answer.contains("he") && ch == 'i' && !answer.contains("hei"))
                answer += ch;
            else if(answer.contains("hei") && ch == 'd' && !answer.contains("heid"))
                answer += ch;
            else if(answer.contains("heid") && ch == 'i' && !answer.contains("heidi"))
                answer += ch;
        }
        if(answer.equals("heidi"))
            System.out.println("YES");
        else
            System.out.println("NO");
        input.close();
    }
}
