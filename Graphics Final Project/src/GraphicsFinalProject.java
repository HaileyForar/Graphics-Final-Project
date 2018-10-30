import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GraphicsFinalProject extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();

	public static void main(String[] args)
	    {
	    	
	    	userInput();
	    	frostingType();
	    	sprinkles();
	    	cupcakeLiner();
	    	endOfTheProgram();
	    	
	    }
	
	public static void userInput()
	{
	    //takes input
		name = JOptionPane.showInputDialog("What is your name?");  
		
		//responds to input above
		JOptionPane.showMessageDialog(frame, "Hi, " + name);
		JOptionPane.showMessageDialog(frame, "Today you will build your own cyber cupcake!");
		
		//buttons
		Object[] options = {"Vanilla", "Chocolate", "Strawberry"};
		className = JOptionPane.showOptionDialog(frame, "What base cake would you like it to be?",
				"Cake Base",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[2]);
		 
		//responds to button choice above
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "Ah, one who loves the classic vanilla I see...");
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "One who loves the velvety chocolate I see...");
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "Hmmm... one who dares to be different and have the sweet strawberry...");
				break;
				}
			}
	}
	
	public static void frostingType()
	{
		
		//drop-down menu
		final String[] genre = { "Cream Cheese", "Chocolate Buttercream", "Strawberry Glaze", "Vanilla Buttercream" };
		final JFrame frame = new JFrame();
	    String frostingType = (String) JOptionPane.showInputDialog(frame, 
	            "What type of frosting would you like?",
	            "Type of Frosting",
	            JOptionPane.QUESTION_MESSAGE, 
	            null, 
	            genre, 
	            genre[0]);
	}
	
	public static void sprinkles()
	{
	    
	  //buttons
	  		Object[] options1 = {"Heck Yes!!","Yes!" ,"No Thanks..." };
	  		className = JOptionPane.showOptionDialog(frame, "Would you like sprinkles on your cake?",
	  				"Sprinkles?",
	  				JOptionPane.YES_NO_CANCEL_OPTION,
	  				JOptionPane.QUESTION_MESSAGE,
	  				null, options1, options1[2]);
	  		
	  	   
	  	  //drop-down menu
	  	  		final String[] sprinkles = { "Rainbow", "Black and white", "I didn't want sprinkles" };
	  	  		final JFrame frame = new JFrame();
	  	  	    String sprinkleType = (String) JOptionPane.showInputDialog(frame, 
	  	  	            "What kind of sprinkles would you like?",
	  	  	            "Type of sprinkle",
	  	  	            JOptionPane.QUESTION_MESSAGE, 
	  	  	            null, 
	  	  	            sprinkles, 
	  	  	            sprinkles[0]);
	}
	
	public static void cupcakeLiner()
	{
	    
	  //drop-down menu
	  		final String[] liner = { "Pink-spotted", "Classy Black", "White and elegant", "Classic Brown" };
	  		final JFrame frame = new JFrame();
	  	    String linerType = (String) JOptionPane.showInputDialog(frame, 
	  	            "What color Cupcake liner would you like?",
	  	            "Type of liner",
	  	            JOptionPane.QUESTION_MESSAGE, 
	  	            null, 
	  	            liner, 
	  	            liner[0]);
	}
		public static void endOfTheProgram()
		{
			
	   //end of the program
			JOptionPane.showMessageDialog(frame, "Thank you for making a cyber cupcake!");
	   
	    }
	}
