package switchcase;

public class Switchcase {
	public static void main(String[] args) {    
	    //Specifying month number  
	    int month= 7;    
	    String monthString="";  
	    //Switch statement  
	    switch(month){    
	    //case statements within the switch block  
	    case 1: monthString="1 - January";  
	    break;    
	    case 2: monthString="2 - February";  
	    break;    
	    case 3: monthString="3 - March";  
	    break;    
	    case 4: monthString="4 - April";  
	    break;    
	    case 5: monthString="5 - May";  
	    break;    
	    case 6: monthString="6 - June";  
	    break;    
	    case 7: monthString="7 - July";  
	       
	    case 8: monthString="8 - August";  
	      
	    case 9: monthString="9 - September";  
	      
	    case 10: monthString="10 - October";  
	    break;   
	    case 11: monthString="11 - November";  
	  /*  break;    
	    case 12: monthString="12 - December";  
	    break;    
	    default:System.out.println("Invalid Month!");    */
	    }    
	    //Printing month of the given number  
	    System.out.println(monthString);  
	  
	
	int i = 10;

	String fName = String.valueOf(i);
	
	System.out.println(fName);
	
	
	
	}
	}
                       
/*The Java switch statement is fall-through. 
It means it executes all statements after the first match ,
if a break statement is not present.*/