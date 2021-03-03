package Igor.second;
import java.util.Scanner;

public class SwingCountSymbol {
    public static void main(String[] args) {
        VisualMenu app = new VisualMenu();
        app.setVisible(true);
        System.out.println("Hello Johny please enter your string: ");
        String strrrrr = getInputKeyboardString();
        System.out.println("Hello Johny please enter your symbol: ");
        String input_symbol = getInputKeyboardString();
        int counter = 0;
        for (int i = 0; i < strrrrr.length(); i++) {
            if (strrrrr.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("your counter: " + counter);
    }
    public static int symbol_counter( String ddd){
        int counter = 0;
        for (int i = 0; i < ddd.length(); i++) {
            if (ddd.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("your counter: " + counter);
        return counter;

        }

        public static String getInputKeyboardString() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }
}
