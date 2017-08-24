package danish.chef.ua.model.entity;

/**
 * Created by danishevskyi on 8/23/17.
 *
 * Effective_Java_2nd_Edition, Item 30: Use enums instead of int constants.
 */
public enum Vegetable {

    POTATO(80, 18.1, 0.4, 2),
    BEETROOT(42, 11.8, 0.1, 1.5),
    CARROT(34, 9.3, 0.1, 1.3),
    PEA(55, 8.3, 0.2,5),
    ONION(41, 10.4, 0, 1.4);

    private final double calories;
    private final double carbohydrates;
    private final double fats;
    private final double proteins;


    Vegetable(double calories, double carbohydrates, double fats, double proteins) {

        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.proteins = proteins;
    }

    public double getCalories() {
        return calories;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getProteins() {
        return proteins;
    }

}

