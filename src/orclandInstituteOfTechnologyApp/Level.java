package orclandInstituteOfTechnologyApp;

/**
 * This is an Enumeration that maintains three instance data (constants) which
 * describes the difficulty (Level) of a particular paper (Module). Levels
 * typically refer to the different years of tertiary education. The three
 * levels are: One, Two, Three. It also has a toString method which returns a
 * number representing the level.
 *
 * @author Foong : Amos (18044418)
 *
 */
public enum Level {
    ONE, TWO, THREE;

    /**
     * Returns a String object containing a number to represent a level.
     *
     * Additional toString method to return an numeric character instead of an
     * English word to represent the Level.
     *
     * @return A String object containing a number
     *
     */
    @Override
    public String toString() {
        // Switch case statement to replace words with numbers.
        switch(this.name()) {
            case "ONE":
                return "1";
            case "TWO":
                return "2";
            case "THREE":
                return "3";
        }

        return "?";
    }
}
