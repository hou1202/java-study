package InterfaceDemo.Demo1;

public class Test {
    public static void main(String[] arge) {
        Smoking sm = new Advert();
        sm.smoke();
        sm.fire();

        //接口中的成员变量都是静态常量，可以通过接口名.常量名来进行调用
        System.out.println(Smoking.MONEY);
        System.out.println(Smoking.NUM);
    }
}
