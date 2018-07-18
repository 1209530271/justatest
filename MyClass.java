package LearningJ;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        /*
        data type:
        byte, number, 1 byte
        short, number, 2 bytes
        int, number, 4 bytes
        long, number, 8 bytes
        flosat, float number, 4 bytes
        double, float number, 8 bytes
        char, a character, 2 bytes
        boolean, t or f, 1 byte
        */

        /* variable
        int x = 10;

        System.out.println(x);
        */

        //import Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter something here:");

        String user_input = scan.nextLine();

        System.out.println("What you typed here is");
        System.out.print(user_input);

    }
}
