package design_pattern_study.patterns.Creational.abstract_factory;

import design_pattern_study.patterns.Creational.abstract_factory.Color.Color;
import design_pattern_study.patterns.Creational.abstract_factory.Shape.Circle;
import design_pattern_study.patterns.Creational.abstract_factory.Shape.Rectangle;
import design_pattern_study.patterns.Creational.abstract_factory.Shape.Shape;
import design_pattern_study.patterns.Creational.abstract_factory.Shape.Square;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
