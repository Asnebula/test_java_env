package design_pattern_study.patterns.Behavioral.state;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class Context {
    //State以成员变量形式传进来
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
