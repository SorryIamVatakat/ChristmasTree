public class ChristmasTree {

    private static final int MIDDLE = 10;


    public static void main(String[] args) {
        int a = 0;
        while (a < MIDDLE) {
            int i = 0;
            while (i < MIDDLE - a) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j < a * 2 + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            a++;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            for (int j2 = 0; j2 < 6; j2++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}