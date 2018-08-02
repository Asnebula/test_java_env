package design_pattern_study.patterns.J2EE.busiDeleg;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class BusinessLookUp {
    //把BusinessService接口当成成员函数的返回值
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
