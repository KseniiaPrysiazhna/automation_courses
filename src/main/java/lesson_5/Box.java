package lesson_5;

import java.util.ArrayList;
import java.util.List;

class Box<T extends Fruit> {
    public List<T> getFruitsList() {
        return fruitsList;
    }

    private List<T> fruitsList;

    public Box() {
        fruitsList = new ArrayList<T>();
    }

    void add(T fruit) {
        fruitsList.add(fruit);
    }

    void moveAt(Box<T> box) {

        box.getFruitsList().addAll(fruitsList);
        fruitsList.clear();
    }

    void info() {
        if (fruitsList.isEmpty()) {
            System.out.println("The box is empty");
        } else {
            System.out.println("Weight of the box is: " + getWeight() + "kg.");
        }
    }

    float getWeight() {
        if (fruitsList.isEmpty()) {
            return 0;
        } else {
            return fruitsList.size() * fruitsList.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }


}