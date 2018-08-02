package design_pattern_study.patterns.Structural.bridge;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
