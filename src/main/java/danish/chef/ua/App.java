package danish.chef.ua;

import danish.chef.ua.controller.Kitchen;
import danish.chef.ua.dao.KitchenDao;
import danish.chef.ua.model.entity.Salate;

/**
 * Created by danishevskyi on 8/23/17.
 */
public class App {

    public static void main (String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.cooking();
        System.out.println(kitchen.getInitSalate().getSalate().toString());

        KitchenDao kitchenDao = new KitchenDao();
        Salate salate = kitchen.getInitSalate().getSalate();
        kitchenDao.save(salate);
        kitchenDao.delete(salate);
    }
}
