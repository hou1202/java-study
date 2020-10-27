package DeformDemo;

public class Child extends Parents {
    private String course;

    public Child() {}

    public Child(String course) {
        this.course = course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    //重写父类方法
    @Override
    public void study() {
        System.out.println(getName() + "你好要好学习" + course);
    }
}
