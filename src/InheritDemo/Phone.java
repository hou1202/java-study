package InheritDemo;

/*
* 继承父类：parents
* 定义当前类的成员
* */
public class Phone extends Parents {
    private String camera;

    private int usb = 4;

    public Phone() {
        super();
        //当调用子类的无参构造时，会相当于于隐藏了一个：super()，会先调用父类的无参构造
        //如果父类是带参构造，可以直接在子类的构造中传参：super(param)
        //supper可以不写，如果写必须放在第一行
        System.out.println("子类");
    };

    public Phone(String camera) {

        this.camera = camera;
    }

    public String getCamera() {

        return camera;
    }

    public void setCamera(String camera) {

        this.camera = camera;
    }

    public void showUsb() {
        int usb = 2;

        System.out.println("局部变量：" + usb);            //调局部变量usb
        System.out.println("成员变量：" + this.usb);       //调用成员变量usb
        System.out.println("父类变量：" + super.usb);      //调用父类成员变量usb
    }

    public void openPower() {
        //调用继承了父类的成员方法:super
        //super.openPower();
        //重写了父类的成员方法
        System.out.println("显示用的是苹果的操作系统");
    }
}
