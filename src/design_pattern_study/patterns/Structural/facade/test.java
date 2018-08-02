package design_pattern_study.patterns.Structural.facade;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class test {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
