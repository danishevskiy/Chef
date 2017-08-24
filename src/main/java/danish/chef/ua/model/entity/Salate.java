package danish.chef.ua.model.entity;

import java.util.List;

/**
 * Created by danishevskyi on 8/24/17.
 */
public class Salate {

    private String name;
    private List<Component> content;

    public Salate() {
    }

    public Salate(String name, List<Component> content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getContent() {
        return content;
    }

    public void setContent(List<Component> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Salate{\n" +
                "name='" + name + '\n' +
                ", content=" + content +
                '}';
    }
}
