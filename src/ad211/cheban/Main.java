package ad211.cheban;

import java.util.*; // обеспечивает методы динамического создания, доступа и управления массивами Java

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        GenericClass<ArrayList<Object>> group1= new GenericClass<>(list1);
        GenericClass<ArrayList<Object>> group2= new GenericClass<>(list2);
        // создаем первую группу
        group1.add(5);
        group1.add(3);
        group1.add(1);
        group1.add(7);
        for (int i = 0; i<4; i++ ){
            System.out.println("Индекс " + i + " элемента первой группы: " + group1.get(i));
        }
        System.out.print("\n");
        // создаем вторую группу
        group2.add(1);
        group2.add(3);
        group2.add(5);
        group2.add(6);
        group2.add(2);
        group1.remove(4);
        for (int i = 0; i<5; i++ ){
            System.out.println("Индекс " + i + " элемента второй группы: " + group2.get(i));
        }
        System.out.print("Пересечение двух груп: ");
        List<Object> group3 = intersection(group1.getGroup(),group2.getGroup());
        System.out.println(group3);
    }
    public static ArrayList<Object> intersection(ArrayList<Object> first, ArrayList<Object> second){
        ArrayList<Object> arr = new ArrayList<>();
        for(Object i: first)
            // перебираем элементы первого массива
            for(Object j: second)
                // перебираем элементы второго массива
                if(!arr.contains(i) && i == j)
                    arr.add((Integer) i);
        return arr;
    }
}