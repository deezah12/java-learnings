import java.security.SecureRandom;
import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = (int) scanner.nextDouble();
        int number4 =  scanner.nextInt();

        double y = (double) number4 + number3;
        System.out.println(y);

        SecureRandom random = new SecureRandom();
        // coin 98
        int randomValue = random.nextInt(2);

        //dice 675849
        int randomValue2 = 1 +  random.nextInt(6);


        double result = maximumValue(number1, number2, number4);
        System.out.println("The maximum value is " + result);
    }

    public static double maximumValue(double x, double y, double z) {
        //local variable maxNumber
        double maxNumber = x;

        if (y > maxNumber) {
            maxNumber = y;
        }
        if (z > maxNumber) {
            maxNumber = z;
        }
        return maxNumber;
    }
}
