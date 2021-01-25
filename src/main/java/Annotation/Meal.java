package Annotation;

import java.lang.annotation.Repeatable;
 @interface MealsContainer {
    Meal[] value();
}
@Repeatable(MealsContainer.class)
public @interface Meal {
    String meal();
    String mainDish();
}
@Meal(meal = "breakfast", mainDish="cereal")
@Meal(meal = "lunch", mainDish="pizza")
class MyMeal{
}
