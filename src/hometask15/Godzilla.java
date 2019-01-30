package hometask15;
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
