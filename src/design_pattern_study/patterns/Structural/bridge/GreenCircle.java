package design_pattern_study.patterns.Structural.bridge;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
