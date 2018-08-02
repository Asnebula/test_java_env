package design_pattern_study.patterns.Creational.builder.bean;

import design_pattern_study.patterns.Creational.builder.item_abstra.ColdDrink;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
