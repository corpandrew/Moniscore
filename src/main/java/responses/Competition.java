package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Competition {

    @SerializedName("country_id")
    @Expose
    private String countryId;

    @SerializedName("country_name")
    @Expose
    private String countryName;

    @SerializedName("league_id")
    @Expose
    private String leagueId;

    @SerializedName("league_name")
    @Expose
    private String leagueName;


    public String getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' +
                ", leagueId='" + leagueId + '\'' +
                ", leagueName='" + leagueName + '\'' +
                '}';
    }

}