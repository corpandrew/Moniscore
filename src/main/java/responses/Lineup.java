
package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lineup {

    @SerializedName("away")
    @Expose
    private Away away;

    @SerializedName("home")
    @Expose
    private Home home;

    public Away getAway() {
        return away;
    }

    public Home getHome() {
        return home;
    }

    @Override
    public String toString() {
        return "Lineup{" +
                "away=" + away +
                ", home=" + home +
                '}';
    }
}
