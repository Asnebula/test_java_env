package design_pattern_study.patterns.Behavioral.observer;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        //Subject 绑定了这个Observer
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
