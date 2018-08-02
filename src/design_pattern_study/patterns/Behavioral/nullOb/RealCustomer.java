package design_pattern_study.patterns.Behavioral.nullOb;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
