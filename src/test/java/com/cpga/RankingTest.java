package com.cpga;

import com.cpga.exceptions.CompetitorCreationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankingTest {



    @Test
    void add() {
        Ranking r = new Ranking();

        assertTrue(r.getCompetitors().isEmpty());


        r.add(validCompetitor("papa", 5));

        assertTrue(r.getCompetitors().size() == 1);
        assertEquals("papa", getFirstCompetitorName(r));

        r.add(validCompetitor("pepe", 10));

        assertTrue(r.getCompetitors().size() == 2);
        assertEquals("pepe", getFirstCompetitorName(r));

    }

    private Competitor validCompetitor(String name, Integer score) {

        try {
            return Competitor.CompetitorBuilder.build(name, score) ;
        } catch (CompetitorCreationException e) {
            return null;
        }
    }

    private String getFirstCompetitorName(Ranking r) {
        return r.competitors.get(0).getName();
    }


}