
/**
 * Write a description of class ChristmasTree here.
 * This class takes in 2 parameters and uses those parameters to draw a Christmas tree. 
 * 
 * @author Ramya Nagarajan 
 * @version 09/28/2015
 */
public class ChristmasTree
{
    public static void drawTree(int segHeight, int segsPerTree) {
        int segNum = 1; //keeps track of which segment of the tree the code is drawing
        int starNum = 1; //keeps track of number of stars per row
        int longestRow = (segHeight*segsPerTree) + 1; //important for keeping track of spaces
        //outermost loop keeps track of segments per tree
        for (int i = 0; i < segsPerTree; i++) {
            //keeps track of number of height of segment
            for (int j = 0; j < segHeight; j++) {
                int spaces = ((longestRow - starNum)/2) + 1;
                //keeps track of spaces per row
                for (int k = 1; k <= spaces; k++) {
                    System.out.print(" "); 
                }
                //keeps track of stars per row
                for (int l = 1; l <= starNum; l++) {
                    System.out.print("*"); 
                }
                System.out.println(" "); 
                starNum+=2; 
                 
            }
            //increments the segment the code is drawing & changes starNum appropriately
            segNum+=2; 
            starNum = segNum; 
            
        }
        //draws bottom stars to make the stem
        int stemSpaces = ((longestRow-1)/2) + 1; 
        for (int i = 0; i < 2; i++) {
            for (int p = 0; p < stemSpaces; p++) {
                System.out.print(" "); 
            }
            System.out.print("*"); 
            System.out.println(" ");
        }
        //draws base of tree
        int baseSpaces = ((longestRow - 7)/2) +1;
        for (int q = 0; q < baseSpaces; q++) {
            System.out.print(" "); 
        }
        for (int i = 0; i < 7; i++) {
            System.out.print("*"); 
        }
        
        
}
    public static void main(String[] args) {
        drawTree(5,2); 
    }
}
