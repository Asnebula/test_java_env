package design_pattern_study.patterns.Creational.builder.item_abstra;

import design_pattern_study.patterns.Creational.builder.iterf.Item;
import design_pattern_study.patterns.Creational.builder.iterf.Packing;
import design_pattern_study.patterns.Creational.builder.pack_real.Wrapper;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
