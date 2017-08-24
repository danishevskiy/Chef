package danish.chef.ua.controller;

import danish.chef.ua.model.entity.Component;
import danish.chef.ua.model.entity.Salate;
import static danish.chef.ua.model.entity.Vegetable.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denystymoshkevych on 8/24/17.
 */
public class InitSalate {

    private Salate salate = new Salate();
    private List<Component> components = new ArrayList<Component>();

    public void init() {
        salate.setName("Vinaigrette");
        components.add(new Component(POTATO, 1.5));
        components.add(new Component(BEETROOT, 3));
        components.add(new Component(CARROT, 1.5));
        components.add(new Component(ONION, 1));
        components.add(new Component(PEA, 1.5));
        salate.setContent(components);
    }


    public Salate getSalate() {
        return salate;
    }

    public void setSalate(Salate salate) {
        this.salate = salate;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

}
