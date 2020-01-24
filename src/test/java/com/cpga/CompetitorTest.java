package com.cpga;

import com.cpga.exceptions.CompetitorCreationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompetitorTest {

    @Test
    void testBuilder() {
        assertThrows(CompetitorCreationException.class, () -> Competitor.CompetitorBuilder.build(null, 10));
        assertThrows(CompetitorCreationException.class, () -> Competitor.CompetitorBuilder.build("", 10));
        assertThrows(CompetitorCreationException.class, () -> Competitor.CompetitorBuilder.build("pepe", null));
        assertThrows(CompetitorCreationException.class, () -> Competitor.CompetitorBuilder.build("pepe", -10));

        assertDoesNotThrow(() -> Competitor.CompetitorBuilder.build("pepe", 10));
    }
}