package DeformDemo;

public class Test {
    public static void main(String[] arge) {
        Parents pa = new Child("英语");
        pa.setName("成龙");
        pa.study();
        System.out.println("---------------");


        Dog dg = new Dog();
        dg.setName("小狗");
        showAnimal(dg);

        Cat ca = new Cat();
        ca.setName("小猫");
        showAnimal(ca);
        System.out.println("---------------");


        Animal1 an1 = new Dog1();
        an1.eat();
        an1.sleep();
    }

    /**
     * 多态展示
     * 父类型作为形参的数据类型
     * 这样可以接收其他任意子类对象
     * */
    public static void showAnimal(Animal an) {
        an.eat();
    }
}
