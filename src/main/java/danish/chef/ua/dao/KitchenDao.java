package danish.chef.ua.dao;

import danish.chef.ua.model.entity.Salate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denystymoshkevych on 8/23/17.
 */
public class KitchenDao {

    private List<Salate> db = new ArrayList<Salate>();

    public boolean save(Salate salate){
        if (salate == null) {
            db.add(salate);
            return true;
        }
        return false;
    }

    public boolean delete(Salate salate){
        if (salate == null) {
            db.remove(salate);
            return true;
        }
        return false;
    }

}
