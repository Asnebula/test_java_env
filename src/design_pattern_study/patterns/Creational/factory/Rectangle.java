package design_pattern_study.patterns.Creational.factory;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
