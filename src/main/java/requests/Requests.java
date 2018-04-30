package requests;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import http.requests.AsyncHttpRequest;
import http.requests.ParameterMap;
import responses.*;
import utils.JsonUtils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


public class Requests {

    private static AsyncHttpRequest asyncHttpRequest = new AsyncHttpRequest();

    private static Future<HttpResponse<JsonNode>> getActionFuture(ParameterMap parameters) {
        return asyncHttpRequest.getJsonFuture("https://apifootball.com/api/", parameters);
    }

    private static String getResponse(ParameterMap ParameterMap) {
        Future<HttpResponse<JsonNode>> request = getActionFuture(ParameterMap);

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
        ParameterMap parameters = new ParameterMap()
                .put("action", "get_countries");
        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Country[].class));
    }

    public static List<Competition> getCompetitions(int countryId) {
        ParameterMap parameters = new ParameterMap()
                .put("action", "get_leagues")
                .put("country_id", Integer.toString(countryId));
        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Competition[].class));
    }

    public static List<Standing> getStandings(int leagueId) {
        ParameterMap parameters = new ParameterMap()
                .put("action", "get_standings")
                .put("league_id", Integer.toString(leagueId));
        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Standing[].class));
    }

    public static List<Fixture> getFixtures(int countryId, int leagueId, int matchId, String from, String to) {
        ParameterMap parameters = new ParameterMap().put("action", "get_events")
                .put("country_id", Integer.toString(countryId))
                .put("league_id", Integer.toString(leagueId))
                .put("match_id", Integer.toString(matchId))
                .put("from", from)
                .put("to", to);

        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Fixture[].class));
    }

    public static List<Fixture> getLiveFixtures(int countryId, int leagueId, int matchId) {
        ParameterMap parameters = new ParameterMap().put("action", "get_events")
                .put("country_id", Integer.toString(countryId))
                .put("league_id", Integer.toString(leagueId))
                .put("match_id", Integer.toString(matchId))
                .put("from", calendarToString(Calendar.getInstance()))
                .put("to", calendarToString(Calendar.getInstance()))
                .put("match_live", "1");

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

        ParameterMap parameters = new ParameterMap().put("action", "get_events")
                .put("country_id", Integer.toString(countryId))
                .put("league_id", Integer.toString(leagueId))
                .put("match_id", Integer.toString(matchId))
                .put("from", fromString)
                .put("to", toString);

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
        ParameterMap parameters = new ParameterMap().put("action", "get_odds")
                .put("match_id", Integer.toString(matchId))
                .put("from", from)
                .put("to", to);

        String response = getResponse(parameters);

        return Arrays.asList(JsonUtils.parse(response, Odd[].class));
    }

    public static HeadToHead getHeadToHead(String firstTeamName, String secondTeamName) {
        ParameterMap parameters = new ParameterMap().put("action", "get_H2H")
                .put("firstTeam", firstTeamName)
                .put("secondTeam", secondTeamName);

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
