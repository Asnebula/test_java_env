package design_pattern_study.patterns.Behavioral.chianOfRspsb;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
