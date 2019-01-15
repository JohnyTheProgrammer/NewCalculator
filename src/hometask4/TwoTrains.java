package hometask4;

public class TwoTrains {
    public static boolean trainCollision(int speed_of_first_train, int speed_of_second_train){
        final int distance = 10;
        boolean Collision = true;
        int maxTrainSpeed = speed_of_first_train + speed_of_second_train;
        int fourty_percent_of_speed = (maxTrainSpeed / 100) * 40;
        int sixty_percent_of_speed = (maxTrainSpeed / 100) * 60;

        if(speed_of_first_train >= fourty_percent_of_speed || speed_of_second_train <= sixty_percent_of_speed){
            Collision = false;
            System.out.println(Collision);
        }
        else{
            Collision = true;
            System.out.println(Collision);
        }
        return Collision;
    }
}
