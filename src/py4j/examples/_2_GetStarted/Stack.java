package py4j.examples._2_GetStarted;

import java.util.LinkedList;
import java.util.List;

/**
 * @author by Wangshuo5 on 2018/7/20
 */
public class Stack {
    private List<String> internalList = new LinkedList<String>();

    public void push(String element) {
        internalList.add(0, element);
    }

    public String pop() {
        return internalList.remove(0);
    }

    public List<String> getInternalList() {
        return internalList;
    }

    public void pushAll(List<String> elements) {
        for (String element : elements) {
            this.push(element);
        }
    }
}
