package Igor.first;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.print("Please enter your size: ");
        int x = InputFromKeyboardInt();
        System.out.println("Равносторонний треугольник");
        for (int i = 1; i <= x; ++i){

            for (int j = x; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
    }


    public static int InputFromKeyboardInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}