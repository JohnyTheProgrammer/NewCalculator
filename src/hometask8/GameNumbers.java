package hometask8;

import utils.Helper;

public class GameNumbers {
   public static boolean condition  = true;
    public static void mainGame() {
       int my_secret_number = Helper.getRandomNumber(1, 10);
        //System.out.println(my_secret_number); Подсказка  - выводит наше загаданное число

        while(condition)
       {
           game(my_secret_number, Helper.getInputKeyboardInt());
       }
    }

    public static boolean game(int my_secret_number, int client_number) {
        if(client_number < my_secret_number){
            System.out.println("Your number is lower");
        }
        if(client_number > my_secret_number){
            System.out.println("Your number is bigger");
        }
        if(client_number == my_secret_number){
            System.out.println("Ну наконец-то блин... ну ты и тугодум!!!)))");
            condition = false;
        }
        return condition;
    }
}
