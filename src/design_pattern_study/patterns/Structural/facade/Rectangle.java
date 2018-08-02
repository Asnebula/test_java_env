package design_pattern_study.patterns.Structural.facade;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
