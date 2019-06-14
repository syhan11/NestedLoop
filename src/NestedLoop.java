import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {
        int maxVal = 10;
        String msg = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        maxVal = keyboard.nextInt();

        for (int row = 1; row <= maxVal; row++) {
            for (int col = 1; col <= row; col++) {
                msg = msg + row + ' ';
            }
            System.out.println(msg);
            msg = "";
        }
    }
}
