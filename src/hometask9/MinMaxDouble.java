package hometask9;

public class MinMaxDouble {
    public static void funcForDouble(){
        double[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        double min = 0, max = 0;
        for (int i = 0; i < aDoubleNums.length; i++) {
            if(aDoubleNums[i] > max){
                max = aDoubleNums[i];
            }
        }
        min = max;
        for (int i = 0; i < aDoubleNums.length; i++) {
            if (aDoubleNums[i] < min) {
                min = aDoubleNums[i];
            }
        }
        System.out.println("Your min value for double:" + min + "Your max value for double" + max);
    }
}
