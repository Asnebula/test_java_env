package design_pattern_study.patterns.Behavioral.strategy;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
