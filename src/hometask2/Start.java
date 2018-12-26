package hometask2;

public class Start {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 4;
        SomeCalculations.methodCalc1(a, b, c);
        SomeCalculations.methodCalc2(a, b);
        SomeCalculations.methodCalc3(a, b, c);
        SomeCalculations.methodCalc4(a, b, c);
        System.out.println(SomeCalculations.methodCalc1(a, b, c));
        System.out.println(SomeCalculations.methodCalc2(a, b));
        System.out.println(SomeCalculations.methodCalc3(a, b, c));
        System.out.println(SomeCalculations.methodCalc4(a, b, c));

    }
}

