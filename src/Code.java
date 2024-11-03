import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int side = 0;

            // Prompt user to enter side length between 1 and 20
            while (side < 1 || side > 20) {
                System.out.print("Please enter the side length of the square (between 1 and 20): ");
                side = scanner.nextInt();
              //  scanner.

                if (side < 1 || side > 20) {
                    System.out.println("Invalid input. The side length must be between 1 and 20.");
                }
            }

            // Calculate the area of the square
            int area = side * side;
            System.out.println("The area of the square is: " + area);
        }
    }
// Scanner.



//        int total = 0;
//        int gradeCounter = 1; //0 1 2
//        while (gradeCounter <= 10) {
//            System.out.println("Enter next grade: ");
//            int grade = scanner.nextInt();
//            total = total + grade;
//            gradeCounter++;
//        }
//
//        map = 5;
//        int average = total / 10;
//        System.out.println("the total is: " + total);
//        System.out.println("Average grade: " +average);
//        run();



