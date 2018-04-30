
package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirstTeamLastResult {

    @SerializedName("match_awayteam_name")
    @Expose
    private String matchAwayteamName;

    @SerializedName("match_id")
    @Expose
    private String matchId;

    @SerializedName("league_name")
    @Expose
    private String leagueName;

    @SerializedName("match_hometeam_halftime_score")
    @Expose
    private String matchHometeamHalftimeScore;

    @SerializedName("match_time")
    @Expose
    private String matchTime;

    @SerializedName("match_status")
    @Expose
    private String matchStatus;

    @SerializedName("match_awayteam_halftime_score")
    @Expose
    private String matchAwayteamHalftimeScore;

    @SerializedName("match_date")
    @Expose
    private String matchDate;

    @SerializedName("match_live")
    @Expose
    private String matchLive;

    @SerializedName("match_hometeam_score")
    @Expose
    private String matchHometeamScore;

    @SerializedName("match_awayteam_score")
    @Expose
    private String matchAwayteamScore;

    @SerializedName("match_hometeam_name")
    @Expose
    private String matchHometeamName;

    @SerializedName("country_name")
    @Expose
    private String countryName;

    @SerializedName("country_id")
    @Expose
    private String countryId;

    @SerializedName("league_id")
    @Expose
    private String leagueId;

    public String getMatchAwayteamName() {
        return matchAwayteamName;
    }

    public String getMatchId() {
        return matchId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public String getMatchHometeamHalftimeScore() {
        return matchHometeamHalftimeScore;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public String getMatchAwayteamHalftimeScore() {
        return matchAwayteamHalftimeScore;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public String getMatchLive() {
        return matchLive;
    }

    public String getMatchHometeamScore() {
        return matchHometeamScore;
    }

    public String getMatchAwayteamScore() {
        return matchAwayteamScore;
    }

    public String getMatchHometeamName() {
        return matchHometeamName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getLeagueId() {
        return leagueId;
    }

    @Override
    public String toString() {
        return "FirstTeamLastResult{" +
                "matchAwayteamName='" + matchAwayteamName + '\'' +
                ", matchId='" + matchId + '\'' +
                ", leagueName='" + leagueName + '\'' +
                ", matchHometeamHalftimeScore='" + matchHometeamHalftimeScore + '\'' +
                ", matchTime='" + matchTime + '\'' +
                ", matchStatus='" + matchStatus + '\'' +
                ", matchAwayteamHalftimeScore='" + matchAwayteamHalftimeScore + '\'' +
                ", matchDate='" + matchDate + '\'' +
                ", matchLive='" + matchLive + '\'' +
                ", matchHometeamScore='" + matchHometeamScore + '\'' +
                ", matchAwayteamScore='" + matchAwayteamScore + '\'' +
                ", matchHometeamName='" + matchHometeamName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", countryId='" + countryId + '\'' +
                ", leagueId='" + leagueId + '\'' +
                '}';
    }
}
