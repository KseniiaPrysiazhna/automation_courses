public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        checkColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        String name = "Orange\nBanana\nApple";
        System.out.println(name);
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int x = a + b;
        System.out.println(x);
        if (x >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void checkColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 3636636;
        int b = 188882;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}