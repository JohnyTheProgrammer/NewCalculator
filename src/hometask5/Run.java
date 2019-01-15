package hometask5;
import java.util.Scanner;
public class Run {
    public static void main(String[] args) {
        System.out.println(BitDiv.bitDivByFour(inputIntKeyword()));
        //IfSeason.ifElseSeasons(inputIntKeyword());
        //SwitchSeason.swSeasons(inputIntKeyword());
    }
    public static int inputIntKeyword() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }
}
