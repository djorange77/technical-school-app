package orclandInstituteOfTechnologyApp;

/**
 * The Student class manages an assemblage of attributes that relate to a
 * Student. These attributes include a name, a transcript (an array of Results),
 * and the number of results. It also has a constant for the maximum transcript
 * length (set to 20), to allow for paper (module) repeats.
 *
 * @author Foong : Amos (18044418)
 *
 */
public class Student {

    private String name;
    private final int MAX_TRANSCRIPT_LENGTH = 20;
    private int nResults;
    private Result[] transcript;

    /**
     * The default constructor for Student class. It receives a String object
     * containing the student's name. It then initialises the name, number of
     * results, and transcript, by calling the appropriate set (mutator)
     * methods. It prepares "nResults" and "transcript" for use.
     *
     * @param name : the name of the student passed from caller
     *
     */
    public Student(String name) {
        this.setName(name);
        this.setNResults(0);
        this.setTranscript(transcript);
    }

    // Getter and setter methods for Object's instance data.
    //--------------------------------------------------------
    /**
     * Returns a String object that can be used to identify the student's name.
     *
     * This method accesses the Student's instance object called "name" and
     * returns it to the caller.
     *
     * @return name : the name of the student
     *
     */
    public String getName() {
        return this.name;
    }

    /**
     * This method allows other classes to set/modify the name of the student.
     * It also validates the fed-in parameter from the caller (If the input
     * parameter is empty, it will assign "UNKNOWN" as the name).
     *
     * @param name : the name of the student
     *
     */
    public void setName(String name) {
        this.name = (name.isEmpty() ? "UNKNOWN" : name);
    }
    //--------------------------------------------------------

    /**
     * Returns an integer that can be used to identify the number of results
     * that have been added to the student's transcript.
     *
     * This method accesses the Student's instance variable called "nResults"
     * and returns it to the caller.
     *
     * @return nResults : number of results that have been added to the
     * transcript
     *
     */
    public int getNResults() {
        return this.nResults;
    }

    /**
     * This method allows other classes to initialise the number of results
     * ("nResults") to zero. It also validates the input parameter (only zero is
     * acceptable), it always sets "nResults" to zero.
     *
     * @param nResults : a number fed in from the caller
     *
     */
    public void setNResults(int nResults) {
        this.nResults = (nResults == 0 ? nResults : 0);
    }
    //--------------------------------------------------------

    /**
     * Returns an array of Results filled with valid data which can be used as a
     * report card/transcript for a student.
     *
     * This method iterates "nResults" number of times so that null entries
     * within "transcript" are ignored, it also copies valid data onto a local
     * Results array which is then returned to the caller.
     *
     * @return A Results array containing user-added Results (only valid data
     * are included)
     *
     */
    public Result[] getTranscript() {
        // Creates a new instance array of Result class, sized 
        // according to the current number of results (nResults).
        Result[] completedTranscript = new Result[this.getNResults()];

        // For loop to copy valid data over, iterates nResults 
        // times (This ensures that no null entries are copied).
        for(int index = 0; index < this.getNResults(); index++) {
            // Copies data over from transcript to completedTranscript.
            completedTranscript[index] = this.transcript[index];
        }

        // Returns a Result array filled with valid data to caller. 
        return completedTranscript;
    }

    /**
     * This method prepares the array "transcript" for use. It initialises the
     * Student's instance attribute "transcript" to the size of
     * MAX_TRANSCRIPT_LENGTH so that it can be used to store data later.
     *
     * @param transcript : Student's instance attribute
     */
    public void setTranscript(Result[] transcript) {
        // Creates a new instance of a Result array 
        // to the size of MAX_TRANSCRIPT_LENGTH.
        this.transcript = new Result[MAX_TRANSCRIPT_LENGTH];
    }
    //--------------------------------------------------------

    /**
     * This method allows the user to add an instance of a Result object to the
     * student's transcript. It first checks if the added number of results
     * (nResults) is less than the maximum capacity (MAX_TRANSCRIPT_LENGTH)
     * preventing over-filling. Then, the Result constructor is called, it
     * receives a paper (Module) and a grade that are passed in from caller.
     * After an add succession, the "nResults" is incremented.
     *
     * @param module : the specific paper (module) to be added
     * @param grade : the grade achieved by the student for a particular paper
     * (module)
     *
     */
    public void addResultToTranscript(Module module, Grade grade) {
        // Checks if nResults is less than the maximum transcript 
        // length. Does not add if it has reached full capacity.
        if(this.getNResults() < MAX_TRANSCRIPT_LENGTH) {
            // Creates a new instance of a Result object in an element
            // of transcript array, passing the input parameters
            // to the Result constructor. Uses nResults as an index 
            // identifier and also increments nResults after assignment.
            this.transcript[this.nResults++] = new Result(module, grade);
        }
    }

    /**
     * Returns a String object containing a title with the student's name, an
     * array of paper (Module) codes and their corresponding grades, which can
     * be used as a transcript for a student.
     *
     * This method creates a String object that contains all the papers
     * (Modules) taken by a student and the grades associating with it. It
     * invokes the appropriate toString method from one other class.
     *
     * @return A String object representing a student's transcript
     *
     */
    @Override
    public String toString() {
        // This is the title for the transcript (includes the Student's name).
        String studentTranscript = ("Transcript for " + this.getName() + "\n");

        // For each loop to loop through the array of Results "transcript".
        for(Result paper : this.getTranscript()) {
            // Concatenates the paper code, its grade (obtained  
            // from the Result toString method), and a newline
            // to studentTranscript String object. 
            studentTranscript += (paper.toString() + "\n");
        }

        // Returns a String object containing a completed 
        // transcript for a specific Student to caller.
        return studentTranscript;
    }
}
