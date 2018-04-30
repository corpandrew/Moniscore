package requests;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import http.requests.AsyncHttpRequest;
import responses.*;
import utils.JsonUtils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


public class Requests {

    private static AsyncHttpRequest asyncHttpRequest = new AsyncHttpRequest();

    private static Future<HttpResponse<JsonNode>> getActionFuture(ParamMap parameters) {
        return asyncHttpRequest.getJsonFuture("https://apifootball.com/api/", parameters);
    }

    private static String getResponse(ParamMap paramMap) {
        Future<HttpResponse<JsonNode>> request = getActionFuture(paramMap);

        String response = "";

        try {
            HttpResponse<JsonNode> httpResponse = request.get();

            System.out.println(httpResponse.getHeaders());

            if (httpResponse.getStatus() == 200) {
                return httpResponse.getBody().toString();
            } else {
                return httpResponse.getStatusText();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        return response;
    }

    public static List<Country> getCountries() {
        ParamMap parameters = new ParamMap()
                .add("action", "get_countries");
        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Country[].class));
    }

    public static List<Competition> getCompetitions(int countryId) {
        ParamMap parameters = new ParamMap()
                .add("action", "get_leagues")
                .add("country_id", Integer.toString(countryId));
        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Competition[].class));
    }

    public static List<Standing> getStandings(int leagueId) {
        ParamMap parameters = new ParamMap()
                .add("action", "get_standings")
                .add("league_id", Integer.toString(leagueId));
        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Standing[].class));
    }

    public static List<Fixture> getFixtures(int countryId, int leagueId, int matchId, String from, String to) {
        ParamMap parameters = new ParamMap().add("action", "get_events")
                .add("country_id", Integer.toString(countryId))
                .add("league_id", Integer.toString(leagueId))
                .add("match_id", Integer.toString(matchId))
                .add("from", from)
                .add("to", to);

        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Fixture[].class));
    }

    public static List<Fixture> getLiveFixtures(int countryId, int leagueId, int matchId) {
        ParamMap parameters = new ParamMap().add("action", "get_events")
                .add("country_id", Integer.toString(countryId))
                .add("league_id", Integer.toString(leagueId))
                .add("match_id", Integer.toString(matchId))
                .add("from", calendarToString(Calendar.getInstance()))
                .add("to", calendarToString(Calendar.getInstance()))
                .add("match_live", "1");

        String response = getResponse(parameters);

        System.out.println(response);

        return Arrays.asList(JsonUtils.parse(response, Fixture[].class));
    }

    private static String calendarToString(Calendar instant) {
        return instant.get(Calendar.YEAR) + "-" + (instant.get(Calendar.MONTH) + 1) + "-" + instant.get(Calendar.DAY_OF_MONTH);
    }

    public static List<Fixture> getFixtures(int countryId, int leagueId, int matchId, Calendar from, Calendar to) {
        String fromString = calendarToString(from);
        String toString = calendarToString(to);

        ParamMap parameters = new ParamMap().add("action", "get_events")
                .add("country_id", Integer.toString(countryId))
                .add("league_id", Integer.toString(leagueId))
                .add("match_id", Integer.toString(matchId))
                .add("from", fromString)
                .add("to", toString);

        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Fixture[].class));
    }

    /**
     * If not a paid plan, this will fail.
     *
     * @param matchId
     * @param from
     * @param to
     * @return
     */
    public static List<Odd> getOdds(int matchId, String from, String to) {
        ParamMap parameters = new ParamMap().add("action", "get_odds")
                .add("match_id", Integer.toString(matchId))
                .add("from", from)
                .add("to", to);

        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Odd[].class));
    }

    public static HeadToHead getHeadToHead(String firstTeamName, String secondTeamName) {
        ParamMap parameters = new ParamMap().add("action", "get_H2H")
                .add("firstTeam", firstTeamName)
                .add("secondTeam", secondTeamName);

        String response = getResponse(parameters);

        return JsonUtils.parse(response, HeadToHead.class);
    }

    public static List<Fixture> getLiveFixtures(int leagueId) {
        return getLiveFixtures(0, leagueId, 0);
    }

    public static List<Fixture> getLiveFixtures(League league) {
        return getLiveFixtures(0, league.leagueId, 0);
    }

    public enum League {
        LIGUE2(128), CHAMPIONSHIP(63);

        private int leagueId;

        League(int leagueId) {
            this.leagueId = leagueId;
        }
    }

    private enum Country {
        ENGLAND(169), FRANCE(173);

        private int countryId;

        Country(int countryId) {
            this.countryId = countryId;
        }

    }
}
