package design_pattern_study.call_back.call_back_3;

/**
 * @author by Wangshuo5 on 2018/5/18
 */
public class People {
    Printer printer = new Printer();

    /*
     * 同步回调
     */
    public void goToPrintSyn(Callback callback, String text) {
        printer.print(callback, text);
    }

    /*
     * 异步回调
     */
    public void goToPrintASyn(Callback callback, String text) {
        new Thread(new Runnable() {
            public void run() {
                printer.print(callback, text);
            }
        }).start();
    }

    public  void doSthElse(People people){
        System.out.println(this+"出去玩了.");
    }
}
