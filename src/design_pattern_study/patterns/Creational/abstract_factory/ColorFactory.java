package design_pattern_study.patterns.Creational.abstract_factory;

import design_pattern_study.patterns.Creational.abstract_factory.Color.Blue;
import design_pattern_study.patterns.Creational.abstract_factory.Color.Color;
import design_pattern_study.patterns.Creational.abstract_factory.Color.Green;
import design_pattern_study.patterns.Creational.abstract_factory.Color.Red;
import design_pattern_study.patterns.Creational.abstract_factory.Shape.Shape;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}

