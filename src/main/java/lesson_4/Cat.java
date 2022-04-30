package lesson_4;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, 200, 0, 15);
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " tries to swim, but cats can't swim. Meow!");
    }
}

