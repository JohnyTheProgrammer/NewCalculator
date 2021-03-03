package Igor.third;

public class Automobile {
    public static void main(String[] args) {
        ClassFile[] automobiles = new ClassFile[10];
        automobiles[0] = new ClassFile("BMW", 180, "red");
        automobiles[1] = new ClassFile("Audi", 200, "black");
        automobiles[2] = new ClassFile("Lexus", 260, "yellow");
        automobiles[3] = new ClassFile("BMW", 100, "red");
        automobiles[4] = new ClassFile("ferrari", 380, "orange");
        automobiles[5] = new ClassFile("Wolkswagen", 270, "blue");
        automobiles[6] = new ClassFile("Mersedes", 240, "blue");
        automobiles[7] = new ClassFile("Lada", 120, "black");
        automobiles[8] = new ClassFile("Mustang", 280, "green");
        automobiles[9] = new ClassFile("Mazda", 230, "purple");

        for(int  i = 0; i < automobiles.length ; i++) {
            System.out.print(automobiles[i].getName() + "\t");
            System.out.print("speed:  " + automobiles[i].getSpeed() + "\t");
            System.out.print("color: " + automobiles[i].getColor() + "\t");
            System.out.println("wheels: " + automobiles[i].getWheels());
        }
    }
}