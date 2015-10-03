
/**
 * This code prints a flower pot quilt (uses paramteres and for loops) 
 * @Ramya Nagarajan
 * 10/02/2015
 */
public class FlowerPot
{
   public static void main(String[] args) {
       flowerPotQuilt(3,4); 
       
    }
    public static void flowerPotQuilt(int width, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                drawFlowerPot(); 
            }
        System.out.println(""); 
        }
    }
    public static void drawFlowerPot() {
       System.out.println("      (^)"); 
       System.out.println(" (^) ( o ) (^)"); 
       System.out.println("( o ) (_) ( o )"); 
       System.out.println(" (_)  ( )  (_)"); 
       System.out.println(" ( ) ( o ) ( )"); 
       System.out.println("( o ) (_) ( o )"); 
       System.out.println(" (_)\\  |  /(_)"); 
       System.out.println("   \\ \\ |  / /"); 
       System.out.print("  ."); 
       for (int i = 3; i <= 11; i++) {
           System.out.print("_");
       }
       System.out.println("."); 
       System.out.println("  (___( )___)"); 
       System.out.println("   \\ ( o ) /"); 
       System.out.println("    \\ ( ) /"); 
       System.out.print("     "); 
       for (int i = 0; i < 5; i++) {
           System.out.print("_"); 
       }
    }
        
}
