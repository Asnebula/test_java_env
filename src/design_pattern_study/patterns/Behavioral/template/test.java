package design_pattern_study.patterns.Behavioral.template;

/**
 * @author by Wangshuo5 on 2018/4/27
 */
public class test {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
