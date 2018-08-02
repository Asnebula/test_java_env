package design_pattern_study.patterns.Structural.filter;

import java.util.List;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
