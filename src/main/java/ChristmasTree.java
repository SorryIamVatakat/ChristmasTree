public class ChristmasTree {

    private static final int MIDDLE = 10;




    public static void main(String[] args){
        int a = 0;
        while(a < MIDDLE){
            int i = 0;
            while(i < MIDDLE - a) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while(j < a*2 + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            a++;
        }



    }
}
