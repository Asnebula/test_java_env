package design_pattern_study.patterns.Behavioral.interpreter;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
