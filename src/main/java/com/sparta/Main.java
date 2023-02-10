package com.sparta;

public class Main {
    public static void main(String[] args) {
        Team manUtd = new ManUtd();
        Team liverpool = new Liverpool();
        Team manCity = new ManCity();

        Team[] teamArray = {manUtd, liverpool, manCity};

        for(Team t : teamArray){
            t.setTeamName();
            System.out.println(t.getTeamName());
            t.setKitColour();
            System.out.println(t.getKitColour());
            t.setPoints();
            System.out.println(t.getPoints());
        }
    }
}