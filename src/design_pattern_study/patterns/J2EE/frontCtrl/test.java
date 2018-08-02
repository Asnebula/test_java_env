package design_pattern_study.patterns.J2EE.frontCtrl;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class test {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
