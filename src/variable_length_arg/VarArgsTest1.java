package variable_length_arg;

import static java.lang.System.out;

/**
 * @author by Wangshuo5 on 2018/7/27
 * 一个方法只能有一个可变长参数，并且这个可变长参数必须是该方法的最后一个参数
 */
public class VarArgsTest1 {
    public void print(String... args) {
        for (int i = 0; i < args.length; i++) {
            out.println(args[i]);
        }
    }

    public void print(String test,String...args ){
        out.println("----------");
    }

    public static void main(String[] args) {
        VarArgsTest1 test = new VarArgsTest1();
        /*test.print("hello");
        test.print("hello", "alexia");
        对于上面的代码，main方法中的两个调用都不能编译通过，因为编译器不知道该选哪个方法调用，如下所示*/
    }
}
