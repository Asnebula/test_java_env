package design_pattern_study.patterns.J2EE.intercpFilt;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
