package hometask8;

public class EagleOrNotEagle {
    public static void eagle() {
        int heads = 0 , tails = 0;
        final int array_size = 2000;
        int[] eagle_array = new int[array_size];
        for (int i = 0; i < eagle_array.length; i++) {
            eagle_array[i] = (int)(Math.random() * 2);
        }
        for (int i = 0; i < eagle_array.length; i++) {
            if(eagle_array[i] == 1){
                heads++;
            }
            if(eagle_array[i] == 0){
                tails++;
            }
        }
        System.out.println("So much heads: " + heads + " And so much tails: " + tails);
    }
}
