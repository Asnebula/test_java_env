package design_pattern_study.patterns.Creational.singleton;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class earth {

    //属于该类的一个instance
    private static earth instance = new earth();

    //私有的，无法实例化该类
    private earth() {
    }

    public static earth getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
