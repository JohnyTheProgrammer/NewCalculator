package hometask10;

public class EvenOddSummary {
    public static int summaryForEvenOddNumbers(int[] array) {
        int epic_divine;
        int even_summary = 0, odd_summary = 0;
        for (int i = 0; i < array.length; i++) {
           if((array[i] % 2) == 0){
               even_summary += array[i];
           }
           if((array[i] % 2) == 1){
               odd_summary += array[i];
           }
        }
       epic_divine = even_summary - odd_summary;
        return epic_divine;
    }
}
