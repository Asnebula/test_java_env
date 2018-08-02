package design_pattern_study.patterns.J2EE.intercpFilt;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class DebugFilter implements Filter{
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
