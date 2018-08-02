package design_pattern_study.patterns.Behavioral.nullOb;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
