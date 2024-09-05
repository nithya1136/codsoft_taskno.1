import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int win = 0,score=0;
        int max = 3;
        boolean play = true;
        while (play) {
            int attempt = 0;
            int no_guess = random.nextInt(100) + 1;
            System.out.println(no_guess);
            while (attempt < max) {
                System.out.println("Enter your guess:");
                int user_guess = scanner.nextInt();
                attempt++;
                if (user_guess >= (no_guess - 10) && user_guess < no_guess) {
                    System.out.println("Your guess is slightly low from the number");
                } else if (user_guess < (no_guess - 10)) {
                    System.out.println("Too low from the number");
                } else if (user_guess <= (no_guess + 10) && user_guess > no_guess) {
                    System.out.println("Your guess is slightly high from the number");
                } else if (user_guess > (no_guess + 10)) {
                    System.out.println("Too high from the number");
                } else if (user_guess == no_guess) {             
                    if(attempt==1)
                        score+=2;
                    else
                        score++;   
                    win++;     
                    System.out.println("You have correctly guesed");
                    no_guess = random.nextInt(100) + 1;
                    System.out.println(no_guess);
                }
            }
           
            System.out.println("you have won " + win + " times and your score is "+ score +" ,want to try again(yes/no)?");
            String res = scanner.next();
            play = res.equalsIgnoreCase("yes");
        }
        System.out.println("game over");
        scanner.close();
    }
}