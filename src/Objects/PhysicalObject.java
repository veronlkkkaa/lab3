package Objects;

import holderr.ColourofSeeds;
import holderr.SizeOfObject;

public abstract class PhysicalObject {
    private String colour;
    private String name;
    private String material;
    private SizeOfObject size;
    //можно и не прайват, можно протектед
    //главное не паблик чтобы всякие чупики не лезли и не меняли значение

    public PhysicalObject(String name, String material, String colour, SizeOfObject size) {
        this.colour = colour;
        this.material = material;
        this.name = name;
        this.size = size;
        //когда буду создавать элемент класса физикалобджект этому обджекту будут присваиваться цвет и материал......
        //чтобы получить или установить цвет и материал наследуемых классов пишем this - ключевое слово представляет ссылку на текущий экземпляр класса
        //потому что у нас прайват и мы не хотим чтобы чупики их меняли, но получать как-то надо
    }

    public PhysicalObject(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public SizeOfObject getSize() {
        return size;
    }

    public void setSize(SizeOfObject size) {
        this.size = size;
    }
}
