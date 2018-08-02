package design_pattern_study.inner_class.inner_class_4;

//在方法中返回一个匿名内部类
public class Parcel6 {
    public Contents cont() {
        return new Contents() {
            private int i = 11;
            public int value() {
                return i;
            }
        }; // 在这里需要一个分号
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
        System.out.println(c.value());
    }
}
