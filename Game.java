import java.util.HashMap;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while(cases-- > 0)
        {
            int amount = input.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            String[][] words = new String[3][amount];
            String answer = "";
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < amount; i++) {
                    String k = input.next();
                    int amountTemp = map.getOrDefault(k, 0);
                    amountTemp++;
                    map.put(k, amountTemp);
                    words[j][i] = k;
                }
            }
            for (int i = 0; i < 3; i++) {
                int pointTemp = 0;
                for (int j = 0; j < amount; j++) {
                    String temp = words[i][j];
                    int repeated = map.get(temp);
                    if(repeated == 2)
                        pointTemp++;
                    else if(repeated == 1)
                        pointTemp += 3;
                }
                answer += pointTemp + " ";
            }
            System.out.println(answer);
        }
        input.close();
    }
}
