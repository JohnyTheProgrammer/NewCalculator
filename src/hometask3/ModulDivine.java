package hometask3;

public class ModulDivine {
    public static void main(String[] args) {
        divineFunc(12);
        System.out.println("git changes");
    }

    public static boolean divineFunc(int x){
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

