package holderr;

import Objects.PhysicalObject;

import java.util.Objects;

public class Item extends PhysicalObject {
    private String name;

    public Item(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "holderr.Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
