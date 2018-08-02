package design_pattern_study.call_back.call_back_1;

//小红(超级计算器)
public class SuperCalculator {
    //比较特别的一点是，回调函数是小明的
    public void add(int a, int b, Student  xiaoming)
    {   //小红在计算(假设是一个很耗时间的事情)
        int result = a + b;

        //计算完毕，回调函数调用(打电话通知)，fillBlank可以不是xiaoming的方法，写到其他的类，单独接口都行
        xiaoming.fillBlank(a, b, result);
    }
}
