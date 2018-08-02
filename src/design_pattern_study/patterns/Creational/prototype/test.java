package design_pattern_study.patterns.Creational.prototype;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class test {
    public static void main(String[] args) {
        //只需要一次
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape :"+clonedShape.getType());

        //好处在于第n(n>=2)次使用时，从cache里得到浅拷贝的clone，而不是重新创建

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape :"+clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape :"+clonedShape3.getType());
    }
}
