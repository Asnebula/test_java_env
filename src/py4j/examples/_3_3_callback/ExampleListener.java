package py4j.examples._3_3_callback;

/**
 * @author by Wangshuo5 on 2018/7/23
 * the interface is implemented in a Python class
 */
public interface ExampleListener {
    Object notify(Object source);
}
