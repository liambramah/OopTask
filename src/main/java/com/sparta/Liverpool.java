package com.sparta;

public class Liverpool extends Team {
    public int wins = 8;
    public int draws = 5;
    private String teamNameLiverpool = "Liverpool";
    private String kitColourRed = "Red";

    @Override
    public void setPoints(){
        this.points = wins * 3 + draws;
    }

    @Override   public void setKitColour() {
        this.kitColour = kitColourRed;
    }

    @Override     public void setTeamName() {
        this.teamName = teamNameLiverpool;
    }

}