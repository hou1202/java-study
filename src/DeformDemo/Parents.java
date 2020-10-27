package DeformDemo;

public class Parents {
    private String name;

    public Parents() {};

    public Parents(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void study() {
        System.out.println("好好学习");
    }
}
