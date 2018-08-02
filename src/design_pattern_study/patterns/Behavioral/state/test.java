package design_pattern_study.patterns.Behavioral.state;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class test {
    public static void main(String[] args) {

        //上下文中包含State（成员变量）
        //Context中state变化，好像Context类发生了变化
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);//startState可以设置上下文的state

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
