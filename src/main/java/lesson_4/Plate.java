package lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int n) {
        this.food += n;
    }

    public boolean tryDecreaseFood(int n) {
        if (food < n) {
            return false;
        }

        food -= n;
        return true;
    }
}

