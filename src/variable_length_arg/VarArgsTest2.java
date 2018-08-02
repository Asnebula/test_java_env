package variable_length_arg;

/**
 * @author by Wangshuo5 on 2018/7/27
 */
public class VarArgsTest2 {
    public void print(String test, Integer... is) {

    }

    public void print(String test,String...args ){

    }

    /*public static void main(String[] args) {
        VarArgsTest2 test = new VarArgsTest2();
        test.print("hello");
        test.print("hello", null);
        因为两个方法都匹配，编译器不知道选哪个，于是报错了，这里同时还有个非常不好的编码习惯，即调用者隐藏了实参类型，这是非常危险的
    }*/

    public static void main(String[] args) {
        VarArgsTest2 test = new VarArgsTest2();
        String[] strs = null;
        test.print("hello", strs);
    }
}
