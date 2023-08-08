/*Code by : SHUBHAM SWARNAKAR
 TASK 1 : NUMBER GAME
*/

import java.util.*;

public class Guess_number {

    // function for genrated random number.
    public static int get_rand() {
        Random gnrted_Number = new Random();
        int randomNum = gnrted_Number.nextInt(100);
        return randomNum;

    }

    public static void round_1() {

    }

    public static void main(String as[]) {
        Scanner sc = new Scanner(System.in); // scanner class implement.

        // welcome note
        System.out.println(
                "     WELCOME TO THE \n||GUESS THE NUMBER GAME||\n\nTotal number Round = 5\nEach round have 5 attempt");
// --------------------------------------------------------------------
//intialization of the variable
        int round = 1;  //variable for storing the number of rounds
        int attempt = 0; //variable for storing the number of attemps
        int score =0 ;   //variable for storing the score


//outer while loop for rounds
            while (round <= 5 ) {
                System.out.println("\n\n       Round " + round + " Started");
                int randomNum = get_rand();
                int your_guess = -1;
                int your_tries = 0;
                int i =-1;


//inner while loop for attempts                
                while (your_guess != randomNum) {
                    i++;
                    System.out.println("Guess a number between 1 to 100");
                    attempt++;
                    your_guess = sc.nextInt();
                    your_tries++;

//condition 1                    
                    if (your_guess == randomNum) {
                        System.out.println("\nCongratulation, "+ your_guess + " is correct");
                        int temp_marks = 5-i;
                        score = score +temp_marks;
                        break;
                    }
//condition 2
                    if (your_tries == 5) {
                        System.out.println(" maximum attempt done..");
                        System.out.println("the correct number is "+randomNum);

                        break;
                    }
//condition 3                    
                     else if (your_guess > randomNum) {
                        System.out.println("too high");

                    }
//condition 4                    
                    else if (your_guess < randomNum) {
                        System.out.println("too low");
                    }

                }
//note for round completion
                System.out.println("       Round " + round + " completed");
                round++;

            }
//score's & attemps in 5 round's
            System.out.println("Score in the 5 rounds = " + score);
            System.out.println("totat attempt's in 5 rounds = "+attempt);
        
        }

    }



