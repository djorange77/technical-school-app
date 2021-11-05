package orclandInstituteOfTechnologyApp;

/**
 * The Result class manages a set of attributes that relates a student's
 * achievement to a particular paper/module. Associated attributes include a
 * module and a grade. This class contains several get and set methods that will
 * be used to initialise the Object's instance variables. It also possesses a
 * toString method which returns the code of the paper (module) alongside its
 * respective Grade.
 *
 * @author Foong : Amos (18044418)
 *
 */
public class Result {

    private Module module;
    private Grade grade;

    /**
     * The default constructor for Result class. It receives a Module object and
     * its corresponding Grade passed in from caller and initialises it to the
     * Object's instance attributes by calling the appropriate set (mutator)
     * methods.
     *
     * @param module : the paper (module) that is to be associated with a grade
     * @param grade : the quality of work for a specific paper achieved by the
     * student
     *
     */
    public Result(Module module, Grade grade) {
        this.setModule(module);
        this.setGrade(grade);
    }

    // Getter and setter methods for Object's instance data.
    //--------------------------------------------------------
    /**
     * Returns a Module object that can be used to identify the specific paper
     * (module) that it is referring to.
     *
     * This method accesses the Result's instance object called "module" and
     * returns it to the caller.
     *
     * @return module : paper (module) that is to be associated with a grade
     *
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * This method allows other classes to set/modify the paper (module) that is
     * to be associated with a Grade.
     *
     * @param module :a paper (module) fed in from the caller
     *
     */
    public void setModule(Module module) {
        this.module = module;
    }
    //--------------------------------------------------------

    /**
     * Returns an enumeration (typed Grade) which can be used to describe the
     * quality of work for a specific paper (module) achieved by the student.
     *
     * This method accesses the Result's instance data called "grade" and
     * returns the assigned value to caller.
     *
     * @return grade : the quality of work for a specific paper achieved by the
     * student
     *
     */
    public Grade getGrade() {
        return this.grade;
    }

    /**
     * This method allows other classes to set/modify the Grade that is to be
     * associated with a paper (Module).
     *
     * @param grade : the quality of work for a specific paper achieved by the
     * student
     *
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    //--------------------------------------------------------

    /**
     * Returns a String containing the paper's (module) code and its respective
     * Grade to caller.
     *
     * Firstly, this method invokes an accessor (get) method to procure the
     * paper (module) followed by a get method to obtain the code of a specific
     * paper (module). Secondly, it accesses the local instance data called
     * grade and calls its corresponding toString method. Lastly, it returns the
     * procured paper code (module) and its associated grade both as a String to
     * the caller.
     *
     * @return A String object comprising the paper code and its respective
     * grade.
     */
    @Override
    public String toString() {
        // Returns the paper (Module) code and its respective Grade to caller. 
        return (this.getModule().getCode() + " " + this.getGrade().toString());
    }
}
