package InheritDemo;

public class Test {
    public static void main(String[] args) {
        Compute co = new Compute("雷蛇");
        Phone ph = new Phone("康佳");

        co.setRom(8);
        ph.setBrand("苹果");

        System.out.println(ph.getBrand() + "手机的最新系列已经发布了，他的摄像头使用的是:" + ph.getCamera());
        System.out.println("我的电脑用的是" + co.getRom() + "G内存，键盘用的是：" + co.getBoard());
        ph.showUsb();
    }
}
