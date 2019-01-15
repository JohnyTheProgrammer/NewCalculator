package hometask4;

public class LandsSqrt_Perimeter {
    public static int perimeter(int lenght, int width){
        return (lenght + width) * 2;
    }
    public static int sqrt(int lenght, int width){
        return lenght * width;
    }
    public static void LandsOutput(int lenght, int width){
        System.out.println("Perimeter for your fence: " + perimeter(lenght, width));
        System.out.println("Square for your lawn: " + sqrt(lenght, width));
    }
}
