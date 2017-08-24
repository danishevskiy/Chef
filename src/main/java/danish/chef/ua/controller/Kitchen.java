package danish.chef.ua.controller;

/**
 * Created by danishevskyi on 8/24/17.
 */
public class Kitchen {

    private InitSalate initSalate = new InitSalate();

    public void cooking() {
        initSalate.init();
    }

    public InitSalate getInitSalate() {
        return initSalate;
    }

}
