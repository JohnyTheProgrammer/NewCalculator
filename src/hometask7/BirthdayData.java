package hometask7;

public class BirthdayData {
    public static int birthData(int birth_year) {
        final int current_year = 2019;
        //int age = current_year - birth_year;
        int age = 0;
        int counter = 0;
        for(int i = birth_year; i < 2019; i++){
            age = counter;
            counter++;
        }
        System.out.println("Your age is: " + age);
        return age;
    }
}
