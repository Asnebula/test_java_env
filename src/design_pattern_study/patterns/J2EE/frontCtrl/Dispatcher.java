package design_pattern_study.patterns.J2EE.frontCtrl;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class Dispatcher {
    //成员变量组装
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
