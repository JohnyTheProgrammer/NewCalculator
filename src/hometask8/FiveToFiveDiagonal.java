package hometask8;

public class FiveToFiveDiagonal {
    public static void drowDiagonalCube() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == j){
                    System.out.print("x");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
