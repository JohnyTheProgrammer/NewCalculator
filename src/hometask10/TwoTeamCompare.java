package hometask10;

import utils.Helper;

public class TwoTeamCompare {
    public static final int TEAM_SIZE = 25;
    public static void twoTeams() {
        int [] team1_Liquid = new int [TEAM_SIZE];
        int [] team2_Secret = new int [TEAM_SIZE];
        int middle_age_team1_Liquid = 0, age_summary_team1_Liquid = 0;
        int middle_age_team2_Secret = 0, age_summary_team2_Secret = 0;

        for (int i = 0; i < team1_Liquid.length; i++) {
            team1_Liquid[i] = Helper.getRandomNumber(20,80);
        }
        for (int i = 0; i < team2_Secret.length; i++) {
            team2_Secret[i] = Helper.getRandomNumber(20,80);
        }

        for (int i = 0; i < team1_Liquid.length; i++) {
            age_summary_team1_Liquid += team1_Liquid[i] ;
        }
        middle_age_team1_Liquid = age_summary_team1_Liquid / team1_Liquid.length;

        for (int i = 0; i < team2_Secret.length; i++) {
            age_summary_team2_Secret  += team2_Secret[i];
        }
        middle_age_team2_Secret = age_summary_team2_Secret / team2_Secret.length;
        System.out.println("Middle Age of Team Liquid: " + middle_age_team1_Liquid);
        System.out.println("Middle Age of Team Secret: " + middle_age_team2_Secret);
        if(middle_age_team1_Liquid == middle_age_team2_Secret) {
            System.out.println("Да ладно!!! У этих команд одинаковый средний возраст!!!)");
        }
        else if(middle_age_team1_Liquid > middle_age_team2_Secret){
            System.out.println("Team Liquid пожеще будут)");
        }
        else{
            System.out.println("Team Secret те еще старперы!)");
        }
    }
}
