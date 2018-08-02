package design_pattern_study.call_back.call_back_3;

/**
 * @author by Wangshuo5 on 2018/5/18
 */
public class Main_tb {
    public static void main(String[] args) {
        People people = new People();
        Callback callback = new Callback() {
            @Override
            public void printFinished(String msg) {
                System.out.println("打印机告诉我的消息是 ---> " + msg);
            }
        };
        System.out.println("需要打印的内容是 ---> " + "打印一份简历");
        people.goToPrintSyn(callback, "打印一份简历");
        System.out.println("我在等待 打印机 给我反馈");
    }

}
