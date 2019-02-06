package hometask14;

public class RunMyBicycle {
    public static void main(String[] args) {

            Bicycle BMX = new Bicycle();
            Bicycle PRIDE = new Bicycle();
            Bicycle Comanche = new Bicycle();
            Comanche.salePercentHigher();
        System.out.println(Comanche.salePercent);
        Comanche.salePercentHigher();
        System.out.println(Comanche.salePercent);
        Comanche.salePercentLower();
        System.out.println(Comanche.salePercent);
        System.out.println(Bicycle.getHowMuchProduced());
    }
}
