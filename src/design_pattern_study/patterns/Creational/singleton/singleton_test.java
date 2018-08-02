package design_pattern_study.patterns.Creational.singleton;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class singleton_test {
    public static void main(String[] args) {
        /*
        不能实例化该类，因为其构造方法是私有的，类外不能使用其构造函数
        只能通过getter setter访问其私有变量
        * */
        //earth e = new earth();
        earth.getInstance().showMessage();
    }
}
