package design_pattern_study.patterns.Creational.builder.bean;

import design_pattern_study.patterns.Creational.builder.item_abstra.Burger;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class VerBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Ver Burger";
    }
}
