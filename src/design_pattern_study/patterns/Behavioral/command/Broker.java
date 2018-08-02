package design_pattern_study.patterns.Behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Wangshuo5 on 2018/4/25
 */
public class Broker {
    //一组Order当做成员变量，Order本身还只是个接口，任何Order的实现都可以传进来，实现了多态
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
