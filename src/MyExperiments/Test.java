package MyExperiments;

public class Test {
    public static void main(String[] args) {
        String[] catsNames = {
                "Васька",
                "Кузя",
                "Барсик",
                "Мурзик",
                "Леопольд",
                "Бегемот",
                "Рыжик",
                "Матроскин"
        };

        for (int i = 0; i < catsNames.length; i++) {
            for (int j = 0; j < catsNames[i].length(); j++) {
                System.out.println("Это мои выводы " + i +"\t"+ j);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        for (int i = 0; i < catsNames.length; i++) {
            for (int j = 0; j < catsNames[i].length(); j++) {
                System.out.println("Это мои выводы "  +"\t"+ catsNames[i].charAt(j));
            }
        }
    }
}
