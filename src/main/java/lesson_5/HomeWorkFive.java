package lesson_5;

import java.util.Arrays;

public class HomeWorkFive {
    public static void main(String[] args) {
        String[] arr1 = {"Cat", "Dog", "Hamster", "Mouse"};
        System.out.println(Arrays.toString(arr1));
        swapElements(arr1, 2, 3, 1, 0);
        System.out.println(Arrays.toString(arr1) + "\n");

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        for (int i = 0; i < 3; i++) {
            orangeBox1.add(new Orange());
        }

        for (int i = 0; i < 9; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 7; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        System.out.println("Compare OrangeBox1 and AppleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Compare OrangeBox2 and AppleBox " + orangeBox2.compare(appleBox) + "\n");

        System.out.println("Moving oranges from OrangeBox1 to OrangeBox2...");
        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

    }

    private static <K> void swapElements(K[] array, int a, int b, int c, int d) {
        K temp = array[a];
        array[a] = array[b];
        array[b] = array[c];
        array[c] = array[d];
        array[d] = temp;
    }
}
