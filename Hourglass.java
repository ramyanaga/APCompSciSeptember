
/**
 * This class draws an hourglass figure. 
 * 
 * Ramya Nagarajan
 * 09/21/15
 */
public class Hourglass {
    public static void main(String [] args) {
        firstLastLine(); 
        topHalf();
        System.out.println("     ||"); 
        bottomHalf(); 
        firstLastLine(); 
    }
    //the below method draws the top half of the hourglass excluding the very first line
    public static void topHalf() {
        
        int lineNumber = 4; /*keeps track of which line the code is printing (relative to top half/the first line is line #4)
        the lineNumber variables starts at 4 and decrements simply because the math works better starting at 4 
        */
        //the below "i" loop keeps track of the number of lines being printed
        for (int i = 0; i < 4; i++) {
            
                //the below "j" loop keeps track of spaces per line 
                for (int j = 0; j < i+1; j++) {
                    System.out.print(" "); 
                }
                System.out.print("\\"); 
                //the below "k" loop keeps track of the number of colons per line 
                for (int k = 0; k < lineNumber * 2; k++) {
                    System.out.print(":"); 
                }
                //decrementes the line of code being printed 
                lineNumber--; 
                System.out.println("/"); 
        }
    }
    //the below method prints the bottom half of the hourglass 
    public static void bottomHalf() {
        
        int kCheck = 1; //kCheck is used to end the k loop 
        // the below "i" loop keeps track of the number of lines being printed 
        for (int i = 4; i > 0; i--) {
            //the below "j" loop keeps track of spacing per line 
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            System.out.print("/"); 
            //the below k loop keeps track of colons per line 
            for (int k = 1; k <= kCheck*2; k++) {
                System.out.print(":"); 
            }
            kCheck++; 
            System.out.println("\\"); 
        }
            
        
    }
    //below method prints the first and last line of hourglass 
    public static void firstLastLine() {
        System.out.print("|"); 
        for (int i = 0; i < 10; i++) {
            System.out.print("\""); 
        }
        System.out.println("|"); 
    }

} 

