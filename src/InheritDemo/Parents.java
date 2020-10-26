package InheritDemo;
/*
* 继承
* 父类
* */
public class Parents {
    /*成员变量*/
    private String name;
    private String sex;
    private int age;

    //无参构造
    public Parents() {}

    //全参构造
    public Parents(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
