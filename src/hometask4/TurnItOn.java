package hometask4;
import java.util.Scanner;


public class TurnItOn {
    public static void main(String[] args) {
        //System.out.println(ConvertToDollar.HryvnasConverter(inputIntKeyword())); // конвертор гривны
       // System.out.println("Your result is: " + NumbersSummary.numbersSumm( inputIntKeyword())); // сумма трехзначного числа
        //LandsSqrt_Perimeter.LandsOutput(inputIntKeyword(),inputIntKeyword());
        TwoTrains.trainCollision(inputIntKeyword(),inputIntKeyword());
       /* int variable = 16;
        variable = variable;
        System.out.println(variable);*/
    }
    public static int inputIntKeyword() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }

    public static double inputDoubleKeyword() {
        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
        return inputNumber;
    }
}