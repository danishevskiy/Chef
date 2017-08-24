package danish.chef.ua.model.entity;

/**
 * Created by danishevskyi on 8/23/17.
 */
public class Component {

    private final Vegetable vegetable;
    private double count;

    public Component(Vegetable vegetable, double count) {
        this.vegetable = vegetable;
        if(count < 0) {
            throw new IllegalArgumentException("must be non null");
        }
        this.count = count;
    }

    public Component(Vegetable vegetable) {
        this.vegetable = vegetable;
        this.count = 0;
    }

    public Vegetable getVegetable() {
        return vegetable;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }
}

