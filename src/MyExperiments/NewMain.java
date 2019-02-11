package MyExperiments;

public class NewMain {
    public static void main(String[] args) {


        NullPointerException[] exc = new NullPointerException[10];
        exc[0] = new NullPointerException("vaha", "Petrovich", 45);
        for (int i = 0; i < exc.length; i++) {
            System.out.print(exc[0].getName() + "\t");
            System.out.print(exc[0].getSurname() + "\t");
            System.out.println(exc[0].getAge() + "\t");
            System.out.println();
        }
        System.out.println(exc[5]);
    }
}
