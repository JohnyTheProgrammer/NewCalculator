package hometask12;

public class Odessa {

public static void main(String[] args) {
    String inStr = new String("Одесса мой город родной");

    for (int i = 0; i < inStr.length(); i++) {
        char c = inStr.charAt(i);
        if(inStr.charAt(i) == 'о' || inStr.charAt(i) == 'О')
        System.out.println("This is Your index!!!: " + i);
    }
}
}
