import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

//        // loop 20 times
//         for (int i = 1; i <= 20; i++) {
//             // secure random number
//             int randomValue = 1 + random.nextInt(6);
//             //print
//             System.out.printf("%d ", randomValue);
//
//             // line order of 5 00000
//             //                 00000
//             if (i % 5 == 0) {
//                 System.out.println();
//             }
//         }


        for (int i = 1; i <= 36; i++) {
            int randomInt = 1 +  random.nextInt(6);

            System.out.printf("%d ", randomInt);

            if (i % 6 == 0){
                System.out.println();
            }

        }

    }

}
