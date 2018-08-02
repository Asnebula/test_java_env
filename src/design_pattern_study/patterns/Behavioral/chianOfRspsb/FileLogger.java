package design_pattern_study.patterns.Behavioral.chianOfRspsb;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
