package design_pattern_study.patterns.Behavioral.observer;

/**
 * @author by Wangshuo5 on 2018/4/26
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal  String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
