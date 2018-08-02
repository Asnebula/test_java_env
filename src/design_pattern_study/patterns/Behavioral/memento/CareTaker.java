package design_pattern_study.patterns.Behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class CareTaker {

    //负责从 Memento 中恢复对象的状态
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
