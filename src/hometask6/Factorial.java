package hometask6;

public class Factorial {
    public static int intFactory(int number_for_fact ) {

        int counter = 1;
        for (int i = 1; i <= number_for_fact; i++) {
            counter *= i;
        }
        return counter;
    }
}
