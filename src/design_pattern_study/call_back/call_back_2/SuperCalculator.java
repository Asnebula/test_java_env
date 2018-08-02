package design_pattern_study.call_back.call_back_2;

public class SuperCalculator {
    public void add(int a, int b, doJob  customer)
    {
        int result = a + b;
        customer.fillBlank(a, b, result);
    }
}
