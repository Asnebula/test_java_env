package design_pattern_study.patterns.J2EE.servLocator;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class test{
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
