package design_pattern_study.patterns.Structural.decorator;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public void draw() {
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
