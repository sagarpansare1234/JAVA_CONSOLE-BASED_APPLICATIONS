package star_pattern_displayer;

public class main_logic {
	//r -> rows   c-> columns
	/**********************************************************************************************/
	//Pattern for Filled Square with stars.
	
      public void filled_square() {
    	  System.out.println("\n");
    	 for(int r=1;r<=5;r++) {
    		 for(int c=1;c<=5;c++) {
    			 System.out.print("*");
    		 }
    		 System.out.println("");
    	 }
    	 System.out.println("");
      }
    /**********************************************************************************************/ 
    //Pattern for Right Angled Triangle 
      public void rat() {
    	  System.out.println("\n");
    	 for(int r=1;r<=5;r++) {
    		 for(int c=1;c<=r;c++) {
    			 System.out.print("*");
    		 }
    		 System.out.println("");
    	 }
    	 System.out.println("");
      }
}

