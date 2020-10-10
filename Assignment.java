// package week1.day5;
import java.lang.Math;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        System.out.println("This is a math game, you have to answer the questions correctly to win. You started it with 3 lives. Good Luck!");

        while(true) {
            System.out.println("Hello and welcome to the two player math game, would you like to play? (y/n)");
            Scanner input = new Scanner(System.in);
            String yesOrNot = input.nextLine();

            if(yesOrNot.equals("y")){
                int gameCnt = 0;
                int userWinCtn = 0;
                while(gameCnt < 3){

                    int num1 = (int)(Math.random() * 10); 
                    int num2 = (int)(Math.random() * 10);
                    System.out.println("number1: " + num1 + " number2: " + num2 );

                    int ans = num1 + num2; // correct answer

                    System.out.println("What is your answer?");

                    Scanner input1 = new Scanner(System.in); 
                    int userAnswer = input1.nextInt(); // user write the answer

                    if(ans == userAnswer){
                        System.out.println("Correct!");
                        userWinCtn++;
                    }else{
                        System.out.println("Incorrect! The answer was " + ans + ".");
                    }
                    gameCnt++;
                    System.out.println("he lives: player 1: " + userWinCtn + "/3  player 2: " + (3 - userWinCtn) + "/3");
                }
                if(userWinCtn >= 2 ){
                    System.out.println("player 1 wins!");
                }else{
                    System.out.println("player 2 wins!");
                }
            }else if (yesOrNot.equals("n")){

                break;
            }else{
                System.out.println("Please answer the question.");
            } 
            

        }
    }
}
