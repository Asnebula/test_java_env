package design_pattern_study.patterns.Behavioral.visitor;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
