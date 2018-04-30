
package responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeadToHead {

    @SerializedName("secondTeam_lastResults")
    @Expose
    private List<SecondTeamLastResult> secondTeamLastResults = null;

    @SerializedName("firstTeam_VS_secondTeam")
    @Expose
    private List<FirstTeamVSSecondTeam> firstTeamVSSecondTeam = null;

    @SerializedName("firstTeam_lastResults")
    @Expose
    private List<FirstTeamLastResult> firstTeamLastResults = null;

    public List<SecondTeamLastResult> getSecondTeamLastResults() {
        return secondTeamLastResults;
    }

    public List<FirstTeamVSSecondTeam> getFirstTeamVSSecondTeam() {
        return firstTeamVSSecondTeam;
    }

    public List<FirstTeamLastResult> getFirstTeamLastResults() {
        return firstTeamLastResults;
    }

    @Override
    public String toString() {
        return "HeadToHead{" +
                "secondTeamLastResults=" + secondTeamLastResults +
                ", firstTeamVSSecondTeam=" + firstTeamVSSecondTeam +
                ", firstTeamLastResults=" + firstTeamLastResults +
                '}';
    }
}
