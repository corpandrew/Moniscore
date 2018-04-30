import com.mashape.unirest.http.Unirest;
import http.requests.Options;
import requests.Requests;

import java.io.IOException;

public class Main {


    public static void main(String... args) {

        Unirest.setDefaultHeader("content-type", "application/json");
        Options.addDefaultParam("APIkey", "INSERT API KEY"); //TODO PUT APIKEY HERE
//        System.out.println(Requests.getCountries());
//        System.out.println(Requests.getCompetitions(169));
//        System.out.println(Requests.getCompetitions(173));
//        System.out.println(Requests.getStandings(63));
//        Requests.getFixtures(169, 63, 0, "2018-04-27", "2018-04-29").forEach(e -> {
//            System.out.println("Away: " + e.getMatchAwayteamName() + ", Home: " + e.getMatchHometeamName());
//            System.out.println("Date: " + e.getMatchDate() + " Time: " + e.getMatchTime());
//        });
//        System.out.println(Requests.getOdds(0,"2018-04-27", "2018-04-29"));
//        System.out.println(Requests.getHeadToHead("Arsenal", "Chelsea").getFirstTeamLastResults().get(0).getMatchAwayteamName());
//
//        Calendar twoDaysAgo = Calendar.getInstance();
//        twoDaysAgo.add(Calendar.DAY_OF_MONTH, -2);
//        Requests.getFixtures(169, 63, 0, twoDaysAgo, Calendar.getInstance()).forEach(e -> {
//            System.out.println(e.getMatchAwayteamName() + ", " + e.getGoalscorer());
//        });

        System.out.println(Requests.getLiveFixtures(Requests.League.LIGUE2));

        shutdown();
    }

    private static void shutdown() {
        try {
            Unirest.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
