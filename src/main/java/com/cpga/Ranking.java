package com.cpga;

import java.util.ArrayList;
import java.util.List;

/**
 * The ranking is the responsible of keeping all the competitors score in order max to min.
 */
public class Ranking {


    /**
     * The current list of competitors,
     */
    final List<Competitor> competitors;


    /**
     * Create a Ranking.
     */
    public Ranking() {
        this.competitors = new ArrayList<>();
    }


    /**
     * Add a competitor to the ranking.
     * Reorder the list to keep the order.
     *
     * @param competitor
     */
    public void add(Competitor competitor) {
        competitors.add(competitor);
        competitors.sort((o1, o2) -> {
            if (o1.getScore() == o2.getScore())
                return 0;
            return o1.getScore() > o2.getScore() ? -1 : 1;
        });
    }


    /**
     * @return the list of the competitors.
     */
    public List<Competitor> getCompetitors() {
        return competitors;
    }

}
