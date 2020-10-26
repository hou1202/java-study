package InheritDemo;

/*
* 继承父类：parents
* 定义当前类的成员
* */
public class Land extends Parents {
    private float speed;

    public Land() {};

    public Land(float spend) {
        this.speed = spend;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
