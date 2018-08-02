package design_pattern_study.patterns.Creational.builder.pack_real;

import design_pattern_study.patterns.Creational.builder.iterf.Packing;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
