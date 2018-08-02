package design_pattern_study.patterns.Behavioral.strategy;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class Context {
    //把Strategy（接口）当成成员变量传进来
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
