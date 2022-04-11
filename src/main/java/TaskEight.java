public class TaskEight {
    public static void massiveCreation() {
        int counter = 1;
        int[][] table = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                table [i][j] = counter;
                if (i > j){
                System.out.print(table[i][j]+ " ");
                } else if (j > i) {
                    System.out.print(table[i][j]+ " ");
                } else {
                    System.out.print("1 ");
                    counter++;
                }
            }
            System.out.println(" ");
        }
    }
}
