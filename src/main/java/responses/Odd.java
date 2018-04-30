package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Odd {

    @SerializedName("match_id")
    @Expose
    private String matchId;

    @SerializedName("odd_bookmakers")
    @Expose
    private String oddBookmakers;

    @SerializedName("odd_date")
    @Expose
    private String oddDate;

    @SerializedName("odd_1")
    @Expose
    private String odd1;

    @SerializedName("odd_x")
    @Expose
    private String oddX;

    @SerializedName("odd_2")
    @Expose
    private String odd2;

    @SerializedName("ah-2.5_1")
    @Expose
    private String ah251;

    @SerializedName("ah-2.5_2")
    @Expose
    private String ah252;

    @SerializedName("ah-2_1")
    @Expose
    private String ah21;

    @SerializedName("ah-2_2")
    @Expose
    private String ah22;

    @SerializedName("ah-1.5_1")
    @Expose
    private String ah151;

    @SerializedName("ah-1.5_2")
    @Expose
    private String ah152;

    @SerializedName("ah-1_1")
    @Expose
    private String ah11;

    @SerializedName("ah-1_2")
    @Expose
    private String ah12;

    @SerializedName("ah0_1")
    @Expose
    private String ah01;

    @SerializedName("ah0_2")
    @Expose
    private String ah02;

    @SerializedName("o+0.5")
    @Expose
    private String o05;

    @SerializedName("u+0.5")
    @Expose
    private String u05;

    @SerializedName("o+1.5")
    @Expose
    private String o15;

    @SerializedName("u+1.5")
    @Expose
    private String u15;

    @SerializedName("o+2")
    @Expose
    private String o2;

    @SerializedName("u+2")
    @Expose
    private String u2;

    @SerializedName("o+2.5")
    @Expose
    private String o25;

    @SerializedName("u+2.5")
    @Expose
    private String u25;

    @SerializedName("o+3")
    @Expose
    private String o3;

    @SerializedName("u+3")
    @Expose
    private String u3;

    @SerializedName("o+3.5")
    @Expose
    private String o35;

    @SerializedName("u+3.5")
    @Expose
    private String u35;

    @SerializedName("o+4.5")
    @Expose
    private String o45;

    @SerializedName("u+4.5")
    @Expose
    private String u45;

    @SerializedName("o+5.5")
    @Expose
    private String o55;

    @SerializedName("u+5.5")
    @Expose
    private String u55;

    @SerializedName("bts_yes")
    @Expose
    private String btsYes;

    @SerializedName("bts_no")
    @Expose
    private String btsNo;

    public String getMatchId() {
        return matchId;
    }

    public String getOddBookmakers() {
        return oddBookmakers;
    }

    public String getOddDate() {
        return oddDate;
    }

    public String getOdd1() {
        return odd1;
    }

    public String getOddX() {
        return oddX;
    }

    public String getOdd2() {
        return odd2;
    }

    public String getAh251() {
        return ah251;
    }

    public String getAh252() {
        return ah252;
    }

    public String getAh21() {
        return ah21;
    }

    public String getAh22() {
        return ah22;
    }

    public String getAh151() {
        return ah151;
    }

    public String getAh152() {
        return ah152;
    }

    public String getAh11() {
        return ah11;
    }

    public String getAh12() {
        return ah12;
    }

    public String getAh01() {
        return ah01;
    }

    public String getAh02() {
        return ah02;
    }

    public String getO05() {
        return o05;
    }

    public String getU05() {
        return u05;
    }

    public String getO15() {
        return o15;
    }

    public String getU15() {
        return u15;
    }

    public String getO2() {
        return o2;
    }

    public String getU2() {
        return u2;
    }

    public String getO25() {
        return o25;
    }

    public String getU25() {
        return u25;
    }

    public String getO3() {
        return o3;
    }

    public String getU3() {
        return u3;
    }

    public String getO35() {
        return o35;
    }

    public String getU35() {
        return u35;
    }

    public String getO45() {
        return o45;
    }

    public String getU45() {
        return u45;
    }

    public String getO55() {
        return o55;
    }

    public String getU55() {
        return u55;
    }

    public String getBtsYes() {
        return btsYes;
    }

    public String getBtsNo() {
        return btsNo;
    }

    @Override
    public String toString() {
        return "Odd{" +
                "matchId='" + matchId + '\'' +
                ", oddBookmakers='" + oddBookmakers + '\'' +
                ", oddDate='" + oddDate + '\'' +
                ", odd1='" + odd1 + '\'' +
                ", oddX='" + oddX + '\'' +
                ", odd2='" + odd2 + '\'' +
                ", ah251='" + ah251 + '\'' +
                ", ah252='" + ah252 + '\'' +
                ", ah21='" + ah21 + '\'' +
                ", ah22='" + ah22 + '\'' +
                ", ah151='" + ah151 + '\'' +
                ", ah152='" + ah152 + '\'' +
                ", ah11='" + ah11 + '\'' +
                ", ah12='" + ah12 + '\'' +
                ", ah01='" + ah01 + '\'' +
                ", ah02='" + ah02 + '\'' +
                ", o05='" + o05 + '\'' +
                ", u05='" + u05 + '\'' +
                ", o15='" + o15 + '\'' +
                ", u15='" + u15 + '\'' +
                ", o2='" + o2 + '\'' +
                ", u2='" + u2 + '\'' +
                ", o25='" + o25 + '\'' +
                ", u25='" + u25 + '\'' +
                ", o3='" + o3 + '\'' +
                ", u3='" + u3 + '\'' +
                ", o35='" + o35 + '\'' +
                ", u35='" + u35 + '\'' +
                ", o45='" + o45 + '\'' +
                ", u45='" + u45 + '\'' +
                ", o55='" + o55 + '\'' +
                ", u55='" + u55 + '\'' +
                ", btsYes='" + btsYes + '\'' +
                ", btsNo='" + btsNo + '\'' +
                '}';
    }
}