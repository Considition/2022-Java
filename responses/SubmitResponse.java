package responses;

import models.WeeklyStat;

import java.util.ArrayList;
import java.util.List;

public class SubmitResponse {
    
    public int totalScore;
    public String gameId;
    public List<WeeklyStat> weeks = new ArrayList<>();
    public int producedBags;
    public int destroyedBags;
    public String link;


    public SubmitResponse(int totalScore, String gameId, List<WeeklyStat> weeks, int producedBags, int destroyedBags, String link){
        this.totalScore = totalScore;
        this.gameId = gameId;
        this.weeks = weeks;
        this.producedBags = producedBags;
        this.destroyedBags = destroyedBags;
        this.link = link;
    }
}


