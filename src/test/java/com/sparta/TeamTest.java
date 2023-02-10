package com.sparta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class TeamTest {
    @Test
    @DisplayName("TeamNameTest")
    public void teamNameTest(){
        Team manUtd = new ManUtd();
        String expectedResult = "Manchester United";
        manUtd.setTeamName();
        String result = manUtd.getTeamName();
        Assertions.assertEquals(expectedResult, result);
    }
}