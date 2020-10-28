package InterfaceDemo.Demo1;

/*定义一个接口 Smoking*/
public interface Smoking {

    public static final double MONEY = 30;
    int NUM = 20;       //定义前没有加修饰，但系统默认是有加修饰：public static final

    //JDK7及以前的写法，只有抽象方法
    public abstract void smoke();
    void fire();    //在接口中，方法前面不加修饰符系统自动默认为加上 : public abstract

    //JDK8以后的新增写法，静态方法和默认方法
    public static void smoke1() {
        System.out.println("JDK8以后的新增写法");
    }
    public default void smoke2() {
        System.out.println("JDK8以后的新增写法");
    }

    //JDK9以后的新增写法，私有方法
    private void Smoke3() {
        System.out.println("JDK9以后的新增写法");
    }
}
