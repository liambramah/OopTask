package com.sparta;

public class ManCity extends Team {
    public int wins = 14;
    public int draws = 3;

    private String teamNameManCity = "Manchester City";
    private String kitColourRed = "Blue";

    @Override
    public void setPoints(){
        this.points = wins * 3 + draws;
    }

    @Override   public void setKitColour() {
        this.kitColour = kitColourRed;
    }

    @Override     public void setTeamName() {
        this.teamName = teamNameManCity;
    }

}

