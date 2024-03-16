package part_6.homework;

public class MultiplicationTable {
    public static void main(String[] args) {  int size = 10;
        int[][] multiplicationTable = new int[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]); // Форматированный вывод с выравниванием
            }
            System.out.println();

    }
    }
}
