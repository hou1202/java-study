package Demo;

public class ClassTestDemo {
    public static void main(String[] arge) {
        /*
        * 实例化无参构造方法
        * 通过setXXX(),设置实例化对象的成员变量值
        * */

        /*ClassDemo cd = new ClassDemo();
        cd.setSchool("中国科学技术大学");
        cd.setClasses("计算机应用与技术专业");
        cd.setName("赵启赋");
        cd.setAge(25);*/


        /*
        * 实例化全参构造方法，并设置成员变量值
        * */
        ClassDemo cd = new ClassDemo("中国科学技术大学", "计算机应用与技术专业", "赵启赋", 25);

        /*
         * 通过getXXX()，获取实例化对象的成员变量值
        * */
        String school = cd.getSchool();
        String classes = cd.getClasses();
        String name = cd.getName();
        int age = cd.getAge();
        System.out.println(school +"通知：");
        System.out.println("我校" + classes + "同学："+ name + "，年龄：" + age + "岁，因在校期间表现期间表现优异，现在颁发奖学金！");
    }
}
