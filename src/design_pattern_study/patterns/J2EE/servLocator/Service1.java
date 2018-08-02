package design_pattern_study.patterns.J2EE.servLocator;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
