package design_pattern_study.patterns.Behavioral.observer;

/**
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象
 * @author by Wangshuo5 on 2018/4/26
 */
public class test {
    public static void main(String[] args) {
        //subject里包含所有Observer，Observer又是一个抽象类，可以有不同实现
        Subject subject = new Subject();

        //subject绑定了三个Observer
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}

