
package responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Home {

    @SerializedName("substitutions")
    @Expose
    private List<Substitution> substitutions = null;

    @SerializedName("starting_lineups")
    @Expose
    private List<StartingLineup> startingLineups = null;

    @SerializedName("substitutes")
    @Expose
    private List<Substitute> substitutes = null;

    @SerializedName("coach")
    @Expose
    private List<Coach> coach = null;

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public List<StartingLineup> getStartingLineups() {
        return startingLineups;
    }

    public List<Substitute> getSubstitutes() {
        return substitutes;
    }

    public List<Coach> getCoach() {
        return coach;
    }

    @Override
    public String toString() {
        return "Home{" +
                "substitutions=" + substitutions +
                ", startingLineups=" + startingLineups +
                ", substitutes=" + substitutes +
                ", coach=" + coach +
                '}';
    }
}
