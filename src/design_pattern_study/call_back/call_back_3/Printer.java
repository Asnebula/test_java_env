package design_pattern_study.call_back.call_back_3;

/**
 * @author by Wangshuo5 on 2018/5/18
 */
public class Printer {
    public void print(Callback callback, String text) {
        System.out.println("正在打印 . . . ");
        try {
            Thread.currentThread();
            Thread.sleep(3000);// 毫秒
        } catch (Exception e) {
        }
        callback.printFinished("打印完成");
    }
}
