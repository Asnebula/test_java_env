package design_pattern_study.patterns.Behavioral.visitor;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public interface ComputerPart {
    //接受了一个接口作为成员方法的入参
    public void accept(ComputerPartVisitor computerPartVisitor);
}
