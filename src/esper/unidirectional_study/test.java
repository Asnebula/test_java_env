package esper.unidirectional_study;

import com.espertech.esper.client.*;

/**
 * @author by Wangshuo5 on 2018/5/21
 */
public class test {
    public static void main(String[] args)  {
        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider();

        EPAdministrator admin =  epService.getEPAdministrator();

        String epl1 = "select sum(o.price) as c, o.price as p from " + Orange.class.getName()+ " as o unidirectional, "+Banana.class.getName()+
                "#keepall as b where o.price=b.price"; //
        EPStatement stat = admin.createEPL(epl1);
        stat.addListener(new JoinUnidirectionalListener());

        EPRuntime runtime = epService.getEPRuntime();




        Banana b1 = new Banana();
        b1.setPrice(1);
        System.out.println("Send Banana1");
        runtime.sendEvent(b1);

        Banana b2 = new Banana();
        b2.setPrice(2);
        System.out.println("Send Banana2");
        runtime.sendEvent(b2);


        Orange o2 = new Orange();
        o2.setPrice(2);
        System.out.println("Send Orange2");
        runtime.sendEvent(o2);


        Orange o1 = new Orange();
        o1.setPrice(1);
        System.out.println("Send Orange1");
        runtime.sendEvent(o1);

        Orange o3 = new Orange();
        o3.setPrice(3);
        System.out.println("Send Orange3");
        runtime.sendEvent(o3);

        Banana b3 = new Banana();
        b3.setPrice(3);
        System.out.println("Send Banana3");
        runtime.sendEvent(b3);



    }
}
