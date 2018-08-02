package design_pattern_study.patterns.J2EE.composEntity;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
