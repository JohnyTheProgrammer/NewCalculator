package hometask24;
import java.util.ArrayList;
import java.io.*;
public class City {
    public static void main(String[] args) {
        String allCitiyes = "Карпаты, Черногория, Ужгород, Девайс, Антон, Пакля, Кусь, Карамбола, Рим, Цербер, Кутюрьма";
        String[] cityNameBuffer = new String[50];
        int x = 0;
        for (String retval : allCitiyes.split(" ")) {
            cityNameBuffer[x] = retval;
            x++;
        }
        for(int i = 0; i < cityNameBuffer.length; i++){
            
        }
        for (int i = 0; i < allCitiyes.length(); i++) {
            if(allCitiyes.charAt(i) == 'К'){
                //for (int j = 0; j < ; j++) {
                //cityNameBuffer[i] = allCitiyes.charAt(i);
                //}
                 }
        }
        for (int i = 0; i < cityNameBuffer.length; i++) {
            System.out.println(cityNameBuffer[i]);
        }
    }
//    Написать метод принимающий список городов, который должен вернуть
//    список из всех городов название которых начинаются на букву “К”.

   public ArrayList<String> getSpecialCities(ArrayList<String> cityList) {

       return cityList;
    }

}
