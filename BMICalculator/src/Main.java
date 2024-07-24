import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("輸入你的身高（公分）：");
    float height = scanner.nextFloat();
    System.out.println("輸入你的體重（公斤）：");
    float weight = scanner.nextFloat();
    height /= 100;
    double bmi = weight / Math.pow(height, 2);
    bmi = Math.round(bmi * 100) / 100.0;
    System.out.println("你的 BMI 是：" + bmi);

    if (bmi < 18.5) {
        System.out.println("體重過輕");
    } else if (bmi < 24) {
        System.out.println("正常範圍");
    } else if (bmi < 27) {
        System.out.println("過重");
    } else if (bmi < 30) {
        System.out.println("輕度肥胖");
    } else if (bmi < 35) {
        System.out.println("中度肥胖");
    } else {
        System.out.println("重度肥胖");
    }
}