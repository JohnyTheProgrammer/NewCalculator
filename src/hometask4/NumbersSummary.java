package hometask4;

public class NumbersSummary {
    public static int numbersSumm(int main_number){
        int result,first_number,second_number, third_number, tenth;
        tenth = main_number % 100;
        first_number  = (main_number - tenth) / 100;
        third_number = tenth % 10;
        second_number = (tenth - third_number) / 10;

        result = first_number + second_number + third_number;
        return result;
    }
}
