package InheritDemo;

/*
* 继承父类：parents
* 定义当前类的成员
* */
public class Phone extends Parents {
    private String camera;

    private int usb = 4;

    public Phone() {};

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

        System.out.println(usb);            //调局部变量usb
        System.out.println(this.usb);       //调用成员变量usb
        System.out.println(super.usb);      //调用父类成员变量usb
    }
}
