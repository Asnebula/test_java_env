package design_pattern_study.patterns.Behavioral.state;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
