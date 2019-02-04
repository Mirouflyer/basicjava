
package javabasic1;

public class SodaSong {

	public static void main(String[] args) {
		int sodaNum = 5;
		String word = " bottles";
		
		while (sodaNum > 0) {
			

        if (sodaNum == 1) {
      		word = "last bottles ";
			}
			
			
			
			System.out.println(sodaNum+ "" + word + "of soda on the wall");
			System.out.println(sodaNum + "" + word + " of soda.");
			System.out.println("Take one down.");
			System.out.println("Pass it around");
		    sodaNum -- ;
		
		} // end while method 
		if (sodaNum > 0) {
		    System.out.println(sodaNum + "" + word + "Of soda on the wall");	    
	    } else {
	    	System.out.println("No more botteles of soda on the wall");
	    } // end else
		
		
		
	}// end main method 

} // end class
