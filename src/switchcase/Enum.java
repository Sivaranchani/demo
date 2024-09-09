package switchcase;
public class Enum {
public enum Day {  Sun,Mon, Wed, Thu, Fri, Sat,Tue  }    
public static void main(String args[])    
{    
  Day[] DayNow = Day.values();    
    for (Day Now : DayNow)    
    {    
         switch (Now)    
         {    
             case Sun:    
                 System.out.println("Sunday");    
                 break;    
             case Mon:    
                 System.out.println("Monday");    
                 break;          
             case Wed:
            	 System.out.println("Wednesday");   
            	 break;
             case Thu:    
                 System.out.println("Thursday");    
                 break;    
             case Fri:    
                 System.out.println("Friday");    
                 break;    
             case Sat:    
                 System.out.println("Saturday");    
                 break;
		default:
			break;    
         }    
     }    
 }   } 