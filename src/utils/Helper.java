package utils;


import java.util.Scanner;

public class Helper {
    public static int getRandomNumber(int min, int max) {
        int random_value = (int) Math.round((max-min)*Math.random()) + min;
        return random_value;
    }

    public static char createRandomSign() {
        int randVariantSymbol = Helper.getRandomNumber(1, 4);

        final String LOWER = "abcdefghijklmnopqrstuvwxyz";
        final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String DIGITS = "0123456789";
        final String PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";

        int capacityLOWER = LOWER.length();
        int capacityUPPER = UPPER.length();
        int capacityDIGITS = DIGITS.length();
        int capacityPUNCTUATION = PUNCTUATION.length();

        char randomSign = '1';
        switch (randVariantSymbol) {
            case 1: //abcdefghijklmnopqrstuvwxyz
                randomSign = LOWER.charAt(Helper.getRandomNumber(0, (capacityLOWER - 1)));
                break;
            case 2: //ABCDEFGHIJKLMNOPQRSTUVWXYZ
                randomSign = UPPER.charAt(Helper.getRandomNumber(0, (capacityUPPER - 1)));
                break;
            case 3: //0123456789
                randomSign = DIGITS.charAt(Helper.getRandomNumber(0, (capacityDIGITS - 1)));
                break;
            case 4: //!@#$%&*()_+-=[]|,./?><
                randomSign = PUNCTUATION.charAt(Helper.getRandomNumber(0, (capacityPUNCTUATION - 1)));
                break;
        }
        return randomSign;
    }

    public static String getInputKeyboardString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInputKeyboardInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] reverseBubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length-1; i++){
            for (int j = i+1; j < arrayToSort.length; j++){
                if (arrayToSort[i] < arrayToSort[j]) {
                    int t = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = t;
                }
            }
        }
        return arrayToSort;
    }
    public static int[] funcBubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length-1; i++){
            for (int j = i+1; j < arrayToSort.length; j++){
                if (arrayToSort[i] > arrayToSort[j]) {
                    int t = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = t;
                }
            }
        }
        return arrayToSort;
    }

    public static int[] reverseChoiceSort(int[] arrayToReverseSort) {

        for (int i = 0; i < arrayToReverseSort.length; i++) {
            int maxIndex = Helper.getMaxIndex(arrayToReverseSort, i);
            Helper.swap(arrayToReverseSort, i, maxIndex);
        }
        return arrayToReverseSort;
    }
    public static void choiceSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minIndex = getMinIndex(numbers, i);
            Helper.swap(numbers, i, minIndex);
        }
    }

    public static int getMaxIndex(int [] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
            return maxIndex;
    }
    public static int getMaxIndex(int [] arr, int startIndex) {
        int max = arr[startIndex];
        int maxIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int getMinIndex(int [] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMinIndex(int [] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(min);
        return minIndex;
    }
    public static void swap(int[]arr, int index1, int index2) {
        int old = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = old;
    }
    public static int[] fillRandomArray(int[]arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((max-min)*Math.random()) + min;
        }
        return arr;
    }
}
