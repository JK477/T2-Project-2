
/**
 * Write a description of class ClassAS91896 here.
 *
 * @author Jordan kelland
 * @version 1, 17/06/21 - 19/06/21
 */

import java.util.Scanner; //Keyboard input.

public class ClassAS91896
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int RoundCount; 
    private int play1Score = 0;
    private int play2Score = 0;
    
    //Constructor for objects of class ClassAS91896
    public ClassAS91896()
    {
        // initialise instance variables
        Scanner inputboard = new Scanner(System.in);
        
        //outcome variables
        int coop1 = 1;
        int defect1 = 2;
        int coop2 = 1;
        int defect2 = 2;
        
        //Points system
        int coopWin = 2;
        int coopLos = 0;
        int defectWin = 3;
        int defectLos = 1;
        
        //will assign outcome varaible values to player 1 & 2
        int p1CommandValue;
        int p2CommandValue;
        
        //will hold input from players
        String p1CommandInput;
        String p2CommandInput;
        
        //Prisoners Dilemma description & rules
        System.out.println("Prisoners Delimma description");
        System.out.println("Prisoners Delimma Rules");
        
        System.out.println("Player 1 enter your move; Cooperate or Defect");
        p1CommandInput = inputboard.nextLine();
        System.out.println("Player 1 your move was "+p1CommandInput);
        
        System.out.println("Player 2 enter your move; Cooperate or Defect");
        p2CommandInput = inputboard.nextLine();
        System.out.println("Player 2 your move was "+p2CommandInput);
        
        
        p1CommandValue = 1; // this is temporay so that it lets me compile
        p2CommandValue = 1;
        
        if (p1CommandValue == p2CommandValue) {
            play1Score = play1Score + coopWin;
            play2Score = play2Score + coopWin;
            System.out.println("Player 1 outcome is Coop Win");
            System.out.println("Player 2 outcome is Coop Win");
        } else if (p1CommandValue > p2CommandValue) {
            play1Score = play1Score + defectWin;
            play2Score = play2Score + coopLos;
            System.out.println("Player 1 outcome is Defect Win");
            System.out.println("Player 2 outcome is Coop Lose");
        } else if (p1CommandValue < p2CommandValue) {
            play1Score = play1Score + coopLos;
            play2Score = play2Score + defectWin;
            System.out.println("Player 1 outcome is Coop Lose");
            System.out.println("Player 2 outcome is Defect Win");
        } else if (p1CommandValue == p2CommandValue) {
            play1Score = play1Score + defectLos;
            play2Score = play2Score + defectLos;
            System.out.println("Player 1 outcome is Defect Lose");
            System.out.println("Player 2 outcome is Defect Lose");
        // need to change this logic
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
