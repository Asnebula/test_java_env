package design_pattern_study.patterns.Structural.bridge;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class test {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
