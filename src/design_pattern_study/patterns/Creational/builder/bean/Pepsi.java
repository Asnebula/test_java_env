package design_pattern_study.patterns.Creational.builder.bean;

import design_pattern_study.patterns.Creational.builder.item_abstra.ColdDrink;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
