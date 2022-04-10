public class HomeWorkApp {
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("It is possitive");
        } else {
            System.out.println("It is negative");
        }
    }
}
