package design_pattern_study.call_back.call_back_2;

public class Seller {
    private String name = null;

    public Seller(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public class doHomeWork implements doJob
    {

        @Override
        public void fillBlank(int a, int b, int result)
        {
            System.out.println(name + "求助小红算账:" + a + " + " + b + " = " + result + "元");
        }

    }

    public void callHelp (int a, int b)
    {
        //此处的doHomeWork是老婆婆的回调函数 也实现了doJob接口
        new SuperCalculator().add(a, b, new doHomeWork());
    }
}
