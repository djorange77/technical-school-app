package orclandInstituteOfTechnologyApp;

/**
 * This is an Enumeration that maintains a set of Grades which can be used to
 * describe the quality of a student's work for a particular paper (Module). It
 * is generally a measure of proficiency.
 *
 * It also associates appropriate boundary values (percentages) to specific
 * grades and a boolean value describing if a particular grade is a pass (T) or
 * fail (F).
 *
 * @author Foong : Amos (18044418)
 *
 */
public enum Grade {
    APLUS(100, 90, true), A(89, 85, true), AMINUS(84, 80, true),
    BPLUS(79, 75, true), B(74, 70, true), BMINUS(69, 65, true),
    CPLUS(64, 60, true), C(59, 55, true), CMINUS(54, 50, true),
    D(49, 0, false);

    private int low;
    private int high;
    private boolean pass;

    /**
     * This is the default constructor for the enum Grade. It associates
     * appropriate boundary values (percentages) to specific grades and a
     * boolean value describing if a particular grade is a pass (T) or fail (F).
     * The values to be associated are specified beside the enum's name (in
     * brackets) by the enum's definition as input parameters.
     *
     * @param high : maximum percentage allowed for the grade
     * @param low : minimum percentage required for the grade
     * @param pass : describes the pass status of the grade
     *
     */
    private Grade(int high, int low, boolean pass) {
        this.high = high;
        this.low = low;
        this.pass = pass;
    }

    // Getter (Accessor) methods for Enum's instance variables.
    //--------------------------------------------------------
    /**
     * Returns an integer value describing the lowest acceptable percentage for
     * a particular a grade.
     *
     * This method returns the minimum acceptable percentage (int) for a
     * particular grade.
     *
     * @return low : minimum percentage required for the grade
     *
     */
    public int getLow() {
        return this.low;
    }
    //--------------------------------------------------------

    /**
     * Returns an integer value describing the maximum possible percentage for a
     * particular a grade.
     *
     * This method returns the maximum allowed percentage (int) for a particular
     * grade.
     *
     * @return high : maximum percentage allowed for the grade
     *
     */
    public int getHigh() {
        return this.high;
    }
    //--------------------------------------------------------

    /**
     * Returns an boolean value that can be used to determine if a particular
     * paper (Module) is a Pass (T) or Fail (F) depending on the Grade (set in
     * Result) that had been set for it.
     *
     * This method returns a boolean value (T/F) whether a particular grade is a
     * pass (T) or fail (F).
     *
     * @return pass : describes the pass status of the grade
     *
     */
    public boolean isPass() {
        return this.pass;
    }
    //--------------------------------------------------------

    /**
     * Returns a String describing a particular grade in short-form.
     *
     * This method uses conditional statements to check if the name can be
     * shortened and returns the corresponding shortened version of a grade (e.g
     * "APLUS" becomes "A+").
     *
     * @return a string containing a short description of a grade
     *
     */
    @Override
    public String toString() {
        // If and else statement to check if an 
        // enum's name contains a "PLUS" or "MINUS".
        if(this.name().contains("PLUS")) {
            // Returns the name with "PLUS" replaced with a "+".
            return (this.name().replace("PLUS", "+"));
        } else if(this.name().contains("MINUS")) {
            // Returns the name with "MINUS" replaced with a "-".
            return (this.name().replace("MINUS", "-"));
        }

        // Returns the name of enum if they are just 
        // one lettered (e.g. "A").
        return this.name();
    }
}
