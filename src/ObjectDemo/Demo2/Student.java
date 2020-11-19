package ObjectDemo.Demo2;

public class Student {
    private int id;
    private String name;
    private float score;

    //构造方法
    public Student() {
    }

    public Student(int id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    //重写toString() 方法
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
    /*
    //自定义重写equals() 方法
    @Override
    public boolean equals(Object obj) {
        //向下转型
        Student st2 = (Student)obj;
        return this.id == st2.id;
    }
    */

    @Override
    public boolean equals(Object o) {
        /*
        * this  表示本实例对象
        * o     表示形参实例对象
        * */
        if (this == o)
            return true;

        /*
        * getClass  表示获取对象的字解码值
        * 判断两个对象比较的是否为同一个类
        * */
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;
        return id == student.id &&
                Float.compare(student.score, score) == 0 &&
                name.equals(student.name);
    }

}
