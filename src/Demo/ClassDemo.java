package Demo;
/*
* 封装
* 无参构造
* 全参构造
* 方法重载
* 成员变量
* 快速生成构造方法和setXXX()、getXXX() 快捷键：Alter + Insert
* */
public class ClassDemo {
    //成员变量
    private String school;

    private String classes;

    private String name;

    private int age;

    //无参构造
    public ClassDemo() {}

    //全参构造
    public ClassDemo(String school, String classes, String name, int age) {
        this.school = school;
        this.classes = classes;
        this.name = name;
        this.age = age;
    }

    /*获取成员变量值*/
    public String getSchool() {
        return this.school;
        //或
        //return school;
    }

    /*设置成员变更值*/
    public void setSchool(String school) {
        this.school = school;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
