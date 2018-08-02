package design_pattern_study.patterns.Creational.builder;

import design_pattern_study.patterns.Creational.builder.bean.ChickenBurger;
import design_pattern_study.patterns.Creational.builder.bean.Coke;
import design_pattern_study.patterns.Creational.builder.bean.Pepsi;
import design_pattern_study.patterns.Creational.builder.bean.VerBurger;

/**
 * @author by Wangshuo5 on 2018/4/24
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VerBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
