package Objects;


import holderr.Holder;

import holderr.Seeds;

public class Snusmumric extends Creature {
    //конструктор снусика берем от родителя
    public Snusmumric(String name, int age) {
        super(name, age);
        //супер пупер - вызываем конструктор родительского класса
    }
    public void waitt() {
        sit(Location.GROUNG);
        System.out.print(" и стал ждать");
    }

    public void pull(PhysicalObject item, Holder holder) {
        System.out.println(this.getName() + " вытащил " + item.getSize().getTitle() + " " + item.getName() + " из " + holder.getName());
    }

    public void throwSeeds(Location locationn, Location location, Distance distance, Emotion emotion, Seeds seeds){
        System.out.println(locationn.getTitle() + " снюсмумрик " + emotion.getTitle() + " " +
                distance.getTitle() + " броосил " + seeds.getColour() + " семена на " + location.getTitle() + "...");
    }

    public void search(Holder holder){
        System.out.println(this.getName() + " роется в " + holder.getName());
    }


    @Override
    public String toString() {
        return "Creature.Snusmumric{}";
    }
}
