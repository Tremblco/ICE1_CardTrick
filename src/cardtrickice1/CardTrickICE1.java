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
        String rsuit = ""; //to convert the randomization to String for suits FOR RANDOM CARDS
        String usuit = "";//to convert the randomization to String for suits FOR USER CARD
        int output = 0;//Varaible for the final output message
        
        System.out.println("7 random cards: ");//This loop is to generate 7 random cards
                
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
            magicHand[i] = c1;//to set values for the c1 object to the array
                
            System.out.println(magicHand[i]);//To output the card values
        }   
        
        Card c2 = new Card ();//To create a new object for the user input
        System.out.println();//To create space
        System.out.println("Please enter a card value (options 1-13):");
        int cardValue = in.nextInt();//input from user
        c2.setValue(cardValue);
        System.out.println("Please enter a card suit \n1. Hearts, \n2. Diamonds, \n3. Spades, \n4. Clubs");
        int cardSuit = in.nextInt();//input from user
        
            if (cardSuit==1)
                usuit = "Hearts";
            if (cardSuit==2)
                usuit = "Diamonds";
            if (cardSuit==3)
                usuit = "Spades";
            if (cardSuit==4)
                usuit = "Clubs";
            
        c2.setSuits(usuit);
        System.out.println();
        
        
        for( int i=0;i<magicHand.length;i++)//To compare the random cards to the user input
        {
            if (c2.getValue()==magicHand[i].getValue()&&c2.getSuits().equals(magicHand[i].getSuits()))
                    output=1;
        }
        
        
      
        if (output == 1)
            System.out.println("Your card matches one of the 7 cards!");
        
        if (output == 0)
            System.out.println("Your card does not match any of the 7 cards.");
        
        
       Card luckyCard = new Card();
            luckyCard.setValue(3);
            luckyCard.setSuits("Clubs");//Changes made in github
    }
    
}
