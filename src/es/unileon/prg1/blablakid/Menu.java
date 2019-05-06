package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import javax.swing.*;
import java.io.*;

/**
 * Class that represents the user's text interface.
 * 
 * @author Team 5F
 *
 */

public class Menu {
	
	/**
	 * 
	 * A logger is created for the Menu class.
	 * 
	 */
	static final Logger log = LogManager.getLogger(MainBlablakid.class);
	
	/**
	 * 
	 * Identifier of the chosen option.
	 * 
	 */
	private int option;
	
	/**
	 * 
	 */
	private Parent parent;

	/**
	 * 
	 * Method of the class. Returns the option by keyboard the menu by screen.
	 * 
	 */
	public int optionMenu() {
		System.out.println("Choose an option: ");
		option = Teclado.readInteger();
		log.info("The chosen option is " + option);
		return option;
	}
	
	/**
	 * 
	 * Method of the class. Prints the Menu.
	 * 
	 */
	public void showMenu() {
		System.out.println("---------\n");
		System.out.println("Blablakid\n");
		System.out.println("---------\n");
		System.out.println("Select an option:\n");
		System.out.println("1 - Add kid.\n");
		System.out.println("2 - Remove kid.\n");
		System.out.println("3 - Add parent.\n");
		System.out.println("4 - Remove parent.\n");
		System.out.println("5 - Add activity.\n");
		System.out.println("6 - Remove activity.\n");
		System.out.println("7 - Add ride.\n");
		System.out.println("8 - Remove ride.\n");
		System.out.println("9 - Show summary.\n");
		System.out.println("10 - Check status.\n");
		System.out.println("0 - Exit.\n");
	}
	
	/**
	 * 
	 * Method of the class. Initialize the aplication.
	 * @throws BlablakidException
	 * 			The exception is thrown.
	 * 
	 */
	public void start() throws BlablakidException {
		log.info("Entering the App.");
		System.out.println("---------\n");
		System.out.println("");
		System.out.println("---------\n");
		log.info("Showing Menu.");
		this.showMenu();
		this.option = this.optionMenu();
		this.execute(this.option);
		
		while(this.option != 0) {
			System.out.println("---------\n");
			System.out.println("");
			System.out.println("---------\n");
			this.showMenu();
			this.option = this.optionMenu();
			this.execute(this.option);
		}
		
		System.out.println("End of the program.");
		log.exit();

	}
	
	/**
	 * 
	 * Method of the class. Execute the chosen option.
	 * @param option
	 * 			Identifier of the chosen option.
	 * @throws BlablakidException
	 * 			The exception is thrown.
	 * 
	 */
	public void execute(int option) throws BlablakidException {
		log.entry();
		switch(this.option) {
		
		case 1:	//add kid
			
			System.out.println("Name of the kid to add.\n");
			String kidName = Teclado.readString();
			log.info("The kid's name has been entered." + kidName);
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 2:	// remove kid
			
			System.out.println("Name of the kid to remove.\n");
			String removeKidName = Teclado.readString();
			log.info("The kid's name has been entered." + removeKidName);
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());

			}
			break;
			
		case 3:	//add parent
			
			System.out.println("Name of the parent to add.\n");
			String parentName = Teclado.readString();
			log.info("The kid's name has been entered." + parentName);
			
			System.out.println("How many kids does " + parent.getName() + " have?\n");
			int numKids = Teclado.readInteger();
			log.info("The number of kids the parent has has been introduced.");
			
			System.out.println("How many rides can " + parent.getName() + " make per day?\n");
			int numRides = Teclado.readInteger();
			log.info("The number of rides the parent has has been introduced.");
			
			/*System.out.println("Who is " + parent.getName() + "'s kid number 01?\n");
			
			log.info();*/
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 4:	// remove parent
			
			System.out.println("Name of the parent to remove.\n");
			String removeParentName = Teclado.readString();
			log.info("The kid's name has been entered." + removeParentName);
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 5:	//add activity
			
			System.out.println("Name of the activity to add.\n");
			String ActivityName = Teclado.readString();
			log.info("The kid's name has been entered." + ActivityName);
			
			System.out.println("Where does the activity " + act + " takes place?\n");
			String place = Teclado.readString();
			log.info("The activity place has been introduced." + place);
			
			System.out.println("Day of the week for the activity: \n");
			
			log.info("The day of the week has been introduced.");
			
			System.out.println("Name of the kid taking the activity\n");
			String nameKid = Teclado.readString();
			log.info("The name of the kid taking the activity has been introduced.\n" + nameKid);
			
			System.out.println("When does the activity end?\n");
			
			log.info("The finish hour of the activity has been introduced.");
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 6:	//remove activity
			
			System.out.println("Name of the kid taking the activity to remove.\n");
			String removeNameKid = Teclado.readString();
			log.info("The name of the kid to remove has been introduced." + removeNameKid);
			
			System.out.println("Name of the activity to remove.\n");
			String removeActivityName = Teclado.readString();
			log.info("The kid's name has been entered." + removeActivityName);
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 7:	//add ride
			System.out.println("Name of the parent in charge of the ride.\n");
			String parentRideName = Teclado.readString();
			log.info("The parent's name in charge of the ride has been entered." + parentRideName);
			
			System.out.println("Name of the activity of the ride.\n");
			String activityName = Teclado.readString();
			log.info("The name of the activity of the ride has been introduced." + activityName);
			
			System.out.println("Where does the ride start?\n");
			String startPlace = Teclado.readString();
			log.info("The place where the ride starts has been introduced." + startPlace);
			
			System.out.println("Where does the ride end?\n");
			String endPlace = Teclado.readString();
			log.info("The place where the ride ends has been introduced." + endPlace);
			
			System.out.println("Day of the week for the ride.\n");
			
			log.info("The day of the week for the ride has been introduced.");
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 8:	//remove ride
			
			System.out.println("Name of the parent in charge of the ride.\n");
			String removeParentRideName = Teclado.readString();
			log.info("The parent's name in charge of the ride has been entered." + removeParentRideName);
			
			System.out.println("Day of the week for the ride.\n");
			
			log.info("The day of the week for the ride has been introduced.");
			
			System.out.println("Where does the ride start?");
			String PlaceStartRide = Teclado.readString();
			log.info("The place where the ride starts has been introduced." + PlaceStartRide);
			
			System.out.println("Where does the ride end?");
			String PlaceEndRide = Teclado.readString();
			log.info("The place where the ride ends has been introduced." + PlaceEndRide)
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 9:	//show summary
			
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 10: //check status
			
			
			try {
				
			}catch(BlablakidException error) {
				System.out.println(error.getMessage());
			}
			break;
			
		case 0:	//exit
			
			System.out.println("Goodbye.\n");
			break;
			
		}
		log.exit();
	}
	
	
	
	/*
	String menu;

	public Menu() {		
	}

	public int obtenerOpcionMainBlablakid() throws IOException {
		menu=  "Blablakid:\n";
		menu+= "1 - Add kid.\n";
		menu+= "2 - Remove kid.\n";
		menu+= "3 -	Add parent.\n";
		menu+= "4 - Remove parent.\n";
		menu+= "5 - Add activity.\n";
		menu+= "6 - Remove activity.\n";
		menu+= "7 - Add ride.\n";
		menu+= "8 - Remove ride.\n";
		menu+= "9 - Show summary.\n";
		menu+= "10 - Check status.\n";
		menu+= "0 - Exit.\n";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
		
	}

	public String obtenerNomKid() throws IOException{
		
		menu= "Name of the kid to add\n";
		
		return JOptionPane.showInputDialog(menu);
				
	}

	public String removeKid() throws IOException{
		
		menu = "Name the kid to remove\n";
		
		return JOptionPane.showInputDialog(menu);
	}

	public String addParent() throws IOException{
		
		menu = "Name of the parent to add\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu = "How many kids does " + padre + " have?\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu = "How many rides can " + padre + " make per day?\n";	
				
		return JOptionPane.showInputDialog(menu);
		
		menu= "Who is " + padre + "'s kid number 01?\n";
		
		return JOptionPane.showInputDialog(menu);
				
	}

	public String removeParent() throws IOException{
		
		menu = "Name of the parent to remove\n";
		
		return JOptionPane.showInputDialog(menu);
		
	}

	public String addActivity() throws IOException{
		
		menu = "Name of the activity\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu = "Where does the activity " + act + " takes place";
		
		return JOptionPane.showInputDialog(menu);
		
		menu = "Day of the week for the activity: \nInsert the number of the day of the week: \n0 - Monday \n1 - Tuesday \n2 - Wenesday \n3 - Thursday\n4 - Friday\n";
				
		return JOptionPane.showInputDialog(menu);
		
		menu = "Name of the kid taking the activity\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu = "When does the activity end? \nInsert hour:\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu = "Insert minute:\n";
		
		return JOptionPane.showInputDialog(menu);	
		
	}

	public String removeActivity() throws IOException{
		
		menu= "Name of the kid taking the activity to remove:\n ";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Name of the activity to remove:\n";
		
		return JOptionPane.showInputDialog(menu);
				
	}

	public String addRide() throws IOException{
		
		menu= "Name of the parent in charge of the ride\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu="Name of the activity of the ride\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Where does the ride start?\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Where does the ride end?\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "When does the ride start?\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Insert hour\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Insert minute\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Day of the week for the ride: \nInsert the number of the day of the week: \n0 - Monday \n1 - Tuesday \n2 - Wenesday \n3 - Thursday\n4 - Friday\n";
		
		return JOptionPane.showInputDialog(menu);
		
	}

	public String removeRide() throws IOException{
		
		menu= "Name of the parent in charge of the ride\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Day of the week for the ride: \nInsert the number of the day of the week: \n0 - Monday \n1 - Tuesday \n2 - Wenesday \n3 - Thursday\n4 - Friday\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Where does the ride start?\n";
		
		return JOptionPane.showInputDialog(menu);
		
		menu= "Where does the ride end?\n";
		
		return JOptionPane.showInputDialog(menu);
	}
	*/


	
	

	
	
}



