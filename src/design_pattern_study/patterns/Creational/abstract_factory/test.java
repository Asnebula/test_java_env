package design_pattern_study.patterns.Creational.abstract_factory;

import design_pattern_study.patterns.Creational.abstract_factory.Color.Color;
import design_pattern_study.patterns.Creational.abstract_factory.Shape.Shape;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class test {
    public static void main(String[] args) {
        AbstractFactory sf = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = sf.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = sf.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = sf.getShape("SQUARE");
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
