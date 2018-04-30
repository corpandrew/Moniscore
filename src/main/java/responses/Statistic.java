
package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistic {

    @SerializedName("away")
    @Expose
    private String away;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("home")
    @Expose
    private String home;

    public String getAway() {
        return away;
    }

    public String getType() {
        return type;
    }

    public String getHome() {
        return home;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "away='" + away + '\'' +
                ", type='" + type + '\'' +
                ", home='" + home + '\'' +
                '}';
    }
}
