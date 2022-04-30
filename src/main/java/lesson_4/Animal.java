package lesson_4;

public abstract class Animal {
    protected String name;
    protected int appetite;
    protected int runDistance;
    protected int swimDistance;
    protected boolean satiety;

    public Animal(String name, int runDistance, int swimDistance, int appetite) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.appetite = appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance > runDistance){
            System.out.println(name + " tries to run " + distance + "m, but it can't run more than " + runDistance + "m");
            return;
        }

        System.out.println(name + " runs " + distance + "m");
    }

    public void swim(int distance) {
        if(distance > swimDistance){
            System.out.println(name + " tries to run " + distance + "m, but it can't swim more than " + runDistance + "m");
            return;
        }

        System.out.println(name + " swims " + distance + "m");
    }

    public void Eat(Plate plate) {
        this.satiety = plate.tryDecreaseFood(appetite);
    }
}
