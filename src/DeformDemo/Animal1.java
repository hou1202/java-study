package DeformDemo;

/*抽象类*/
public abstract class Animal1 {
    //抽象方法，抽象方法要求子类必须重写
    public abstract void eat();

    public final void sleep() {
        System.out.println("睡觉");
    }
}
