import java.util.Scanner;
import java.util.Random;

class RandomNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int randomNum = rn.nextInt(100);
        int i;
        int score=0;
        int attempt = 5;
        int round = 9;
        for (int j = 1; j <= round; j++) {
            System.out.println("Round " + j );
            for ( i = 1; i <= attempt; i++) {
            System.out.println("Enter your guess:");
            int guess = sc.nextInt();
                if (randomNum == guess) {
                    score+=100;
                    System.out.println("Amazing! You Won");
                    break;
                }
                else if (randomNum > guess) {
                    System.out.println("Oops! Your guess is too Low");
                }
                else if (randomNum < guess) {
                    System.out.println("Oops! Your guess is too High");
                }
                System.out.println("Cheer Up! You have " + (attempt - i) + " more attempts");
            }
            System.out.println("Do You want to play again?(Y/N)");
            char ch = sc.next().charAt(0);
            if(ch=='Y'){
                continue;
            }
            else {
               System.out.println("Your Score:"+score);
               break;
            }
        }
    }
}