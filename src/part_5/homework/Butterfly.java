package part_5.homework;

public class Butterfly {
    public static void main(String[] args) {
        int halfSize = 18 / 2;


        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 18 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 18; i++) {
            System.out.print("*");
        }
        System.out.println();


        for (int i = halfSize - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 18 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
