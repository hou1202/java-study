package InheritDemo;
/*
* 继承
* 父类
* */
public class Parents {
    /*成员变量*/
    private String cpu;
    private int rom;
    private int disk = 512;
    private String brand;        //品牌

    int usb = 3;

    //无参构造
    public Parents() {}

    //全参构造
    public Parents(String cpu, int rom, int disk, String brand) {
        this.cpu = cpu;
        this.rom = rom;
        this.disk = disk;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
