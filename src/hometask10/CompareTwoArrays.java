package hometask10;

public class CompareTwoArrays {
    public static boolean funcToCompareTwoArrays(int []first_array,int []second_array) {
        boolean compare_arrays = true;
        if(first_array.length == second_array.length) {

            for (int i = 0; i < first_array.length; i++) {
                if(first_array[i] != second_array[i]){
                    compare_arrays = false;
                    break;
                }
                else{
                    compare_arrays = true;
                    System.out.println("Your arrays are equal!");
                }
            }

        }
        else {
            System.out.println("size of your arrays is not equal!");
            compare_arrays = false;
        }

        return compare_arrays;

    }
}
