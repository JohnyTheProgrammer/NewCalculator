package hometask7;

public class OddNumbersInDiapazon {
    public static void oddNumbers() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
