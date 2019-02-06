package hometask18;
//В родительском классе должно быть определено минимум 1 конструктор, 3 общих свойства(поля класса) и 1 метод
//        (не геттер и не сеттер).
//        В классах-потомках должны быть добавлены минимум по 1 новому методу и по 1 новому свойству.

public class Transport {
    int pilotAndDriverCounter;
    int personalCounter;
    int speed;


    public void speedUp(){
        speed++;
    }
    public void slowDown(){
        speed--;
    }

    public Transport(){ }

    public Transport(int pilotAndDriverCounter,  int personalCounter, int speed){
        setPilotAndDriverCounter(pilotAndDriverCounter);
        setPersonalCounter( personalCounter);
        setSpeed(speed);
    }

    public void setPilotAndDriverCounter(int pilotAndDriverCounter) {
        this.pilotAndDriverCounter = pilotAndDriverCounter;
    }

    public void setPersonalCounter(int personalCounter) {
        this.personalCounter = personalCounter;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
