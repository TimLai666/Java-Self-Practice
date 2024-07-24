import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

//    字串
    String hello = "Hello World";
    System.out.println(hello);
//    字元
    char h = 'H';
    System.out.println(h);
//    整數
    int number = 123;
    System.out.println(number);
//    浮點數
    double pi = 3.14;
    System.out.println(pi);
//    布林值
    boolean isTrue = true;
    System.out.println(isTrue);

    System.out.println("輸入你的名字：");
    String name = scanner.nextLine();
    System.out.println("輸入年齡：");
    int age = scanner.nextInt();
    System.out.println("有個人叫" + name);
    System.out.println("他今年" + age + "歲");
}