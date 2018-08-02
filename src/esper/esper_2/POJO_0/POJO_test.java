package esper.esper_2.POJO_0;

import com.espertech.esper.client.*;

/**
 * @author by Wangshuo5 on 2018/4/11
 */

class PersonListener implements UpdateListener {

    public void update(EventBean[] newEvents, EventBean[] oldEvents) {
        if (newEvents != null) {
            Integer age = (Integer) newEvents[0].get("age");
            System.out.println("the person's age is " + age);
        }
    }

}

public class POJO_test {
    public static void main(String args[]) {
        EPServiceProvider epsService = EPServiceProviderManager.getDefaultProvider();
        EPAdministrator admin = epsService.getEPAdministrator();
        /*
            有如下这句话，则epl中的from可以直接写Person，否则要用Person.class.getName();
        * */
//        admin.getConfiguration().addEventType(Person.class);

        String ps = Person_0.class.getName();
        String epl = "select age from " + ps + "  where name='ws'";

        EPStatement state = admin.createEPL(epl);
        state.addListener(new PersonListener());

        EPRuntime runtime = epsService.getEPRuntime();

        Person_0 person1 = new Person_0();
        person1.setName("ws");
        person1.setAge(15);
        runtime.sendEvent(person1);

    }
}
