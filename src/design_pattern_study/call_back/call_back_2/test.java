package design_pattern_study.call_back.call_back_2;

public class test {
    public static void main(String[] args)
    {
        int a = 56;
        int b = 31;
        int c = 26497;
        int d = 11256;
        Student s1 = new Student("小明");
        Seller s2 = new Seller("老婆婆");

        s1.callHelp(a, b);
        s2.callHelp(c, d);

        //成员内部类的实例化
        //方法1
        //Student.doHomeWork in =s1.new doHomeWork();
        //方法2
        //在外部类的构造函数里创建成员内部类的对象，再进行访问
    }
}
