package design_pattern_study.patterns.Creational.builder.item_abstra;

import design_pattern_study.patterns.Creational.builder.iterf.Item;
import design_pattern_study.patterns.Creational.builder.iterf.Packing;
import design_pattern_study.patterns.Creational.builder.pack_real.Bottle;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
