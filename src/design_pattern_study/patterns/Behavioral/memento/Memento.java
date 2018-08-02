package design_pattern_study.patterns.Behavioral.memento;

/**
 * 用来存储状态
 * @author by Wangshuo5 on 2018/4/26
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
