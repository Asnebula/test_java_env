package design_pattern_study.patterns.J2EE.busiDeleg;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
