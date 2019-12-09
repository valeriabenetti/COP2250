// Valeria Benetti 2183227
package benetti4;

// s = 1/2gt^2 where s = distance in meters
// g = 9.8, and t = time in seconds


public class fallingObject {
	public static void main(String[] args){
        System.out.printf("%3s\t%6s\t%6s\n", "SEC", "METERS", "FEET");

        for(int time = 1; time <= 10; time++)
        {
            System.out.print(time + "\t");
            meters(time);
            feet(time);
            System.out.println();
        }
    }
    public static void meters(int time){
        double meters;
        double g = 9.8; // meters = .5(9.8)(seconds) ^2
        meters = (.5 * 9.8 * Math.pow(time, 2));
        
        System.out.printf("%6.1f\t", meters);
    }
    public static void feet(int time){
        double feet;
        double g = 9.8; // meters = .5(9.8)(seconds) ^2
        feet = (.5 * 9.8 * Math.pow(time, 2) * 3.28084);
        
        System.out.printf("%6.1f", feet);
    }    
}
