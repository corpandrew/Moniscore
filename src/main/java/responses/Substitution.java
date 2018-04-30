
package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Substitution {

    @SerializedName("lineup_position")
    @Expose
    private String lineupPosition;

    @SerializedName("lineup_player")
    @Expose
    private String lineupPlayer;

    @SerializedName("lineup_number")
    @Expose
    private String lineupNumber;

    @SerializedName("lineup_time")
    @Expose
    private String lineupTime;

    public String getLineupPosition() {
        return lineupPosition;
    }

    public String getLineupPlayer() {
        return lineupPlayer;
    }

    public String getLineupNumber() {
        return lineupNumber;
    }

    public String getLineupTime() {
        return lineupTime;
    }

    @Override
    public String toString() {
        return "Substitution{" +
                "lineupPosition='" + lineupPosition + '\'' +
                ", lineupPlayer='" + lineupPlayer + '\'' +
                ", lineupNumber='" + lineupNumber + '\'' +
                ", lineupTime='" + lineupTime + '\'' +
                '}';
    }
}
