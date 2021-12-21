import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satir sayisini giriniz: ");
        int row = input.nextInt();
        System.out.print("Sütun sayisini giriniz: ");
        int col = input.nextInt();

        MineSweeper mine = new MineSweeper(row, col);
        mine.run();

        input.close();
    }

}