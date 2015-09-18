
/**
 * Write a description of class Hourglass here.
 * 
 * Ramya Nagarajan
 * 09/18/15
 */
public class Hourglass {
    public static void main(String [] args) {
        topHalf(); 
        
    }
    public static void topHalf() {
        System.out.print("|"); 
        for (int i = 0; i < 10; i++) {
            System.out.print("\""); 
        }
        System.out.println("|"); 
        int largeNum = 8; 
        int smallNum = 0; 
        for (int i = 0; i < 4; i++) {
            System.out.print(" "); 
            System.out.print("\\"); 
            for (int j = 0; j < (largeNum - smallNum); j++) {
                System.out.print(":"); 
            }
            System.out.println("/"); 
            //System.out.println(" "); 
            largeNum--; 
            smallNum++; 
            for (int k = 0; k < smallNum; k++) {
                System.out.print(" "); 
            }
        }
    }

}
