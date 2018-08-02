package design_pattern_study.patterns.Creational.builder;

import design_pattern_study.patterns.Creational.builder.iterf.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
