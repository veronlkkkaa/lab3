package Objects;

import java.util.Objects;

public class Creature {

    private String name;
    private int age;
    //можно и не прайват, можно протектед
    //главное не паблик чтобы всякие чупики не лезли и не меняли значение


    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //когда буду создавать элемент класса кричер этому кричеру будут присваиваться нэйм и айдж......
    //чтобы получить или установить имя и айдж снюсика и хатико пишем эту штуку, ну вот
    //потому что у нас прайват и мы не хотим чтобы чупики их меняли, но получать как-то надо
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sit(Location location) {
        System.out.print(this.getName() + " сел на " + location.getTitle());
    }

    public void move() {
        System.out.println(this.getName() + " ползает");
    }
    public void feel() {
        System.out.println(this.getName() + " бьётся током");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return age == creature.age && Objects.equals(name, creature.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Creature.Creature{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}