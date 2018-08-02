package design_pattern_study.static_block;

/**
 * @author by Wangshuo5 on 2018/5/18
 */
public class static_block_test {
    public static void main(String[] args) {
        new Child();//语句(*)
    }
}

class Parent{
    static String name = "hello";
    {
        System.out.println("parent block");
    }
    static {
        System.out.println("parent static block");
    }
    public Parent(){
        System.out.println("parent constructor");
    }
}

class Child extends Parent{
    static String childName = "hello";
    {
        System.out.println("child block");
    }
    static {
        System.out.println("child static block");
    }
    public Child(){
        System.out.println("child constructor");
    }
}

