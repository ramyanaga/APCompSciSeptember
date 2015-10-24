
/**
 * Write a description of class Homecoming here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Homecoming {
    public static void main(String[] args) {
        //getADate();
        damage();
    
    }
    public static String getADate() {
        System.out.println("Hi my name is Ramya"); 
        System.out.println("What's your name?"); 
        Scanner userInput = new Scanner(System.in); 
        String dateName = userInput.nextLine(); 
        System.out.println("Nice to meet you " + dateName);
        System.out.println("Would you like to go to Homecoming with me?"); 
        System.out.println("Great! It'll be a magical night -- Ramya and" + dateName + "going to the Mills Homecoming Dance 2015!");
        return dateName;
    }
    
    public static void damage() {
        String dateName = getADate();
        
        System.out.println("Let's figure out the damage for the evening");
        System.out.print("Tickets(each): ");
        Scanner userInput = new Scanner(System.in);
        double ticketsEach = userInput.nextInt();
        System.out.print("Flowers (total for both of you): ");
        double flowersTotal = userInput.nextInt();
        System.out.print("pictures: ");
        double pictures = userInput.nextInt();
        //how do you account for 2 dinner prices if this code only has one scanner input thing?
        System.out.print("Dinner (per meal): ");
        double dinnerPerMeal = userInput.nextInt();
        System.out.print("New clothes (tie to match dress? vest? dress? non-tennis shoes? ");
        double newClothes = userInput.nextInt();
        //what if there are no other expenses?
        System.out.print("Any other expenses: ");
        double other = userInput.nextInt();
        double tax = (dinnerPerMeal + newClothes)*(.0825);
        //do you put the price for both tickets in the total?
        double total = (ticketsEach*2)+flowersTotal+pictures+dinnerPerMeal+newClothes+tax;
        double splitCost = total/2;
        System.out.println("Your total cost will be "+total);
        System.out.println("If you split the cost with your date, each will pay: "+splitCost); 
        System.out.println();
        System.out.println();
        statsTable(dateName, (ticketsEach*2), flowersTotal, pictures, (dinnerPerMeal*2), newClothes, other, tax, total);
        
    }
    
     public static void statsTable(String name, double tickets, double flowers, double pics, double dinnerEach, double newClothes, double other, double tax, double total) {
        System.out.println("Tickets(total):\t \t \t" + tickets); 
        System.out.println("Flowers(for both of you)\t" + flowers); 
        System.out.println("Pictures \t \t \t" + pics); 
        System.out.println("Dinner (for two) \t \t" + dinnerEach*2); 
        System.out.println("New clothes \t \t \t" + newClothes); 
        System.out.println("Any other expenses \t \t" + other); 
        System.out.println("\t \t Subtotal: "+ (total-tax)); 
        System.out.println("\t \t Sales Tax: "+ tax); 
        System.out.println("\t \t Total: " + total); 
    }
   
        
}