package design_pattern_study.patterns.Creational.abstract_factory.Shape;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
