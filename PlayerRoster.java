import java.util.Scanner;

public class PlayerRoster {

	public static final Scanner scnr = new Scanner(System.in);
	public static void main(String[] args) {
		int[] jersey_numbers_array = {0,0,0,0,0}; //array for the jersey's number
		int[] ratings_array = {0,0,0,0,0}; //array for ratings
		

		
		
		int count = 0; //counter for while loop to limit it to 5 iterations

		int player_lable_var = 1;

		
		//collects information
		while (count < 5) {

			System.out.println("Enter player " + player_lable_var +"'s jersey number:");

		int jersey = scnr.nextInt();

			jersey_numbers_array[count] = jersey;

			System.out.println("Enter player " + player_lable_var + "'s rating:");

			System.out.println("");

		int individual_rating = scnr.nextInt();

			ratings_array[count] = individual_rating;

			count += 1;

			player_lable_var +=1;

		}

			count = 0;

			player_lable_var = 1;
//prints output initially
			System.out.println("ROSTER");

		//prints out result
		while(count < 5) {

			System.out.println("Player " + player_lable_var + " -- Jersey number: " + jersey_numbers_array[count] + ","

			+ " Rating: " + ratings_array[count]);

			count += 1;

			player_lable_var += 1;

		}
		System.out.flush();
		//MEGA LOOP
		boolean loop;
		while(loop = true) {
			
		
		//MENU to prompt other options

		System.out.println("");
		System.out.println("MENU");
		System.out.println("u - Update player rating");
		System.out.println("a - Output players above a rating");
		System.out.println("r - Replace player");
		System.out.println("o - Output roster");
		System.out.println("q - Quit");
		System.out.println("");
		System.out.println("Choose an option:");
		
		//string for menu options
		String option = scnr.nextLine();
		String option1 = scnr.nextLine();
		
		if (option1.equals("u")) {
			//calls the method to Update a player's rating
			Update_player_rating(jersey_numbers_array, ratings_array);
		}
		if (option1.equals("a")) {
			
			//Output players above a rating
			Output_players_above_a_rating(jersey_numbers_array, ratings_array);	
		} 
		if (option1.equals("r")) {
			
			//calls the method to replace a specific player
			Replace_player(jersey_numbers_array, ratings_array);
		} 
		if (option1.equals("o")) {
			
			//prints Roster

			Output_roster(jersey_numbers_array, ratings_array);	
		} 
		
		
		if (option1.equals("q")) {
			
			//Quit

			System.exit(0);	
		} 

		
		}	
		
	}
		//creating a method that will update a specific player's rating


	  static void Update_player_rating(int[] jersey_numbers_array, int[] ratings_array) {		//Update player rating method
		  //Scanner scnr = new Scanner(System.in);
		  System.out.println("Enter a jersey number:");
		  int jersey_number = scnr.nextInt();
		  for(int i=1; i<= 5; i++) {

			  if (jersey_numbers_array[i-1] == jersey_number) {
				  System.out.println("Enter a new rating for player:");
				  int player_rating = scnr.nextInt();
				  ratings_array[i-1] = player_rating;

			  }
		  }

		  
		  }
	  
	  static void Replace_player(int[] jersey_numbers_array ,int[] ratings_array) { // replace a specific player
		  //Scanner scnr = new Scanner(System.in);
		  System.out.println("Enter a jersey number:");
		  int jersey_number = scnr.nextInt();

		  // for loop
		  for(int i=1; i<= 5; i++) {

			  if (jersey_numbers_array[i-1] == jersey_number) {
				  System.out.println("Enter a new jersey number:"); //asks for new jersey if og one exsists
				  int new_jersey_number = scnr.nextInt(); //gets user input for new jersey
				  jersey_numbers_array[i-1] = new_jersey_number; //replaces jersey number
				  
				  System.out.println("Enter a new rating for player:"); //replaces rating
				  int player_rating = scnr.nextInt();
				  ratings_array[i-1] = player_rating;
				  
			  }
		  }
		  //once it finishes and the player was not found
		  
		  
	  }
	  static void Output_players_above_a_rating(int[] jersey_numbers_array, int[] ratings_array) {
		  System.out.println("Enter a rating:");
		  int player_rating_limit = scnr.nextInt();
		  System.out.println("ABOVE " + player_rating_limit);
		  int count = 1;
		  while(count <= 5) {
			  if(ratings_array[count-1] > player_rating_limit) {
				  System.out.println("Player " + count + " -- Jersey number: "
			  + jersey_numbers_array[count-1] +  ", Rating: " + ratings_array[count-1]);
			  }
			  count += 1;
		  }
	  }
	  
	  static void Output_roster(int[] jersey_numbers_array, int[] ratings_array) {
		  int count = 1;
		  System.out.println("ROSTER");
		  while(count <= 5) {
			  System.out.println("Player " + count + " -- Jersey number: " + jersey_numbers_array[count-1] +
					  ", Rating: " + ratings_array[count-1]);
			  count += 1;
		  }
	  }
	  
	}

