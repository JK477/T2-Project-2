
/**
 * Write a description of class PrisonersDilemma here.
 *
 * @author Jordan Kelland
 * @version 1, 23/06/2021
 */

import java.util.Scanner;

public class PrisonersDilemma
{
    // instance variables - replace the example below with your own
    private int x;
    private int Roundcont;
    private int play1score = 0;
    private int play2score = 0;
    
    public PrisonersDilemma()
    {
        // initialise instance variables
        Scanner inputboard = new Scanner(System.in);
        
        String p1CommandInput;
        String p2CommandInput;
        
        int p1CommandValue;
        int p2CommandValue;
        int coop1 = 1;
        int defect1 = 2;
        int coop2 = 1;
        int defect2 = 2;
        int coopwin = 2;
        int cooplos = 0;
        int defectwin = 3;
        int defectlos = 1;
        
        
        System.out.println("Prisoners Delimma description");
        
        System.out.println("Player 1 enter your move; Cooperate or Defect");
        p1CommandInput = inputboard.nextLine();
        System.out.println("Player 1 your move was "+p1CommandInput);
        
        System.out.println("Player 2 enter your move; Cooperate or Defect");
        p2CommandInput = inputboard.nextLine();
        System.out.println("Player 2 your move was "+p2CommandInput);
        
        //if (p1command == p2command) {
        //    play1score = play1score + coopwin;
        //} else if (p1command < p2command) {
        //    play1score = play1score + cooplos;  
        //} else if {
        //    play1score = play1score + defectwin;
        //} else 
        
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
