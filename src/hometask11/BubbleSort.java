package hometask11;

public class BubbleSort {

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
}
