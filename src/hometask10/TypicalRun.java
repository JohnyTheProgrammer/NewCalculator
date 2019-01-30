package hometask10;

import utils.Helper;

public class TypicalRun {
 public  static final int ARRAY_SIZE = 25;
    public static void main(String[] args) {
        int[] arr = {5}; // - просто создал массив для сравнения в 6 задании))
       double[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        int[] random_array = new int  [ARRAY_SIZE];
        for (int i = 0; i < random_array.length; i++) {
            random_array[i] = Helper.getRandomNumber(1,100);
        }
       // System.out.println(EvenOddSummary.summaryForEvenOddNumbers(random_array)); // 1

       //char[]  chArr =  {'r', 'o', 'l', 'o', 'c'}; //2
        // System.out.println(CharColor.colors(chArr)); // 2

       // DoubleChangeMinMax.changeMinMaxValues(aDoubleNums);// 3

        //TwoTeamCompare.twoTeams(); //4

       // ReverseOutput.showMeArrayInAnotherWay(random_array); //5

       //System.out.println( CompareTwoArrays.funcToCompareTwoArrays(arr,random_array)); // 6

       CopyMyArrayPlz.copyArray(random_array); // 7
    }
}
