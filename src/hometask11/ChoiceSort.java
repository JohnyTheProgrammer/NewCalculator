package hometask11;

import utils.Helper;

import java.sql.SQLOutput;

public class ChoiceSort {

    public static void main(String[] args) {
       int[] numbers = new int[100];
       numbers = Helper.fillRandomArray(numbers, 1, 100);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " : " + i); // Не сортированый массив
        }
        System.out.println("Its Bubble Sort!!!");
        BubbleSort.funcBubbleSort( numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " : " + i);   //Пузырьками Отсортированый массив
        }
        Helper.reverseChoiceSort(numbers);
       for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " : " + i);   //Наоборот Выбором Отсортированый массив
        }
        Helper.reverseBubbleSort( numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " : " + i);   //Наоборот Пузырьками Отсортированый массив
        }

    }

//    public static int[] reverseChoiceSort(int[] arrayToReverseSort) {
//
//        for (int i = 0; i < arrayToReverseSort.length; i++) {
//        int maxIndex = Helper.getMaxIndex(arrayToReverseSort, i);
//        Helper.swap(arrayToReverseSort, i, maxIndex);
//        }
//        return arrayToReverseSort;
//        }
}
