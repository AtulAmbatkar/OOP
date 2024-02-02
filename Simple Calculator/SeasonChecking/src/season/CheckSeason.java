package season;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckSeason {
	
	public static void main(String[] args) {
		
	     Scanner scn = new Scanner(System.in);
	     int monthNumber ;
	     
	     while(true) {
	    	 try {
	    		 System.out.print("Enter the monthNumber: ");
	    		 String month = scn.nextLine();
	    		 
	    		 monthNumber =Integer.parseInt(month);
	    		 
	    		 if(monthNumber < 1 || 12 < monthNumber) {
	    			 throw new InputMismatchException();
	    		 }
	    		 break;
	    	 }catch(InputMismatchException e) {
	    		 System.out.println("please give right monthNumber in between (1 to 12)  ");
	    	 }
	     }
	   String season = null ; 
	   switch(monthNumber) {
	        
	      case 1 : 
	      case 2 :
	        season = "vasanth";
	        break;
	        
	      case 3 :
	      case 4 :
	    	season = "summer";
	    	break;
	    	
	      case 5:
	      case 6:
	    	season = "mansoons";
	    	break;
	    	
	      case 7:
	      case 8:
	    	season = "sharad";
	    	break;
	    	
	      case 9: 
	      case 10:
	    	 season = "hemantha";
	    	 break;
	    	 
	      case 11:
	      case 12:
	    	season = "winter";
	    	break;
	    	
	      default: 
	    	  season = "Invalid Number";
	     }
	   
	    System.out.println(season);
	    System.out.println("do you want you another season(y/n)"); 
	
	}

}