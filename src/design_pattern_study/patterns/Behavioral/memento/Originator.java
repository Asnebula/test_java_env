package design_pattern_study.patterns.Behavioral.memento;

/**
 * 创建并在 Memento 对象中存储状态
 * @author by Wangshuo5 on 2018/4/26
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
