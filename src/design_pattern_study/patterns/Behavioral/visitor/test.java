package design_pattern_study.patterns.Behavioral.visitor;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class test {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
