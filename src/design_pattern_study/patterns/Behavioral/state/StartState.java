package design_pattern_study.patterns.Behavioral.state;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class StartState implements State {

    //Context当成成员方法的参数传起来
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
