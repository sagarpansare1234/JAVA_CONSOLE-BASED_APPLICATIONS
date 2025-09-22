package star_pattern_displayer;

import java.util.Scanner;

public class app {
	/**********************************************************************************************/
	//welcome page
   public static void home() {
	   seperator();
	   System.out.println("Welcome to Star-Pattern Displayer\n");
	 
	   System.out.println("Do you want to Enter (Y/N) : ");
	   String choice = ip().next();
	   switch(choice) {
	   case "Y":
		   first_layer();
	   case "N":
		   home();
	   default:
		     System.out.println("Wrong Choice!, should be (Y/N)");
		     home();
	   
	   }
   }
   /**********************************************************************************************/
  	//seperator
   public static void seperator() {
	   System.out.println("\n  /**********************************************************************************************/ \n");
   }
   /**********************************************************************************************/
	//input from user give to other methods from here
	public static Scanner ip() {
	
		Scanner sc = new Scanner(System.in);
		
		return sc;
	}
	/**********************************************************************************************/
	//first layer
    public static void first_layer() {
    	seperator();
       // loop:
    	for(;;) {
    		System.out.println("Menu:");
    		System.out.println("1 for Star Filled Type Pattern");
    		System.out.println("2 for Star Hollow Type Pattern");
    		System.out.println("3 for Star Number Type Pattern\n");
    		System.out.println("4 for Home");
    		System.out.println("Enter Your Choice : ");
    		int a = ip().nextInt();
    		switch(a) {
    		case 1:
    			second_layer_f();
    			break;
    		case 2:
    			second_layer_h();
    			break;
    		case 3:
    			second_layer_n();
    			break;
    		case 4: 
    			//break loop; //if needed
    			home();
    			break;
    		default:
    			System.out.println("Wrong Choice");
    		}
    		
    	}
    }
    /**********************************************************************************************/
    //returns an object
    public static main_logic obj() {
    	main_logic o = new main_logic();
    	return o;
    }
    /**********************************************************************************************/
    //second layer
    
    //////////////////////////////////////////
    //filled type 
    public static void second_layer_f() {
    	seperator();
    	System.out.println("Filled Type Patterns\n");
    	for(;;) {
    		System.out.println("1 for Filled Square");
    		System.out.println("2 for Right Angled Triangle");
    		System.out.println("3 for Filled rectangle");
    		System.out.println("4 for Home");
    		System.out.println("5 for going back");
    		System.out.println("Enter Your Choice : ");
    		int a = ip().nextInt();
    		switch(a) {
    		case 1:
    			obj().filled_square();
    			break;
    		case 2:
    			obj().rat();
    			break;
    		case 3:
    			System.out.println("Still in process");
    			break;
    		case 4: 
    			//break loop; //if needed
    			home();
    			break;
    		case 5 :
    			first_layer();
    		default:
    			System.out.println("Wrong Choice");
    		}
    	}
    }
    //////////////////////////////////////////
    //Hollow type
    public static void second_layer_h() {
    	seperator();
    }
    //////////////////////////////////////////
    //Numerical type
    public static void second_layer_n() {
    	seperator();
    }
    /**********************************************************************************************/
	public static void main(String[] args) {
		String a= "JAVA";
		String b="JVA";
		System.out.println(a==b);
		home();
	}

}

