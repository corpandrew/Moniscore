
package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("time")
    @Expose
    private String time;

    @SerializedName("home_fault")
    @Expose
    private String homeFault;

    @SerializedName("card")
    @Expose
    private String card;

    @SerializedName("away_fault")
    @Expose
    private String awayFault;

    public String getTime() {
        return time;
    }

    public String getHomeFault() {
        return homeFault;
    }

    public String getCard() {
        return card;
    }

    public String getAwayFault() {
        return awayFault;
    }

    @Override
    public String toString() {
        return "Card{" +
                "time='" + time + '\'' +
                ", homeFault='" + homeFault + '\'' +
                ", card='" + card + '\'' +
                ", awayFault='" + awayFault + '\'' +
                '}';
    }
}