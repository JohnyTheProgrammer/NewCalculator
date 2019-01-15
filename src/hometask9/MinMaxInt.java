package hometask9;

public class MinMaxInt {
    public static void funcForInt() {
        int[] aIntNums = {-10, 20, 34, -11, 100, 20};
        int min = 0, max = 0;
        for (int i = 0; i < aIntNums.length; i++) {
            if (aIntNums[i] > max) {
                max = aIntNums[i];
            }
        }
        min = max;
        for (int i = 0; i < aIntNums.length; i++) {
            if (aIntNums[i] < min) {
                min = aIntNums[i];
            }
        }
            System.out.println("Your min value for int:" + min + "Your max value for int" + max);
    }
}
