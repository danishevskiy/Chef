package danish.chef.ua;

import danish.chef.ua.controller.Kitchen;

/**
 * Created by danishevskyi on 8/23/17.
 */
public class App {

    public static void main (String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.cooking();
        System.out.println(kitchen.getInitSalate().getSalate().toString());
    }
}
