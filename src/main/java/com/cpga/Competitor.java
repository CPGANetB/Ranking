package com.cpga;

import com.cpga.exceptions.CompetitorCreationException;

/**
 * Represent a competitor that have a ranking
 *
 */
public class Competitor {

    /**
     * The competitor name.
     */
    final String name;


    /**
     * The current score of the competitor.
     */
    final Integer score;


    /**
     * Create a competitor.
     *
     * @param name
     * @param score
     */
    private Competitor(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    /**
     * @return the competitor name;
     */
    public String getName() {
        return name;
    }

    /**
     * @return the competitor score.
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Is the responsible for the creation of a valid Competitor.
     */
    public static class CompetitorBuilder{


        /**
         * Create a competitor if it is valid.
         *
         * @param name
         * @param score
         * @return
         * @throws CompetitorCreationException
         */
        public static Competitor build(String name, Integer score) throws CompetitorCreationException {

            if (name == null || name.isEmpty()){
                throw new CompetitorCreationException("The name can not be null or empty.");
            }

            if (score == null || score < 0){
                throw new CompetitorCreationException("The score should be greater than 0.");
            }

            return new Competitor(name, score);
        }
    }

}
