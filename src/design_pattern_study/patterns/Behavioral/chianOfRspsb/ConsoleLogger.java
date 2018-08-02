package design_pattern_study.patterns.Behavioral.chianOfRspsb;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
