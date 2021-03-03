package hometask23;
//        2. Реализовать метод выявления  синтаксической корректности некоего выражения анализируя информацию о наличии открывающих
// и закрывающих элементов.
// Реализовать используя структуру данных stack (используйте реализованную структуру из 1-го подпункта этого задания).
//        Типы скобок в проверяемых выражениях могут быть разного типа и представлены в различных комбинациях, и быть неограниченного уровня вложенности:
//        { }
//        [ ]
//        ( )
//
//        Например:
//        “  ({x-у} + [{z * s} - a] + kb) + 12 - (t - v) “

public class Expression {

    public boolean expression(String expressionString) {
        int roundBrackets = 0;
        int squadBrackets = 0;
        int figureBrackets = 0;
        boolean expressionCondition = true;
        System.out.println("Dlinna Stringi" + expressionString.length());

        for (int i = 0; i < expressionString.length(); i++) {
            System.out.print(expressionString.charAt(i));
            if (expressionString.charAt(i) == '(') {
                roundBrackets++;
            }
            if (expressionString.charAt(i) == ')') {
                roundBrackets--;
            }
            if (expressionString.charAt(i) == '[') {
                squadBrackets++;
            }
            if (expressionString.charAt(i) == ']') {
                squadBrackets--;
            }
            if (expressionString.charAt(i) == '{') {
                figureBrackets++;
            }
            if (expressionString.charAt(i) == '}') {
                figureBrackets--;
            }
        }
        if(roundBrackets == 0 && squadBrackets == 0 &&  figureBrackets == 0){
            expressionCondition = true;
            System.out.println("Ваше выражение синтаксически корректно");
        }
        else{
            expressionCondition = false;
            System.out.println("Ваше выражение не корректно");
        }
        return expressionCondition;
    }
}
