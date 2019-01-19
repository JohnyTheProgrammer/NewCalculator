package hometask10;

public class ReverseOutput {
    public static void showMeArrayInAnotherWay(int []some_array) {
        for (int e:some_array) {
           System.out.print(e + ";");
        }
        System.out.println("----------");

        for (int i = 0; i < some_array.length; i++) {
            System.out.print(some_array[(some_array.length - 1) - i] + ";");
        }
    }
}
