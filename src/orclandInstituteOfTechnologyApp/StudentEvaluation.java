package orclandInstituteOfTechnologyApp;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * StudentEvaluation is a driver class. This is where program interacts with the
 * user to provide useful information. It is also a very user-friendly program
 * with several eye-catching icons.
 *
 * Some improvements to be made is to introduce an interactive GUI feature for
 * adding students, papers, and grades. However, due to time constraints, this
 * feature shall have to be for another time.
 *
 * @author Foong : Amos (18044418)
 *
 */
public class StudentEvaluation {
    // Static instance data that can be used throughout this class. 

    public static TechnicalSchool course = new TechnicalSchool();

    /**
     * This is the entry point of the program. It calls three different methods
     * which exhibits the different functionalities of the program.
     *
     * @param args : command line feature (unused in this program)
     *
     */
    public static void main(String[] args) {
        // Invokes consoleFunctionality method, it outputs an
        // array of students' transcripts to the console.
        consoleFunctionality();

        // Invokes printModules method, it outputs a table of
        // the Modules offered by Orcland's Institute of Technology (OIT).
        printModules();

        // Invokes GUI functionality method to demonstrate 
        // application in a simple GUI form (dialog boxes).
        guiFunctionality();
    }

    /**
     * This method outputs an array transcripts from eight different students
     * (separated by borders) to the console.
     *
     */
    public static void consoleFunctionality() {
        // Prints out each student's transcript onto 
        // the console (separated by borders).
        System.out.println("====================");
        System.out.print(robin());
        System.out.println(course.isCertified(robin()));
        System.out.println("====================");

        System.out.print(kate());
        System.out.println(course.isCertified(kate()));
        System.out.println("====================");

        System.out.print(axel());
        System.out.println(course.isCertified(axel()));
        System.out.println("====================");

        System.out.print(jim());
        System.out.println(course.isCertified(jim()));
        System.out.println("====================");

        System.out.print(ahmed());
        System.out.println(course.isCertified(ahmed()));
        System.out.println("====================");

        System.out.print(mary());
        System.out.println(course.isCertified(mary()));
        System.out.println("=====================");

        System.out.print(ashley());
        System.out.println(course.isCertified(ashley()));
        System.out.println("====================");

        System.out.print(laura());
        System.out.println(course.isCertified(laura()));
        System.out.println("====================\n");
    }

    /**
     * This method enables the user to select a student to display their
     * respective transcript. It uses a selection of input and message dialogs
     * boxes to display/retrieve basic information to/from the user.
     *
     */
    public static void guiFunctionality() {
        // Loads some icons from a source folder called images (located in the same directory of src folder).
        ImageIcon certifiedIcon = new ImageIcon("./images/certified.png");
        ImageIcon notcertifiedIcon = new ImageIcon("./images/notcertified.png");

        // A String array containing a collection of student names which 
        // can be used later in the drop down menu of the dialog box.
        String[] choices = new String[]{robin().getName(), kate().getName(), axel().getName(), jim().getName(),
            ahmed().getName(), mary().getName(), ashley().getName(), laura().getName()};

        // A String variable to store user's selection.
        String userSelection;

        // Do while loop to keep looping until user presses cancel or the close button.
        do {
            // Outputs a dialog box that has a drop-down menu comprising
            // of a list of students whose transcripts are available. 
            // Returns a String containing the name of the student 
            // selected by the user.
            userSelection = (String) JOptionPane.showInputDialog(null, // Unknown parameter (not used).
                    "Please select a student:", // Prompt user to select a student.
                    "Available Transcripts", // Title for the dialog box.
                    JOptionPane.QUESTION_MESSAGE, // Question mark icon.
                    null, // Unused as the question mark icon is used.
                    choices, // Provides a drop-down menu with a selection of students.
                    JOptionPane.OK_CANCEL_OPTION);	// Two-buttons, OK is for user to proceed with their selection and CANCEL is to quit. 

            if(userSelection != null) {
                switch(userSelection) {
                    // If user selects Robin...
                    case "Robin":
                        // Outputs Robin's transcript via a dialog box by invoking the appropriate methods.
                        JOptionPane.showMessageDialog(null, // Unknown parameter (not used).
                                (robin().toString() + "Certified: " + (course.isCertified(robin()) ? "Yes" : "No")), // Displays the student's transcript and their certification status.
                                robin().getName(), // Displays the title bar (name of the student).
                                (course.isCertified(robin()) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE), // Unused code as personalised icons are used.
                                (course.isCertified(robin()) ? certifiedIcon : notcertifiedIcon)); // This displays an icon illustrating whether the student is certified or not.
                        break;
                    // If user selects Kate...
                    case "Kate":
                        JOptionPane.showMessageDialog(null, (kate().toString() + "Certified: " + (course.isCertified(kate()) ? "Yes" : "No")),
                                kate().getName(), (course.isCertified(kate()) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE),
                                (course.isCertified(kate()) ? certifiedIcon : notcertifiedIcon));
                        break;
                    // If user selects Axel...
                    case "Axel":
                        JOptionPane.showMessageDialog(null, (axel().toString() + "Certified: " + (course.isCertified(axel()) ? "Yes" : "No")),
                                axel().getName(), (course.isCertified(axel()) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE),
                                (course.isCertified(axel()) ? certifiedIcon : notcertifiedIcon));
                        break;
                    // If user selects Jim...
                    case "Jim":
                        JOptionPane.showMessageDialog(null, (jim().toString() + "Certified: " + (course.isCertified(jim()) ? "Yes" : "No")),
                                jim().getName(), (course.isCertified(jim()) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE),
                                (course.isCertified(jim()) ? certifiedIcon : notcertifiedIcon));
                        break;
                    // If user selects Ahmed...
                    case "Ahmed":
                        JOptionPane.showMessageDialog(null, (ahmed().toString() + "Certified: " + (course.isCertified(ahmed()) ? "Yes" : "No")),
                                ahmed().getName(), (course.isCertified(ahmed()) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE),
                                (course.isCertified(ahmed()) ? certifiedIcon : notcertifiedIcon));
                        break;
                    // If user selects Mary...
                    case "Mary":
                        JOptionPane.showMessageDialog(null, (mary().toString() + "Certified: " + (course.isCertified(mary()) ? "Yes" : "No")),
                                mary().getName(), (course.isCertified(mary()) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE),
                                (course.isCertified(mary()) ? certifiedIcon : notcertifiedIcon));
                        break;
                    // If user selects Ashley...
                    case "Ashley":
                        JOptionPane.showMessageDialog(null, (ashley().toString() + "Certified: " + (course.isCertified(ashley()) ? "Yes" : "No")),
                                ashley().getName(), (course.isCertified(ashley()) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE),
                                (course.isCertified(ashley()) ? certifiedIcon : notcertifiedIcon));
                        break;
                    // If user selects Laura...
                    case "Laura":
                        JOptionPane.showMessageDialog(null, (laura().toString() + "Certified: " + (course.isCertified(laura()) ? "Yes" : "No")),
                                laura().getName(), (course.isCertified(laura()) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE),
                                (course.isCertified(laura()) ? certifiedIcon : notcertifiedIcon));
                        break;
                    default:
                        break;
                }
            }
            // If user selects cancel or close...

        } while(!(userSelection == null)); // Keeps looping until user selects cancel or close.
    }

    /**
     * This method prints out concise details of Modules that are offered by the
     * institution in tabular form.
     *
     */
    public static void printModules() {
        // For loop to print spaces.
        for(int counter = 0; counter < 23; counter++) {
            System.out.print(" ");
        }
        // Top border for table name.
        System.out.print("=====================\n");

        // For loop to print spaces.
        for(int counter = 0; counter < 23; counter++) {
            System.out.print(" ");
        }
        // Table's title.
        System.out.print("|| Modules Offered ||\n");

        // For loop to print the top of the table.
        for(int counter = 0; counter < 67; counter++) {
            System.out.print("=");
        }
        System.out.println();

        // This part prints out the categories of the table.
        String categories = ("|| " + String.format("%-14s", "Module Type") + " |");
        categories += ("| " + String.format("%-27s", "Title") + " |");
        categories += ("| " + String.format("%-7s", "Code") + " |");
        categories += ("|" + String.format("%-3s", "Lvl") + "||");
        System.out.println(categories);

        // For loop to print the categories border of the table.
        for(int counter = 0; counter < 67; counter++) {
            System.out.print("-");
        }
        System.out.println();

        // ***For each loop to print all the modules.***
        for(Module paper : course.getSemesterOfferings()) {
            System.out.println(paper);
        }

        // For loop to print the bottom of the table.
        for(int counter = 0; counter < 67; counter++) {
            System.out.print("=");
        }
        System.out.println();
    }

    /**
     * Returns a Student object containing a student's name, an array of Result
     * objects, and number of Results. Information that can be used to display
     * their achievements (transcript).
     *
     * This method also adds modules undertaken by the student and its
     * corresponding grade by calling the add result to transcript method from
     * Student class.
     *
     * @return A Student object containing usable information
     *
     */
    public static Student axel() {
        // Axel does not meet Level 1 passed modules requirements.

        // Creates a new instance of a Student.
        Student axel = new Student("Axel");

        // Adds results to Student object. Uses the lookup feature from 
        // TechnicalSchool class (returns a Module).
        axel.addResultToTranscript(course.lookup("PROG101"), Grade.BPLUS);
        axel.addResultToTranscript(course.lookup("STAT102"), Grade.C);
        axel.addResultToTranscript(course.lookup("DATA222"), Grade.A);
        axel.addResultToTranscript(course.lookup("INSY313"), Grade.AMINUS);
        axel.addResultToTranscript(course.lookup("WEBS332"), Grade.A);

        axel.addResultToTranscript(course.lookup("TECH103"), Grade.D);
        axel.addResultToTranscript(course.lookup("MODC233"), Grade.B);
        axel.addResultToTranscript(course.lookup("TOPG233"), Grade.B);
        axel.addResultToTranscript(course.lookup("PROJ399"), Grade.CMINUS);
        axel.addResultToTranscript(course.lookup("EXTO396"), Grade.C);

        // Returns the instantiated Student object to caller. 
        return axel;
    }

    /**
     * Returns a Student object containing a student's name, an array of Result
     * objects, and number of Results. Information that can be used to display
     * their achievements (transcript).
     *
     * This method also adds modules undertaken by the student and its
     * corresponding grade by calling the add result to transcript method from
     * Student class.
     *
     * @return A Student object containing usable information
     *
     */
    public static Student kate() {
        Student kate = new Student("Kate");

        kate.addResultToTranscript(course.lookup("PROG101"), Grade.APLUS);
        kate.addResultToTranscript(course.lookup("STAT102"), Grade.AMINUS);
        kate.addResultToTranscript(course.lookup("TECH103"), Grade.BPLUS);
        kate.addResultToTranscript(course.lookup("MODC233"), Grade.A);
        kate.addResultToTranscript(course.lookup("TOPG233"), Grade.C);

        kate.addResultToTranscript(course.lookup("DATA222"), Grade.A);
        kate.addResultToTranscript(course.lookup("INSY313"), Grade.BPLUS);
        kate.addResultToTranscript(course.lookup("WEBS332"), Grade.AMINUS);
        kate.addResultToTranscript(course.lookup("PROJ399"), Grade.B);
        kate.addResultToTranscript(course.lookup("EXTO396"), Grade.B);

        return kate;
    }

    /**
     * Returns a Student object containing a student's name, an array of Result
     * objects, and number of Results. Information that can be used to display
     * their achievements (transcript).
     *
     * This method also adds modules undertaken by the student and its
     * corresponding grade by calling the add result to transcript method from
     * Student class.
     *
     * @return A Student object containing usable information
     *
     */
    public static Student jim() {
        Student jim = new Student("Jim");

        jim.addResultToTranscript(course.lookup("PROG101"), Grade.A);
        jim.addResultToTranscript(course.lookup("STAT102"), Grade.BPLUS);
        jim.addResultToTranscript(course.lookup("DATA222"), Grade.CPLUS);
        jim.addResultToTranscript(course.lookup("PROG202"), Grade.C);
        jim.addResultToTranscript(course.lookup("INSY313"), Grade.C);

        jim.addResultToTranscript(course.lookup("WEBS332"), Grade.CPLUS);
        jim.addResultToTranscript(course.lookup("TECH103"), Grade.CMINUS);
        jim.addResultToTranscript(course.lookup("THEO111"), Grade.D);
        jim.addResultToTranscript(course.lookup("MODC233"), Grade.APLUS);
        jim.addResultToTranscript(course.lookup("TOPG233"), Grade.A);

        jim.addResultToTranscript(course.lookup("LOGI321"), Grade.B);
        jim.addResultToTranscript(course.lookup("PROJ399"), Grade.BMINUS);
        jim.addResultToTranscript(course.lookup("EXTO396"), Grade.APLUS);

        return jim;
    }

    /**
     * Returns a Student object containing a student's name, an array of Result
     * objects, and number of Results. Information that can be used to display
     * their achievements (transcript).
     *
     * This method also adds modules undertaken by the student and its
     * corresponding grade by calling the add result to transcript method from
     * Student class.
     *
     * @return A Student object containing usable information
     *
     */
    public static Student robin() {
        // Robin does not meet Level 1 and 3 passed modules requirement.
        Student robin = new Student("Robin");

        robin.addResultToTranscript(course.lookup("PROG101"), Grade.C);
        robin.addResultToTranscript(course.lookup("DATA222"), Grade.C);
        robin.addResultToTranscript(course.lookup("INSY313"), Grade.CPLUS);
        robin.addResultToTranscript(course.lookup("WEBS332"), Grade.CPLUS);
        robin.addResultToTranscript(course.lookup("TECH103"), Grade.CPLUS);

        robin.addResultToTranscript(course.lookup("MODC233"), Grade.CMINUS);
        robin.addResultToTranscript(course.lookup("TOPG233"), Grade.CMINUS);
        robin.addResultToTranscript(course.lookup("PROJ399"), Grade.APLUS);

        return robin;
    }

    /**
     * Returns a Student object containing a student's name, an array of Result
     * objects, and number of Results. Information that can be used to display
     * their achievements (transcript).
     *
     * This method also adds modules undertaken by the student and its
     * corresponding grade by calling the add result to transcript method from
     * Student class.
     *
     * @return A Student object containing usable information
     *
     */
    public static Student ahmed() {
        // Ahmed does not meet Level 2 Self-Study criteria.
        Student ahmed = new Student("Ahmed");

        // Test for lookup method's case-sensitivity.
        ahmed.addResultToTranscript(course.lookup("prOG101"), Grade.D);
        ahmed.addResultToTranscript(course.lookup("Prog101"), Grade.BPLUS);
        ahmed.addResultToTranscript(course.lookup("tECh103"), Grade.B);
        ahmed.addResultToTranscript(course.lookup("thEO111"), Grade.CPLUS);
        ahmed.addResultToTranscript(course.lookup("daTA222"), Grade.B);

        ahmed.addResultToTranscript(course.lookup("prog202"), Grade.BMINUS);
        ahmed.addResultToTranscript(course.lookup("topg233"), Grade.APLUS);
        ahmed.addResultToTranscript(course.lookup("insy313"), Grade.CMINUS);
        ahmed.addResultToTranscript(course.lookup("webs332"), Grade.APLUS);
        ahmed.addResultToTranscript(course.lookup("logi321"), Grade.C);

        ahmed.addResultToTranscript(course.lookup("proj399"), Grade.AMINUS);

        return ahmed;
    }

    /**
     * Returns a Student object containing a student's name, an array of Result
     * objects, and number of Results. Information that can be used to display
     * their achievements (transcript).
     *
     * This method also adds modules undertaken by the student and its
     * corresponding grade by calling the add result to transcript method from
     * Student class.
     *
     * @return A Student object containing usable information
     *
     */
    public static Student mary() {
        Student mary = new Student("Mary");

        mary.addResultToTranscript(course.lookup("PROG101"), Grade.APLUS);
        mary.addResultToTranscript(course.lookup("STAT102"), Grade.C);
        mary.addResultToTranscript(course.lookup("THEO111"), Grade.AMINUS);
        mary.addResultToTranscript(course.lookup("DATA222"), Grade.AMINUS);
        mary.addResultToTranscript(course.lookup("PROG202"), Grade.A);

        mary.addResultToTranscript(course.lookup("MODC233"), Grade.CPLUS);
        mary.addResultToTranscript(course.lookup("TOPG233"), Grade.BPLUS);
        mary.addResultToTranscript(course.lookup("INSY313"), Grade.B);
        mary.addResultToTranscript(course.lookup("WEBS332"), Grade.BMINUS);
        mary.addResultToTranscript(course.lookup("LOGI321"), Grade.AMINUS);

        mary.addResultToTranscript(course.lookup("EXTO396"), Grade.A);

        return mary;
    }

    /**
     * Returns a Student object containing a student's name, an array of Result
     * objects, and number of Results. Information that can be used to display
     * their achievements (transcript).
     *
     * This method also adds modules undertaken by the student and its
     * corresponding grade by calling the add result to transcript method from
     * Student class.
     *
     * @return A Student object containing usable information
     *
     */
    public static Student ashley() {
        // Ashley does not meet Level 3 Taught requirements.
        Student ashley = new Student("Ashley");

        ashley.addResultToTranscript(course.lookup("PROG101"), Grade.APLUS);
        ashley.addResultToTranscript(course.lookup("STAT102"), Grade.AMINUS);
        ashley.addResultToTranscript(course.lookup("THEO111"), Grade.APLUS);
        ashley.addResultToTranscript(course.lookup("DATA222"), Grade.APLUS);
        ashley.addResultToTranscript(course.lookup("PROG202"), Grade.APLUS);

        ashley.addResultToTranscript(course.lookup("MODC233"), Grade.AMINUS);
        ashley.addResultToTranscript(course.lookup("TOPG233"), Grade.A);
        ashley.addResultToTranscript(course.lookup("INSY313"), Grade.AMINUS);
        ashley.addResultToTranscript(course.lookup("LOGI321"), Grade.APLUS);
        ashley.addResultToTranscript(course.lookup("PROJ399"), Grade.APLUS);

        ashley.addResultToTranscript(course.lookup("EXTO396"), Grade.A);

        return ashley;
    }

    /**
     * Returns a Student object containing a student's name, an array of Result
     * objects, and number of Results. Information that can be used to display
     * their achievements (transcript).
     *
     * This method also adds modules undertaken by the student and its
     * corresponding grade by calling the add result to transcript method from
     * Student class.
     *
     * @return A Student object containing usable information
     *
     */
    public static Student laura() {
        Student laura = new Student("Laura");

        laura.addResultToTranscript(course.lookup("PROG101"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("STAT102"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("TECH103"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("THEO111"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("DATA222"), Grade.APLUS);

        laura.addResultToTranscript(course.lookup("PROG202"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("MODC233"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("TOPG233"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("INSY313"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("WEBS332"), Grade.APLUS);

        laura.addResultToTranscript(course.lookup("LOGI321"), Grade.APLUS);
        laura.addResultToTranscript(course.lookup("EXTO396"), Grade.APLUS);

        return laura;
    }
}
