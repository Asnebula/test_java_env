package design_pattern_study.patterns.Behavioral.mediator;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class test {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John");
        john.sendMessage("Hello! Robert!");
    }
}
