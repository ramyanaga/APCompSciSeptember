
/**
 * Write a description of class StarsAndSlashes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarsAndSlashes {
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        for (int i = 6; i < 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); 
            }
            for (int k = 0; k < (7-i); k++) {
                System.out.print(" "); 
            }
            for (int l = 0; l < (i*2); l++) {
                System.out.print("/"); 
            }
            for (int m = 0; m < ((6-i)*2);m++) {
                System.out.print("\\"); 
            }
            for (int n = 0; n < 7 - i; n++) {
                System.out.print(" "); 
            }
            for (int p = 0; p < i; p++) {
                System.out.print("*"); 
            }
            System.out.println(" "); 
        }
        
    }
}
