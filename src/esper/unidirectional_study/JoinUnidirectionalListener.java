package esper.unidirectional_study;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

/**
 * @author by Wangshuo5 on 2018/5/21
 */
public class JoinUnidirectionalListener implements UpdateListener {
    @Override
    public void update(EventBean[] newEvents, EventBean[] oldEvents) {
        if (newEvents != null){
            //System.out.println(newEvents[0].get("o")+", "+newEvents[0].get("b"));
            //System.out.println(newEvents[0].get("c"));
            System.out.println(newEvents[0].get("c")+", "+newEvents[0].get("p"));
        }
    }
}
