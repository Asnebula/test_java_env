package design_pattern_study.patterns.Creational.prototype;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
       System.out.println("Inside Square::draw() method.");
    }
}

