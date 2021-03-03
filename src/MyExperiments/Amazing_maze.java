package MyExperiments;
import utils.Helper;

public class Amazing_maze {
   static String Maaazeee[] =  {"111111111111111111",
            "1x0010000000000001",
            "111011101111111101",
            "101010000100000001",
            "101011010101111111",
            "101000010100001001",
            "100011110101111101",
            "101110010100000001",
            "100000000101101111",
            "101101111100100001",
            "101001000000101001",
            "101101111111101001",
            "101000000000001001",
            "101011110100101001",
            "101000010111111001",
            "111011110100000001",
            "101000000101111111",
            "101011110101010101",
            "1000000101000000#1",
            "111111111111111111"};
    public static void main(String[] args) {
        int CurrentPositionX = 1;
        int CurrentPositionY = 1;
        while(true){
            Amazing_maze.pathFinder(CurrentPositionX, CurrentPositionY);
        }

        //        for (int i = 0; i < Maaazeee.length; i++) {
//            for (int j = 0; j < Maaazeee[i].length(); j++) {
//                System.out.println("Это мои выводы " + i + "\t" + j);
//            }
//        }
//        System.out.println("--------------------------------------------------------------------------------------------");
//        for (int i = 0; i < Maaazeee.length; i++) {
//            for (int j = 0; j < Maaazeee[i].length(); j++) {
//                System.out.print("\t" + Maaazeee[i].charAt(j));
//            }
//            System.out.println("Это мои выводы ");
//        }
    }
public static void pathFinder(int CurrentPositionX,int  CurrentPositionY){
        int randVariantSymbol = Helper.getRandomNumber(1, 4);
        switch (randVariantSymbol) {
            case 1:
                while (true) {
                    if (Maaazeee[CurrentPositionX + 1].charAt(CurrentPositionY) == '0') {
                        CurrentPositionX +=1;
                    }
                    System.out.print(CurrentPositionX + CurrentPositionY);
                    if (Maaazeee[CurrentPositionX].charAt(CurrentPositionY) == '#') {
                        System.out.println("НУ НАКОНЕЦТО!!!!" + CurrentPositionX + CurrentPositionY + " = " + Maaazeee[CurrentPositionX].charAt(CurrentPositionY));
                        break;
                    }
                }
            case 2:
                while (true) {
                    if (Maaazeee[CurrentPositionX - 1].charAt(CurrentPositionY) == '0') {
                        CurrentPositionX -= 1;
                    }
                    System.out.print(CurrentPositionX + CurrentPositionY);
                    if (Maaazeee[CurrentPositionX].charAt(CurrentPositionY) == '#') {
                        System.out.println("НУ НАКОНЕЦТО!!!!" + CurrentPositionX + CurrentPositionY + " = " + Maaazeee[CurrentPositionX].charAt(CurrentPositionY));
                        break;
                    }
                    break;
                }
            case 3:
                while (true) {
                    if(Maaazeee[CurrentPositionX].charAt(CurrentPositionY + 1) == '0') {
                        CurrentPositionY +=1;
                    }
                    System.out.print(CurrentPositionX + CurrentPositionY);
                    if (Maaazeee[CurrentPositionX].charAt(CurrentPositionY) == '#') {
                        System.out.println("НУ НАКОНЕЦТО!!!!" + CurrentPositionX + CurrentPositionY + " = " + Maaazeee[CurrentPositionX].charAt(CurrentPositionY));
                        break;
                    }
                }
                break;
            case 4:
                while (true) {

                    if (Maaazeee[CurrentPositionX].charAt(CurrentPositionY - 1) == '0') {
                        CurrentPositionY -=1;
                    }
                    System.out.print(CurrentPositionX + CurrentPositionY);
                    if (Maaazeee[CurrentPositionX].charAt(CurrentPositionY) == '#') {
                        System.out.println("НУ НАКОНЕЦТО!!!!" + CurrentPositionX + CurrentPositionY + " = " + Maaazeee[CurrentPositionX].charAt(CurrentPositionY));
                        break;
                    }
                    break;
            }
        }
    }
}