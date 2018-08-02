package design_pattern_study.patterns.Creational.abstract_factory.Color;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
