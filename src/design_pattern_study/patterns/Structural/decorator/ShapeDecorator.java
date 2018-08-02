package design_pattern_study.patterns.Structural.decorator;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public abstract class ShapeDecorator implements Shape{
    protected  Shape decorateShape;

    public ShapeDecorator(Shape decorateShape) {
        this.decorateShape = decorateShape;
    }

    @Override
    public void draw() {
        decorateShape.draw();
    }
}
