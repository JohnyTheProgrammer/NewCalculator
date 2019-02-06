package hometask19;

import utils.Helper;

public class LetsSingTogether {
    public static void main(String[] args) {
        Pet myLovelyPets[] = new Pet[10];

        for (int i = 0; i < myLovelyPets.length; i++) {
                int numberForSwitch = Helper.getRandomNumber(1, 3);
            switch (numberForSwitch) {
                case 1:
                    myLovelyPets[i] = new Cat();
                    break;
                case 2:
                    myLovelyPets[i] = new Dog();
                    break;
                case 3:
                    myLovelyPets[i] = new Parrot();
                    break;
            }
        }

        for (int i = 0; i < myLovelyPets.length; i++) {
            myLovelyPets[i].say();
        }
    }
}
