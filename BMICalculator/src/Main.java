import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("輸入你的身高（公分）：");
    float height = scanner.nextFloat();
    System.out.println("輸入你的體重（公斤）：");
    float weight = scanner.nextFloat();
    height /= 100;
    float bmi = weight / (height * height);
    System.out.println("你的 BMI 是：" + bmi);
}