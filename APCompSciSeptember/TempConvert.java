
/**
 * TempConvert converts Farenheit to Celsius. 
 * 
 * Ramya Nagarajan
 * 09/10/15
 */
public class TempConvert {
    public static void main(String[] args) {
        converter(); 
    }
    public static void converter() {
        double celsius; 
        double farenheit = 32;  
        celsius = (5.0/9)*(farenheit - 32);  
        System.out.println(celsius); 
    }
}
