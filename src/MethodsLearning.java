import java.util.Scanner;

public class MethodsLearning {

    // access modifier return type/ data type name;
    private  static int eye;
    private String name;


    public static void main(String[] args) {
        //instance method
        MethodsLearning obj = new MethodsLearning();
        obj.run(2);
        obj.walk("Lagos street");

        //static method or class method
        MethodsLearning.eat();


        double result = Math.pow(2.0, 2.0);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }


    /** difference between argument and parameters
     Parameter is passed when a method is declared. - method declaration
     Argument is passed when a method is called. - method call

     **/
    // access modifier return type name-must be camel case (parameter or no parameter){ code statement }
    // public,private,protected , void or any data type name () {  }

    public void run(int leg) {
        System.out.printf("I have %d legs!", leg);
    }

    public String walk(String stroll) {
        return "i am " + stroll + "around";
    }

    public static void eat() {
        System.out.println("I am eating");
    }

}
