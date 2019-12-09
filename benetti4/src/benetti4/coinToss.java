// Valeria Benetti 2183227
package benetti4;


import java.util.*;

public class coinToss {
	public static String toss()
    {
        // create an object of type random
        Random rand = new Random();
        // generate a random number in range 0-1
        int result = rand.nextInt(2);
        if(result == 0)
            return "heads";
        else
            return "tails";
    }
    public static void main(String[] args)
    {
        // create an object of type Scanner
        Scanner sc = new Scanner(System.in);
        // Prompt the user for how many times to toss the coin. 
        System.out.print("How many times should I toss the coin? ");
        int n = sc.nextInt();
        int heads = 0, tails = 0;
        int i;
        for( i = 1 ; i <= n ; i++ )
        {
            // toss the coin
            String result = toss();
            // if heads came
            if(result.equals("heads"))
                heads++;
            else
                tails++;
        }
     // Report the results
        System.out.println("\nResults of " + n +" tosses.\nHeads: " + heads + ", Tails : " + tails);
    }
}
