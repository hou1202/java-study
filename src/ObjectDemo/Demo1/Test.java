package ObjectDemo.Demo1;

public class Test {
    public static void main(String[] args) {
        Object ob = new Object();

        //返回对象的哈希码值
        int a = ob.hashCode();
        System.out.println(a);

        //返回调用此方法对象的运行时类对象
        Class b = ob.getClass();
        System.out.println(b);

        //返回该对象的字符串表示
        String c = ob.toString();
        System.out.println(c);
        System.out.println("-------------");

        //返回其他某个对象是否与此对象“相等”
        Object obj = new Object();
        boolean d = ob.equals(obj);
        System.out.println(d);

    }
}
