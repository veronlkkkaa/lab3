package holderr;

import Objects.PhysicalObject;

import java.util.Objects;

public class Seeds extends PhysicalObject {
    private SizeOfObject size;
    private ColourofSeeds colour;

    public Seeds(String name, SizeOfObject size, ColourofSeeds colour) {
        super(name);
        this.size = size;
        this.colour = colour;
    }

    public SizeOfObject getSize() {
        return size;
    }

    public void setSize(SizeOfObject size) {
        this.size = size;
    }

    public String getColour() {
        return colour.getTitle();
    }

    public void setColour(ColourofSeeds colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Seeds seeds = (Seeds) o;
        return size == seeds.size && colour == seeds.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, colour);
    }

    @Override
    public String toString() {
        return "holderr.Seeds{" +
                "size=" + size +
                ", colour=" + colour +
                '}';
    }
}
