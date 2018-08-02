package design_pattern_study.patterns.Creational.abstract_factory;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return  new ColorFactory();
        }
        return null;
    }
}
