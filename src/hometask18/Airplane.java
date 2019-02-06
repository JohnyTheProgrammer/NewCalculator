package hometask18;

public class Airplane extends Transport {
    int passengerClasses;
    int fuel;

    public void getFuelInTurboEngine()
    {
        if(fuel < 100){
            slowDown();
        }
    }
}
