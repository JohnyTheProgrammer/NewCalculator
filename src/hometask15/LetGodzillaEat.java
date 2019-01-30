package hometask15;

public class LetGodzillaEat {
    public static void main(String[] args) {

        Godzilla bigGodzilla = new Godzilla();
        bigGodzilla.peopleEating(5);
        System.out.println( bigGodzilla.getStomachCapacity());

        bigGodzilla.peopleEating(45);
        System.out.println( bigGodzilla.getStomachCapacity());

        bigGodzilla.peopleEating(41);
        System.out.println( bigGodzilla.getStomachCapacity() + " - Brave Man died");
    }
}
