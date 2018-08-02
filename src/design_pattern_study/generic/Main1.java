package design_pattern_study.generic;

/**
 * @author by Wangshuo5 on 2018/4/23
 */
 class Test<T> {
    public <U extends T> Test(U k) {
    }
}

public class Main1 {
    public static void main(String[] argv) {
        // Specify the actual type parameter for the constructor as Double
        Test<Number> t1 = new<Double> Test<Number>(new Double(1.9));

        // Let the compiler figure out, Integer is
        // the actual type parameter for the constructor
        Test<Number> t2 = new Test<Number>(new Integer(1));
        Test<Number> t3 = new Test<>(new Integer(1));

    }
}

