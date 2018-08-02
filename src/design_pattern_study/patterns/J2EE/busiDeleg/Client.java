package design_pattern_study.patterns.J2EE.busiDeleg;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
