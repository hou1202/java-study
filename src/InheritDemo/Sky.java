package InheritDemo;

public class Sky extends Parents{
    private float fly;

    public Sky() {}

    public Sky(float fly) {
        this.fly = fly;
    }

    public float getFly() {
        return fly;
    }

    public void setFly(float fly) {
        this.fly = fly;
    }
}
