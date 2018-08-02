package design_pattern_study.patterns.Creational.factory;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class test {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape shape1 = sf.getShape("circle");
        shape1.draw();

        Shape shape2 = sf.getShape("rectangle");
        shape2.draw();

        Shape shape3 = sf.getShape("square");
        shape3.draw();
    }
}
