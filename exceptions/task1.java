import java.util.InputMismatchException;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1, number2;

        try {

            number1 = in.nextInt();
             number2 = in.nextInt();
             int sum = number1 + number2;
            System.out.println(sum);
        } catch (InputMismatchException e) {
              System.out.println(e);
        }
    }
}
