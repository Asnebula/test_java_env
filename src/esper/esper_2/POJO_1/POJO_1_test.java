package esper.esper_2.POJO_1;

import com.espertech.esper.client.*;

/**
 * @author by Wangshuo5 on 2018/4/12
 */
class Person_1_Listener implements UpdateListener {

    @Override
    public void update(EventBean[] newEvents, EventBean[] oldEvents) {
        if (newEvents != null) {
            System.out.println("output age:" +newEvents[0].get("age")+" children:"+newEvents[0].get("children")+" address:"+newEvents[0].get("address"));
        }
    }
}

public class POJO_1_test {
    public static void main(String args[]){
        EPServiceProvider epsService = EPServiceProviderManager.getDefaultProvider();
        EPAdministrator admin = epsService.getEPAdministrator();
        admin.getConfiguration().addEventType(Person_1.class);

        String epl = "select age,children,address from Person_1 where name=\"ws\"  ";

        EPStatement state = admin.createEPL(epl);
        state.addListener(new Person_1_Listener());

        /*runtime 实时运算EPL，而listener可以异步处理(发送)结果*/
        EPRuntime runtime = epsService.getEPRuntime();

        Person_1 person_1 = new Person_1();
        runtime.sendEvent(person_1);
    }
}
