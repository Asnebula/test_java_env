package design_pattern_study.patterns.Behavioral.observer;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
