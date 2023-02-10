package com.sparta;

public class ManUtd extends Team{
    public int wins = 13;
    public int draws = 4;
    private String teamNameManUtd = "Manchester United";
    private String kitColourRed = "Red";

    @Override
    public void setPoints(){
        this.points = wins * 3 + draws;
    }

    @Override   public void setKitColour() {
        this.kitColour = kitColourRed;
    }

    @Override     public void setTeamName() {
        this.teamName = teamNameManUtd;
    }

}