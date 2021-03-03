package Igor.third;

public class ClassFile {
    public String name;
    public int speed;
    public String color;
    public int wheels = 4;

    public ClassFile(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }
    public void speedUp(){
        speed++;
    }
    public void slowDown(){
        speed--;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getWheels() { return wheels; }
    public void setWheels(int wheels) { this.wheels = wheels; }

}
