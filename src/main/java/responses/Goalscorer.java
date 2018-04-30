
package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Goalscorer {

    @SerializedName("score")
    @Expose
    private String score;

    @SerializedName("time")
    @Expose
    private String time;

    @SerializedName("away_scorer")
    @Expose
    private String awayScorer;

    @SerializedName("home_scorer")
    @Expose
    private String homeScorer;

    public String getScore() {
        return score;
    }

    public String getTime() {
        return time;
    }

    public String getAwayScorer() {
        return awayScorer;
    }

    public String getHomeScorer() {
        return homeScorer;
    }

    @Override
    public String toString() {
        return "Goalscorer{" +
                "score='" + score + '\'' +
                ", time='" + time + '\'' +
                ", awayScorer='" + awayScorer + '\'' +
                ", homeScorer='" + homeScorer + '\'' +
                '}';
    }
}
