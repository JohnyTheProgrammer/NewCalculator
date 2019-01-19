package hometask10;

public class DoubleChangeMinMax {
    public static  double[] changeMinMaxValues(double [] array_changing) {
        int min_index = 0, max_index = 0;
        double min_array_number = 0, max_array_number = 0;
        for (int i = 0; i < array_changing.length; i++) {
            if(array_changing[i] > max_array_number){
                max_array_number = array_changing[i];
                max_index = i;
            }
        }
        min_array_number = max_array_number;
        for (int i = 0; i < array_changing.length; i++) {
            if (array_changing[i] < min_array_number) {
                min_array_number = array_changing[i];
                min_index = i;
            }
        }
        array_changing[min_index] = max_array_number;
        array_changing[max_index] = min_array_number;
        for (double e:array_changing) {
            System.out.print(e + " ;");
        }
        return array_changing;
    }
}
