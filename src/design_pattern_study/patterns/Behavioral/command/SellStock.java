package design_pattern_study.patterns.Behavioral.command;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
