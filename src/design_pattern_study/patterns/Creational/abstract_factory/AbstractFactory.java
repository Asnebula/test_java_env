package design_pattern_study.patterns.Creational.abstract_factory;

import design_pattern_study.patterns.Creational.abstract_factory.Color.Color;
import design_pattern_study.patterns.Creational.abstract_factory.Shape.Shape;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
