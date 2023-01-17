package Section4Training;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Please enter number between One & Six");


        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers can not be less than 1. Shutting the game down!");
        System.exit(0);

        }
        if(num1 > 6 || num2 > 6 || num3 > 6)
            System.out.println("Numbers cannot be higher than 6. Shutting the game down!");
        System.exit(0);
        scan.close();
    }
    public static int rollDice() {
                                //0 - 0.9999999999
        double randomNumber = Math.random() * 6;
        randomNumber += 1; //1 - 6.99999999999
        return(int)randomNumber;


    }
}
