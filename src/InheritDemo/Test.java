package InheritDemo;

public class Test {
    public static void main(String[] args) {
        Sky sk = new Sky(15);
        Land la = new Land(1);

        sk.setName("鹰");
        la.setName("老虎");

        System.out.println(sk.getName() + "的飞行高度是:" + sk.getFly() + "千米");
        System.out.println(la.getName() + "的奔跑速度是：" + la.getSpeed() + "km/h");
    }
}
