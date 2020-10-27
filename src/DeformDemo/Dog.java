package DeformDemo;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "在吃骨头");
    }
}
