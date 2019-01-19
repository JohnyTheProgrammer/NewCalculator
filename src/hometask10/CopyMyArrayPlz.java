package hometask10;

public class CopyMyArrayPlz {
    public static int []copyArray(int [] src)  {
        int [] yourNewArray = new int[src.length];
        System.out.println("Old array");
        for (int i = 0; i < src.length; i++) {
            System.out.print(src[i] + "; ");
        }
        yourNewArray = src;
        System.out.println("New array");
        showNewArray(yourNewArray);
        return yourNewArray;
    }

    public static void showNewArray(int []yourNewArray) {
        for (int i = 0; i < yourNewArray.length; i++) {
            System.out.print(yourNewArray[i] + "; ");
        }
    }
}
