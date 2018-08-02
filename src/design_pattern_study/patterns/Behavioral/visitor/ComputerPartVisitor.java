package design_pattern_study.patterns.Behavioral.visitor;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
