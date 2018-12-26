package hometask2;

public class SomeCalculations {
  public static int methodCalc1(int a, int b, int c){
        return a + b * ( c / 2 );
  }
    public static int methodCalc2(int a, int b){
        return ( a + b ) % 2;
    }
    public static int methodCalc3(int a, int b, int c){
        return ( a + b ) / 12 * c % 4 + b;
    }
    public static int methodCalc4(int a, int b, int c){
        return (a - b * c ) / ( a + b ) % c;
    }
}
