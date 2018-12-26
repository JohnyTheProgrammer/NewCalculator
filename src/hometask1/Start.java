package hometask1;

public class Start {
    public static void main(String[] args) {
         Calculator.add(5,7);
        Calculator.sub(100,35);
        Calculator.div(200,50);
        Calculator.mul(33,3);
        //перегрузка функций для double
       Calculator.add(2D, 3.3);
       Calculator.sub(100.8, 34.2);
       Calculator.div(6,4);
      Calculator.mul(12.5,125);
        System.out.println(Calculator.add(5,7));
        System.out.println(Calculator.sub(100,35));
        System.out.println(Calculator.div(200,50));
        System.out.println(Calculator.mul(33,3));
        System.out.println(Calculator.add(2D, 3.3));
        System.out.println(Calculator.sub(100.8, 34.2));
        System.out.println(Calculator.div(6,4));
        System.out.println(Calculator.mul(12.5,125));
    }
}
