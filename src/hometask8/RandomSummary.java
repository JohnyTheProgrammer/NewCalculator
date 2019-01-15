package hometask8;

import utils.Helper;

public class RandomSummary {
    public static int summOfHundredRandomValues(){
       int sum = 0;
        final int arrsize = 100;
        int[] xarr = new int[arrsize];
        for (int i = 0; i < xarr.length; i++) {
            xarr[i] = Helper.getRandomNumber(-10, 10);
        }
        for (int i = 0; i < xarr.length ; i++) {
            sum += xarr[i];
        }
        return sum;
    }
}
