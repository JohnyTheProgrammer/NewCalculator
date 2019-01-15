package utils;


import java.util.Scanner;

public class Helper {
    public static int getRandomNumber(int min, int max) {
        int random_value = (int) ((max-min)*Math.random()) + min;
        return random_value;
    }

    public static int getInputKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
