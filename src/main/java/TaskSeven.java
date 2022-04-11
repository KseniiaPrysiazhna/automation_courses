public class TaskSeven {
    public static void checkNumberDivide () {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
           int x = arr [i];
            if ( x < 6) {
                System.out.println(x *= 2);
            } else {
                System.out.println("not");
            }
        }
    }
}

