package hometask13;

import utils.Helper;

//Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
//        Пароль состоит из 8 символов
//        В пароле допускаются только латинские большие и маленькие буквы, цифры, а также спецсимволы
//        из ограниченного набора таких символов:
//        ! @ # $ % _
//        Пароль обязательно должен содержать:
//        большие и маленькие символы, цифры и спецсимволы.
//        Символы в пароле не должны повторяться. Но, в верхнем ‘Z’ и ‘z’ в нижнем регистре - это разные
//        символы, т.е не считаются дубликатами.
//        В пароле должны быть соблюдены следующие квоты разных типов символов:
//        только 1 спецсимвол;
//        только 3 цифры;
//        только 2 символа в нижнем регистре;
//        только 2 символа в верхнем регистре.
//
//        Пример:
//        “!sd5D4F1” - корректный пароль
//        “dXsV#24k” - некорректный пароль, т.к количество символов в нижнем регистре и цифр не
//        соответствует требуемому количеству.
public class PasswordTryingSoHard {
   public static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
   public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   public static final String DIGITS = "0123456789";
   public static final String PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";
   public static final int ARRAY_SIZE = 500;
   public static final int PASSWORD_LENGHT = 8;


   public static void main(String[] args) {
       char[][] password = new char[ARRAY_SIZE][PASSWORD_LENGHT];

       String passForLastCompare = new String();
       passForLastCompare = pseudoPassGenerator();
       for (int z = 0; z < 1000; z++) {
           int LOWER_Counter = 0, UPPER_Counter = 0, DIGITS_Counter = 0, PUNCTUATION_Counter = 0;
           passForLastCompare = pseudoPassGenerator();

           for (int i = 0; i < passForLastCompare.length(); i++) {
               for (int j = 0; j < LOWER.length(); j++) {
                   if (LOWER.charAt(j) == passForLastCompare.charAt(i)) {
                       LOWER_Counter++;
                   }
               }
           }
           for (int i = 0; i < passForLastCompare.length(); i++) {
               for (int j = 0; j < UPPER.length(); j++) {
                   if (UPPER.charAt(j) == passForLastCompare.charAt(i)) {
                       UPPER_Counter++;
                   }
               }
           }
           for (int i = 0; i < passForLastCompare.length(); i++) {
               for (int j = 0; j < DIGITS.length(); j++) {
                   if (DIGITS.charAt(j) == passForLastCompare.charAt(i)) {
                       DIGITS_Counter++;
                   }
               }
           }
           for (int i = 0; i < passForLastCompare.length(); i++) {
               for (int j = 0; j < PUNCTUATION.length(); j++) {
                   if (PUNCTUATION.charAt(j) == passForLastCompare.charAt(i)) {
                       PUNCTUATION_Counter++;
                   }
               }
           }
           if ((LOWER_Counter == 2) && (UPPER_Counter == 2) && (DIGITS_Counter == 3) && (PUNCTUATION_Counter == 1)) {
               System.out.println(passForLastCompare);
           }
       }
   }
    public static String pseudoPassGenerator(){
        char [] s = new char[8];
        String testingString = "a";
        String returnString = "b";
        for (int i = 0; i < PASSWORD_LENGHT; i++) {
                s[i] = createRandomSign();
            }
        testingString = new String(s);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(i != j){
                if(testingString.charAt(i) == testingString.charAt(j)) {
                   break;
                }
                else{
                    returnString = testingString;
                }
                }
            }
        }
            return returnString;
    }

    public static char createRandomSign(){

        char randomSign = '1';
        int randVariantSymbol = Helper.getRandomNumber(1,4);
        switch(randVariantSymbol)
        {
            case 1: //abcdefghijklmnopqrstuvwxyz
                randomSign = LOWER.charAt(Helper.getRandomNumber(0,(LOWER.length() - 1)));
                break;
            case 2: //ABCDEFGHIJKLMNOPQRSTUVWXYZ
                randomSign = UPPER.charAt(Helper.getRandomNumber(0,(UPPER.length()-1)));
                break;
            case 3: //0123456789
                randomSign = DIGITS.charAt(Helper.getRandomNumber(0,(DIGITS.length()-1)));
                break;
            case 4: //!@#$%&*()_+-=[]|,./?><
                randomSign = PUNCTUATION.charAt(Helper.getRandomNumber(0,(PUNCTUATION.length()-1)));
                break;
        }
        return randomSign;

    }

}
