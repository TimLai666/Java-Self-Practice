import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputNums = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            inputNums.add(n);
        }
        sc.close();

        for(int num : inputNums) {
            int ans = 0;
            String result = "";
    
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    ans += i;
                }
            }

            if (ans == num) {
                result = "PERFECT";
            } else if (ans < num) {
                result = "DEFICIENT";
            } else {
                result = "ABUNDANT";
            }

            resultList.add(result);
        }

        System.out.println("PERFECTION OUTPUT");
        for (int i = 0; i< inputNums.size(); i++) {
            int num = inputNums.get(i);
            String result = resultList.get(i);
            System.out.printf("%5d  %s\n", num, result);
        }
        System.out.println("END OF OUTPUT");
    }
}