
package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coach {

    @SerializedName("lineup_position")
    @Expose
    private String lineupPosition;

    @SerializedName("lineup_player")
    @Expose
    private String lineupPlayer;

    @SerializedName("lineup_number")
    @Expose
    private String lineupNumber;

    public String getLineupPosition() {
        return lineupPosition;
    }

    public String getLineupPlayer() {
        return lineupPlayer;
    }

    public String getLineupNumber() {
        return lineupNumber;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "lineupPosition='" + lineupPosition + '\'' +
                ", lineupPlayer='" + lineupPlayer + '\'' +
                ", lineupNumber='" + lineupNumber + '\'' +
                '}';
    }
}
