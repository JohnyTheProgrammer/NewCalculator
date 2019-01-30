package hometask10;

public class CopyMyArrayPlz {
    public static int []copyArray(int [] src)  {
        int [] yourArray = new int[src.length];
        System.out.println("Old array");
        for (int i = 0; i < src.length; i++) {
            System.out.print(src[i] + "; ");
        }

        for (int i = 0; i < src.length; i++) {
           yourArray[i] = src[i];
        }

        System.out.println("New array");
        showMeArray(yourArray);
        return yourArray;
    }

    public static void showMeArray(int []yourNewArray) {
        for (int i = 0; i < yourNewArray.length; i++) {
            System.out.print(yourNewArray[i] + "; ");
        }
    }
}
