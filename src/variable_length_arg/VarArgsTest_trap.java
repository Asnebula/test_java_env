package variable_length_arg;

/**
 * @author by Wangshuo5 on 2018/7/27
 */
public class VarArgsTest_trap {
    public static void m1(String s, String... ss) {
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }

    public static void main(String[] args) {

        m1("");
        m1("aaa");
        m1("aaa", "bbb");
    }
}
