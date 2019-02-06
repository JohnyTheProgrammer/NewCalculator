package hometask18;

public class Train extends Transport {
    int wagons;
    String wagonsType;
    int coal;

    public void getCoalInSteamlocomotiveBoiler()
    {
        if(coal < 0){
            speedUp();
        }
    }
}
