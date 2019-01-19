package hometask10;

public class CharColor {
    public static char[] colors(char []change_it) {
     char first, last;
     //String s = new String(change_it);
        char [] almost_changed = new char[change_it.length];
        for (int i = 0; i < change_it.length; i++) {
            almost_changed[i] = change_it[i];
        }
        first = change_it[change_it.length - 1];
        almost_changed[0] = first;

        last = change_it[0];
        almost_changed[almost_changed.length - 1] = last;
     return almost_changed;
    }
}
