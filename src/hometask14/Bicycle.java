package hometask14;
//несколько статических полей любого типа;
//        4 не статических поля типа любого типа;
//        определить для полей различный уровень доступа;
//private, public или [default-package];
//        создайте несколько методов для данного класса и примените к методам данного класса различные уровни доступа.
//        Внимание, если вы использует static поля в каком-либо методе класса, то и сам метод должен быть помечен как
// static.
//
//        С помощью оператора new создайте несколько объектов данного класса.
//        Например:


public class Bicycle {
    private static int howMuchProduced;
    public static boolean mechanical;
    private
    int salePercent;
    int wheels;
    String color;
    boolean soldStatus;

    public Bicycle(){
        howMuchProduced++;
    };
}
