package Objects;

public class Hatifnaff extends Creature {
    public Hatifnaff(String name,int age){
        super(name, age);
    }
    public void cling(){
        System.out.print(this.getName() + " цепляется лапками, когда");
        beBorn();
    }
    public void beBorn(){
        System.out.println(" появляется на свет");
    }




    @Override
    public String toString() {
        return "Creature.Hatifnaff{}";
    }
}
