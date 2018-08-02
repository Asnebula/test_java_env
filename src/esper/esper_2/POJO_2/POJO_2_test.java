package esper.esper_2.POJO_2;

import com.espertech.esper.client.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Wangshuo5 on 2018/4/12
 */
class Person_2_Listener implements UpdateListener {

    @Override
    public void update(EventBean[] newEvents, EventBean[] oldEvents) {
        if (newEvents != null) {
            System.out.println("output child_2:" +newEvents[0].get("child_2"));
            System.out.println("output phone_home:"+newEvents[0].get("phone_home"));
            System.out.println("output address:"+newEvents[0].get("a_road"));
            System.out.println();
        }
    }
}

public class POJO_2_test {
    public static void main(String args[]){
        EPServiceProvider epsService = EPServiceProviderManager.getDefaultProvider();
        EPAdministrator admin = epsService.getEPAdministrator();
        admin.getConfiguration().addEventType(Person_2.class);

        String epl = "select children[1] as child_2,phones('home') as phone_home, address.road as a_road from Person_2";

        EPStatement state = admin.createEPL(epl);
        state.addListener(new Person_2_Listener());

        /*runtime 实时运算EPL，而listener可以异步处理(发送)结果*/
        EPRuntime runtime = epsService.getEPRuntime();

        Child cld1=new Child();
        cld1.setName("cld1");
        cld1.setGender(1);

        Child cld2=new Child();
        cld2.setName("cld2");
        cld2.setGender(1);

        Child cld3=new Child();
        cld3.setName("cld3");
        cld3.setGender(0);

        List<Child> children1=new ArrayList<Child>();
        children1.add(cld1);
        children1.add(cld2);

        List<Child> children2=new ArrayList<Child>();
        children2.add(cld2);
        children2.add(cld3);

        Address add1= new Address();
        add1.setHouseNo(1);
        add1.setRoad("One");
        add1.setStreet("street0");

        Address add2= new Address();
        add2.setHouseNo(2);
        add2.setRoad("Seven");
        add2.setStreet("street1");

        Person_2 person_1 = new Person_2();
        person_1.setName("p1");
        person_1.setChildren(children1);
        person_1.setPhones("home",100);
        runtime.sendEvent(person_1);

        Person_2 person_2 = new Person_2();
        person_2.setName("p2");
        person_2.setAddress(add2);
        person_2.setChildren(children2);
        person_2.setPhones("home",101);
        person_2.setPhones("mobile",102);
        runtime.sendEvent(person_2);
    }
}
