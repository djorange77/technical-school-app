package orclandInstituteOfTechnologyApp;

/**
 * The Module class manages a set of attributes that correlates 
 * to a paper/module. Corresponding attributes include a
 * type, title, code, and a level. This class contains several
 * get and set methods that will be used to initialise the
 * Object's instance variables. It also possesses a toString 
 * method which returns the code of the paper (module).
 * 
 * @author Foong : Amos (18044418) 
 **/
public class Module 
{
	private String title;
	private String code;
	private Level level;
	private ModuleType type;
	
	/**
	 * The default constructor for Module class. It receives 
	 * a set of information passed in from caller and 
	 * initialises it to the Object's instance attributes  
	 * by calling appropriate set (mutator) methods. 
	 * 
	 * @param type : paper's (module) classification 
	 * @param title : a title for the paper (module)
	 * @param code : paper code for the module
	 * @param level : difficulty of the paper (module)
	 **/
	public Module(ModuleType type, String title, String code, Level level)
	{
		this.setType(type);
		this.setTitle(title);
		this.setCode(code);
		this.setLevel(level);
	}

	
	// Getter and setter methods for Object's instance data.
	//--------------------------------------------------------
	/**
	 * Returns a String object that can be used to identify 
	 * the full title of the paper.
	 * 
	 * This method accesses the Module's instance object 
	 * called "title" (String) and returns it to caller.
	 * 
	 * @return title : title of the module (paper)
	 **/
	public String getTitle() 
	{
		return this.title;
	}

	/**
	 * This method allows other classes to set/modify the title 
	 * of the module. It also validates the fed-in parameter  
	 * from the caller (If the input parameter is empty, it 
	 * will assign "UNKNOWN" as its title).
	 * 
	 * @param title : module title fed in from the caller
	 **/
	public void setTitle(String title) 
	{
		this.title = (title.isEmpty()? "UNKNOWN":title);
	}
	//--------------------------------------------------------
	/**
	 * Returns a String object that can be used to identify 
	 * the paper's (module) code.
	 * 
	 * This method accesses the Module's instance object 
	 * called "code" and returns it to the caller.
	 *   
	 * @return code : paper code of the module
	 **/
	public String getCode() 
	{
		return this.code;
	}

	/**
	 * This method allows other classes to set/modify the  
	 * paper code of the module. It also validates the fed-in   
	 * parameter from the caller (If the input parameter is  
	 * empty, it will assign "UNKNOWN" as its code).
	 * 
	 * @param code : paper code fed in from the caller
	 **/
	public void setCode(String code) 
	{
		this.code = (code.isEmpty()? "UNKNOWN":code);
	}
	//--------------------------------------------------------
	/**
	 * Returns an enumeration (typed Level) which can be used to
	 * describe the difficulty of the specific paper (module).  
	 * 
	 * This method accesses the Module's instance data called 
	 * "level" and returns the assigned value to caller.
	 *   
	 * @return level : the difficulty of the paper (Module)
	 **/
	public Level getLevel() 
	{
		return this.level;
	}

	/**
	 * This method allows other classes to set/modify 
	 * the difficulty (Level) of the paper (module). 
	 * 
	 * @param level : A level passed in from caller
	 **/
	public void setLevel(Level level) 
	{
		this.level = level;
	}
	//--------------------------------------------------------
	/**
	 * Returns an enumeration (typed ModuleType) which can 
	 * be used to classify the type of the paper (module).  
	 * 
	 * This method accesses the Module's instance data called 
	 * "type" and returns the assigned value to caller.
	 * 
	 * @return type : the classification of the paper (module)
	 **/
	public ModuleType getType() 
	{
		return this.type;
	}

	/**
	 * This method allows other classes to set/modify (mutate) 
	 * the paper's (module) classification (ModuleType). 
	 * 
	 * @param type : the classification of the paper (module)
	 **/
	public void setType(ModuleType type) 
	{
		this.type = type;
	}
	//--------------------------------------------------------
	
	
	/**
	 * Returns beautiful text representation of the Module's 
	 * details in tabulated form (optimised to be displayed 
	 * as a table).
	 * 
	 * This method accesses the Module's instance data 
	 * to procure the paper type, title, code, and level.   
	 * It then arranges them nicely with borders and 
	 * sufficient spacing between each other, and finally
	 * it returns the arranged data as a String to caller.  
	 * 
	 * @return A String object containing details of the 
	 * 			Module in tabulated form.
	 **/
	@Override
	public String toString()
	{	
		// The String object contains a tabulated form of the Module's details.  
		String module = ("|| " + String.format("%-14s", this.getType()) + " |");
		module += ("| " + String.format("%-27s", this.getTitle()) + " |");
		module += ("| " + String.format("%-7s", this.getCode()) + " |");
		module += ("| " + String.format("%-1s", this.getLevel()) + " ||");
		
		return module;
	}
}
