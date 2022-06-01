package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author Cody Tremblay 991317990
 */
import java.util.Scanner;
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        Card[] magicHand = new Card[7]; //Array of object
        int rangev = (13-1)+1; //Variable to calculate the card value randomization
        int ranges = (4-1)+1;//Variable to calculate the card suits randomization
        String rsuit = ""; //to convert the randomization to String for suits
        int output = 0;
        
        System.out.println("Please enter a card value (options 1-13):");
        int cardValue = in.nextInt();
        System.out.println("Please enter a card suit (options Hearts, Diamonds, Spades, Clubs:");
        String cardSuit = in.next();
        System.out.println();
        
        System.out.println("7 random cards: ");
                
        for( int i=0;i<magicHand.length;i++)
        {
            int[] val = new int[7];
                val[i]=(int)(Math.random()*rangev)+1;
            int[] suit = new int[7];
            
                suit[i]=(int)(Math.random()*ranges)+1;
                if (suit[i]==1)
                    rsuit = "Hearts";
                if (suit[i]==2)
                    rsuit = "Diamonds";
                if (suit[i]==3)
                    rsuit = "Spades";
                if (suit[i]==4)
                    rsuit = "Clubs";
            
            if (i>0)
            {
                if (val[i]==val[i-1]&&suit[i]==suit[i-1])
                {
                    --i;
                    continue;
                }
            }//To stop the program from running duplicate cards 
            
            Card c1 = new Card();
            c1.setValue(val[i]);//use a method to generate random *13
            c1.setSuits(rsuit);//random method suit 
            magicHand[i] = c1;
            
            
                if (cardValue == c1.getValue()&&cardSuit.equals(c1.getSuits()))
                    output=1;
                
            System.out.println(magicHand[i]);
        }   
        
        System.out.println();
        if (output == 1)
            System.out.println("Your card matches one of the 7 cards!");
        
        if (output == 0)
            System.out.println("Your card does not match any of the 7 cards.");
    }
    
}
