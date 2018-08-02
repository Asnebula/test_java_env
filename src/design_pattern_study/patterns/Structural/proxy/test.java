package design_pattern_study.patterns.Structural.proxy;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class test {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpb");

        image.display();
        System.out.println("");
        image.display();
    }
}
