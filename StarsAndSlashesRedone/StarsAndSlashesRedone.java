

/**
 * Write a description of class StarsAndSlashes here.
 * StarsAndSlashesRedone prints the answer to PP2.1. 
 * 
 * @Ramya Nagarajan 
 * @10/03/15
 */
public class StarsAndSlashesRedone {
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        //outer loop controls number of rows in code 
        // i starts at 6 and decrements because it is easier to control the number of slashes and stars this way 
        for (int i = 6; i > 0; i--) {
            /*j - i is used to control the number of stars printed; this number varies with 
             * each line of code
             */ 
            for (int j = 0; j < i; j++) {
                System.out.print("*"); 
            }
            /* k < 7-i is the relationship between i and the number of spaces before and after
            the slashes in each line */ 
            for (int k = 0; k < (7-i); k++) {
                System.out.print(" "); 
            }
            // l < (i*2) represents the number of front slashes per line 
            for (int l = 0; l < (i*2); l++) {
                System.out.print("/"); 
            }
            /* m < 6*i - 2 controls the number of backslashes per line; as the number of front 
            slashes decreases the number of back slashes decreases hence the 6-i*/
            for (int m = 0; m < ((6-i)*2); m++) {
                System.out.print("\\"); 
            }
            //n controls the number of spaces at the end of the line; same as the variable k loop
            for (int n = 0; n < 7 - i; n++) {
                System.out.print(" "); 
            }
            // p controls the number of stars printed at end of line; same as variable j loop
            for (int p = 0; p < i; p++) {
                System.out.print("*"); 
            }
            //makes sure each incrementation of the outer loop (variable i) starts at the next line 
            System.out.println(" "); 
        }
        
    }
}
