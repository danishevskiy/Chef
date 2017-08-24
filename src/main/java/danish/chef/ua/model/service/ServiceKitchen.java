package danish.chef.ua.model.service;

import danish.chef.ua.model.entity.Component;
import danish.chef.ua.model.entity.Salate;
import danish.chef.ua.model.entity.Vegetable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danishevskyi on 8/24/17.
 */
public class ServiceKitchen {

    public double calcCalories(Salate salate) {
        double count = 0;
        List<Component> components = salate.getContent();
        for (Component component : components) {
            count+=component.getVegetable().getCalories()*component.getCount();
        }
        return count;
    }

    public List<Vegetable> findVegetable(Salate salate, double start, double end) {
        List<Vegetable> list = new ArrayList<Vegetable>();
        for (Component component : salate.getContent()) {
            if (component.getCount()*component.getVegetable().getCalories() > start && component.getCount()*component.getVegetable().getCalories() < end) {
                list.add(component.getVegetable());
            }
        }
        return list;
    }
}
