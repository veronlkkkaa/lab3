package holderr;

import Objects.PhysicalObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Holder extends PhysicalObject implements HolderInterface {

    private HolderState holderState;
    protected List<PhysicalObject> insideitems = new ArrayList<PhysicalObject>();


    public Holder(String name, String colour, String material, HolderState holderState, List<PhysicalObject> insideitems, SizeOfObject size) {
        super(name, material, colour, size);
        this.holderState = holderState;
        this.insideitems = insideitems;

    }
    //создаем несколько конструкторов, чтобы холдер был разный, типа ну эм лол
    //если в холдере пусто, то нет смысла ему присваивать инсайд айтемс, ну типа нафиг....он пустой лол...
    public Holder(String name, String colour, String material, HolderState holderState, SizeOfObject size) {
        super(name, colour, material, size);
        this.holderState = holderState;
    }

    public void addItem(Item item){
        this.insideitems.add(item);
        if (this.holderState == HolderState.EMPTY) {
            this.holderState = HolderState.FOOL;
        }
    }

    public void addItems(Item... items){
        insideitems.addAll(List.of(items));
        if (this.holderState == HolderState.EMPTY) {
            this.holderState = HolderState.FOOL;
        }
        //Добавляем сразу несколько значений
        //точки это типа ЛЮБОЕ кол-во айтемов
        //а сверху метод у нас там типа ну один айтем... ну логично да...
    }
    public void clearHolder(){
        this.insideitems = null;
    }

    public HolderState getHolderState() {
        return holderState;
    }

    public void setHolderState(HolderState holderState) {
        this.holderState = holderState;
    }

    public List<PhysicalObject> getInsideitems() {
        return insideitems;
    }

    public void setInsideitems(ArrayList<PhysicalObject> insideitems) {
        this.insideitems = insideitems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holder holder = (Holder) o;
        return holderState == holder.holderState && Objects.equals(insideitems, holder.insideitems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holderState, insideitems);
    }

    @Override
    public String toString() {
        return "holderr.Holder{" +
                "holderState=" + holderState +
                ", insideitems=" + insideitems +
                '}';
    }

    @Override
    public void keepItems() {
        System.out.println("мешок находится в рюкзаке");
    }

    @Override
    public void open() {
        System.out.println("снюсмумрик открыл рюкзак");
    }

    @Override
    public void close() {
        System.out.println("снюсмумрик закрыл рюкзак");
    }
}
