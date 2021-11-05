package orclandInstituteOfTechnologyApp;

/**
 * This class resembles a database. It maintains an instance variable called
 * "offerings" which stores a collection of Modules offered in Semester One. It
 * contains methods such as an accessor method, a search-by-code method, a
 * method that initialises data onto the array, and a certification method.
 *
 * @author Foong : Amos (18044418)
 *
 */
public class TechnicalSchool {

    private Module[] offerings;

    /**
     * The default constructor for TechnicalSchool class. It initialises the
     * instance data (by calling a static method in TechnicalSchool class)
     * called "offerings" to an array of modules specified in the static method.
     *
     */
    public TechnicalSchool() {
        // Calls the semesterOneModuleOfferings static method and 
        // saves the returned Module array's address to offerings.
        this.offerings = TechnicalSchool.semesterOneModuleOfferings();
    }

    // Getter (Accessor) method for Object's instance data.
    //--------------------------------------------------------
    /**
     * Returns an array of modules offered by the school to caller.
     *
     * This method returns the instance data (an array of Modules) to caller,
     * the information can later be used to display the papers offered by the
     * school.
     *
     * @return offerings : A Module array consisting the current semester's
     * modules.
     *
     */
    public Module[] getSemesterOfferings() {
        return this.offerings;
    }
    //--------------------------------------------------------

    /**
     * Returns either a Module object or null (depending on conditions) to
     * caller. The returned object can be used to assign specific papers
     * (Modules) to a Student's transcript without having to manually enter its
     * full details.
     *
     * This method allows the user to enter a code to search for a module
     * offered by the school. This method iterates through "offerings" array in
     * an attempt to match a paper with the code specified. If the module is
     * part of the semester's offerings, it returns that specific module to
     * caller, otherwise it returns null if it is not found.
     *
     * @param code : paper code that is fed in from the caller
     * @return paper : the matched module in offerings array
     * @return null : if no match was found
     *
     */
    public Module lookup(String code) {
        // For each loop to iterate through the offerings array.
        for(Module paper : this.offerings) {
            // Checks if the "code" fed in from caller matches 
            // with a paper that is in the offerings array.
            // (search is not case-sensitive).
            if(code.equalsIgnoreCase(paper.getCode())) {
                // If match, return the specific module to caller
                // (halts iteration by returning the control 
                // back to caller). 
                return paper;
            }
        }

        // Returns null to caller if there was no match.
        return null;
    }

    /**
     * Returns an array of Modules comprising the 13 papers (modules) that are
     * offered by the school in semester one.
     *
     * This is a static method for TechnicalSchool class. It creates an array of
     * Modules, comprising of 13 distinct new instances of Modules (as specified
     * in the Assignment brief) that are offered by the school. The populated
     * array is then returned to caller.
     *
     * @return semesterOneModules : an array of modules that are offered in
     * semester one.
     *
     */
    private static Module[] semesterOneModuleOfferings() {
        // Creates a new instance array sized 13 of the Module class.
        Module[] semesterOneModules = new Module[13];

        // Instantiates each element of the Module array to information provided in the Assignment brief.
        // This method was chosen (instead of initialising it during the declaration of the array) to aid debugging. 
        semesterOneModules[0] = new Module(ModuleType.TAUGHT, "Programming", "PROG101", Level.ONE);
        semesterOneModules[1] = new Module(ModuleType.TAUGHT, "Statistics", "STAT102", Level.ONE);
        semesterOneModules[2] = new Module(ModuleType.TAUGHT, "Database Design", "DATA222", Level.TWO);
        semesterOneModules[3] = new Module(ModuleType.TAUGHT, "Object-Oriented Programming", "PROG202", Level.TWO);
        semesterOneModules[4] = new Module(ModuleType.TAUGHT, "Information Systems", "INSY313", Level.THREE);
        semesterOneModules[5] = new Module(ModuleType.TAUGHT, "Web Services", "WEBS332", Level.THREE);

        semesterOneModules[6] = new Module(ModuleType.SELF_STUDY, "Technology Applications", "TECH103", Level.ONE);
        semesterOneModules[7] = new Module(ModuleType.SELF_STUDY, "Theory of Computation", "THEO111", Level.ONE);
        semesterOneModules[8] = new Module(ModuleType.SELF_STUDY, "Model Checking", "MODC233", Level.TWO);
        semesterOneModules[9] = new Module(ModuleType.SELF_STUDY, "Topology", "TOPG233", Level.TWO);
        semesterOneModules[10] = new Module(ModuleType.SELF_STUDY, "Logic", "LOGI321", Level.THREE);

        semesterOneModules[11] = new Module(ModuleType.PROJECT, "Web App Dev", "PROJ399", Level.THREE);
        semesterOneModules[12] = new Module(ModuleType.CLIENT_PROJECT, "Great Code Company", "EXTO396", Level.THREE);

        // Returns the populated array to caller. 
        return semesterOneModules;
    }

    /**
     * Returns a boolean value (T/F) stating whether if the student has met
     * certain specific requirements or not. This information can be used to
     * determine if a student has passed the course.
     *
     * This method retrieves a copy of the student's transcript, counts their
     * passed papers from each level and counts specific ModuleTypes achieved.
     * It then evaluates the student based on the criteria specified in the
     * Assignment's brief, returning a boolean value describing their
     * certification status.
     *
     * @param student : A Student object containing their name, transcript, and
     * number of results
     * @return a boolean value stating whether if the student is certified or
     * not
     *
     */
    public boolean isCertified(Student student) {
        // Int array to count passed papers for each level (1,2,3). 
        int[] levelRequisites = new int[3];

        // Int array to count additional requirements (types) for levels 2 and 3. 
        int[] typeCoRequisites = new int[3];

        // Invokes getTranscript method from Student class to 
        // receive an array of Results and saves it locally.
        Result[] studentResults = student.getTranscript();

        // For each loop to iterate through the array of Results
        // called "studentResults". 
        for(Result individualModule : studentResults) {
            // Initialises three local variables (local to the for loop)
            // to appropriate data for the purpose of improving code 
            // readability (for codes below).
            Level moduleLevel = individualModule.getModule().getLevel();
            boolean isPass = individualModule.getGrade().isPass();
            ModuleType moduleType = individualModule.getModule().getType();

            // Nested else...if ladder to check the paper's levels, types, and if it is a pass. 
            if((moduleLevel == Level.ONE) && (isPass)) // If paper (module) is Level One paper AND if it is a pass...
            {
                // Increment the first element (index = 0) of levelRequisites (counter)
                // (using the .ordinal() method from Enumeration.
                levelRequisites[Level.ONE.ordinal()]++;
            } else if((moduleLevel == Level.TWO) && (isPass)) // If paper (module) is a Level Two paper AND if it is a pass...
            {
                // Increment the second element (index = 1) of levelRequisites (counter). 
                levelRequisites[Level.TWO.ordinal()]++;

                // If statement to further check the Module's Type. 
                if(moduleType == ModuleType.SELF_STUDY) // If the Module is of type Self-Study...
                {
                    // Increment the first element (index = 0) of typeCoRequisites. 
                    typeCoRequisites[ModuleType.SELF_STUDY.ordinal()]++;
                }
            } else if((moduleLevel == Level.THREE) && (isPass)) // If paper (module) is a Level Three paper AND if it is a pass...		
            {
                // Increment the third element (index = 2) of levelRequisites (counter).
                levelRequisites[Level.THREE.ordinal()]++;

                // Else if ladder further check the Module's Type.
                if(moduleType == ModuleType.TAUGHT) // If the Module is of type Taught...
                {
                    // Increment the second element (index = 1) of typeCoRequisites. 
                    typeCoRequisites[ModuleType.TAUGHT.ordinal()]++;
                } else if((moduleType == ModuleType.PROJECT) || (moduleType == ModuleType.CLIENT_PROJECT)) // If the Module is of type Project OR Client Project...
                {
                    // Increment the third element (index = 2) of typeCoRequisites.
                    typeCoRequisites[ModuleType.PROJECT.ordinal()]++;
                }
            }
        }

        // If statement to determine if students meet the requirements 
        // specified in the Assignment brief in order to be Certified.
        if((levelRequisites[Level.ONE.ordinal()] >= 3)
                && // Level 1 Requirements
                (levelRequisites[Level.TWO.ordinal()] >= 3 && typeCoRequisites[ModuleType.SELF_STUDY.ordinal()] > 1)
                && // Level 2 Requirements and Co-Requirements
                (levelRequisites[Level.THREE.ordinal()] >= 4 && typeCoRequisites[ModuleType.TAUGHT.ordinal()] >= 2)
                && // Level 3 Requirements and Co-Requirements
                (typeCoRequisites[ModuleType.PROJECT.ordinal()] >= 1)) // Project Requirement
        {
            // If student has met the criteria, returns true to caller
            // and returns control back to caller (stop the execution 
            // of codes after the scope of the if).
            return true;
        }

        // If student did not meet the criteria, a  
        // false will be returned to caller. 
        return false;
    }
}
