package design_pattern_study.call_back.call_back_1;

public class Student {
    private String name = null;

    public Student(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //小明并不拥有小红(SuperCalculator),只是下指示(求助)
    public void callHelp (int a, int b)
    {
       // 把自身的引用通过this传进去
        new SuperCalculator().add(a, b, this);
    }

    //回调函数，可以是自己的方法，也可以是公用的或者其他类的方法
    public void fillBlank(int a, int b, int result)
    {
        System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
    }
}
