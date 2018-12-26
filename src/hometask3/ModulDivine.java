package hometask3;

public class ModulDivine {
    public static void main(String[] args) {
        divineFunction(12);
    }

    public static boolean divineFunction(int x){
        boolean indentifier;
        if(x%2 == 1){
            indentifier = false;
            System.out.println("Yor number is odd");
        }
        else{
            indentifier = true;
            System.out.println("Yor number is even");
        }

        return indentifier;
    }
}

