import lesson_4.*;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Cat("Luna"),
                new Cat("Yoshi"),
                new Cat("Murka"),
                new Cat("Murchik"),
                new Dog("Barsik"),
                new Dog("Bonia"),
                new Dog("Tuzick")
        };

        int animalsCount = animals.length;
        int catsCount = 0;
        int dogsCount = 0;

        for (int i = 0; i < animalsCount; i++) {
            Animal animal = animals[i];
            if (animal.getClass() == Cat.class) {
                catsCount++;
            } else if (animal.getClass() == Dog.class) {
                dogsCount++;
            }
        }

        System.out.println("Animals count: " + animalsCount);
        System.out.println("Dogs count: " + dogsCount);
        System.out.println("Cats count: " + catsCount);

        allAnimalsRun(animals);
        allAnimalsSwim(animals);


        Cat[] cats = new Cat[]{
                new Cat("Luna"),
                new Cat("Yoshi"),
                new Cat("Murka"),
                new Cat("Murchik")
        };

        Plate plate = new Plate(40);

        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i];
            cat.Eat(plate);
            System.out.println(cat.getName() + "is full: " + cat.getSatiety());
        }
        System.out.print("Enter desireable goods iPhone or Android: ");
        Scanner scan = new Scanner(System.in);
        String goodsName = scan.nextLine();
        System.out.println("I want to buy: " + goodsName);
        Payment billCheck = new Payment();
        billCheck.buy();
    }

    private static void allAnimalsRun(Animal[] animals){
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            int randomDistance = getRandomDistance(100, 600);
            animal.run(randomDistance);
        }
    }

    private static void allAnimalsSwim(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            var animal = animals[i];
            var randomDistance = getRandomDistance(100, 600);
            animal.swim(randomDistance);
        }
    }

    private static int getRandomDistance(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
