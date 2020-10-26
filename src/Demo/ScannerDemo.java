package Demo;


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        if(i > 10) {
            System.out.println("你今年要赚大钱");
        } else {
            System.out.println("你今年悬了");
        }

    }
}
