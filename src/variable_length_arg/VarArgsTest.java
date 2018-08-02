package variable_length_arg;

import static java.lang.System.out;

/**
 * @author by Wangshuo5 on 2018/7/27
 */
public class VarArgsTest {
    public void print(String... args) {
        for (int i = 0; i < args.length; i++) {
            out.println(args[i]);
        }
    }

    public void print(String test) {
        out.println("----------");
    }

    public static void main(String[] args) {
        VarArgsTest test = new VarArgsTest();
        test.print("hello");
        test.print("hello", "alexia");
    }
}
