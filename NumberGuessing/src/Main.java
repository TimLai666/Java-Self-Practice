import java.util.Random;
import java.util.Scanner;

void main() {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int number = random.nextInt(100) + 1;
    int guess = 0;
    while (guess != number) {
        System.out.print("輸入 1~100 的數字：");
        guess = scanner.nextInt();
        if (guess == number) {
            System.out.println("猜對了！");
        } else {
            System.out.print("猜錯了！");
            if (guess > number) {
                System.out.println("數字太大");
            } else {
                System.out.println("數字太小");
            }
        }
    }
}