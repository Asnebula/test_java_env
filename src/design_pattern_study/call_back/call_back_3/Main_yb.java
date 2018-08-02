package design_pattern_study.call_back.call_back_3;

/**
 * @author by Wangshuo5 on 2018/5/18
 */
public class Main_yb {
    //我让printer去打印简历，同时告知我的电话号码callback，printer打印完毕就会打电话（调用callback函数）通知我
    public static void main(String[] args) {
        People people = new People();
        Callback callback = new Callback() {
            @Override
            public void printFinished(String msg) {
                System.out.println("打印机告诉我的消息是 ---> " + msg);
            }
        };
        System.out.println("需要打印的内容是 ---> " + "打印一份简历");
        people.goToPrintASyn(callback, "打印一份简历");
        //此句也可以是people.anyMethod(),这里简单起见，写的主线程执行的程序,e.g.
        //people.doSthElse(people);
        System.out.println("我在等待 打印机 给我反馈");

    }
}
