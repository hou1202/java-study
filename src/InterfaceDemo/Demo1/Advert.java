package InterfaceDemo.Demo1;

/*定义一个接口实现类，来实现接口Smoking*/
public class Advert implements Smoking {
    @Override
    public void smoke() {
        System.out.println("吸烟有害健康");
    }

    @Override
    public void fire() {
        System.out.println("抽烟需要打火机");
    }
}
