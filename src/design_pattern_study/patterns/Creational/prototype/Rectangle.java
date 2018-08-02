package design_pattern_study.patterns.Creational.prototype;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
       System.out.println("Inside Rectangle::draw() method.");
    }
}

