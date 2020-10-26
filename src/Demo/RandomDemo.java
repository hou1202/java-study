package Demo;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] arge) {
        //Random基本使用
        /*
        Random ra = new Random();
        int num = ra.nextInt(10);
        System.out.println(num);
        */

        /*猜数字*/
        //实例化scanner对象
        Scanner sc = new Scanner(System.in);
        //实例化Random对象
        Random ra = new Random();

        while(true) {
            //获取一个0-10之间的随机数
            int num = ra.nextInt(10);
            //用户输入一个数字
            System.out.println("猜一个0-10之间的数字：");
            int gue = sc.nextInt();
            //判断是否相等
            if(gue == num) {
                System.out.println("恭喜你猜对了，就是"+gue);
                break;
            }
            System.out.println("很遗憾猜错了，正确数字是："+num+" ,继续猜吧!");
        }

    }
}
