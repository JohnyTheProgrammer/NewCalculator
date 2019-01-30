package hometask15;
//Создать класс Godzilla. У данного класса должно быть свойство - объем желудка.
//        Написать для данного класса метод поедания людей.
//        В данный метод должен передаваться объем съеденного и соответственно уменьшаться место в желудке.
//        Когда Годзила заполнит желудок на 90%, то метод должен выводить надпись,
//        что Годзила наелся и больше не может поедать людей.

public class Godzilla {
   private static int stomachCapacity;

   public static void peopleEating(int tenPeople){
       stomachCapacity += tenPeople;
       if(stomachCapacity >= 90)
       {
           System.out.println( "Годзила наелся и больше не может поедать людей! Хватит его кормить!)");
       }
   }


    public static void setStomachCapacity(int stomachCapacity) {
        Godzilla.stomachCapacity = stomachCapacity;
    }

    public static int getStomachCapacity() {
        return stomachCapacity;
    }
}
