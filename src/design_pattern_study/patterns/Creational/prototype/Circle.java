package design_pattern_study.patterns.Creational.prototype;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
       System.out.println("Inside Circle::draw() method.");
    }
}

