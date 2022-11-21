package ad211.cheban;

import java.util.ArrayList; // класс, позволяющий создавать списки

public class GenericClass <T extends ArrayList> {
    private ArrayList<Object> group;
    public GenericClass(ArrayList<Object> group) {
        this.group = group;
    }
    public void add(Object elements){
        group.add(elements);
    }
    public void remove(Object elements){
        group.remove(elements);
    }
    public Object get(int index){
        return  group.get(index);
    }
    public ArrayList<Object> getGroup(){
        return group;
    }
}