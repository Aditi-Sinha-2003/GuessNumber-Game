import java.util.*;

public class RandomNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char response;
        do {
            Random rand = new Random();
            int num , count = 0;
            int max = 1000;
            int min = 1;
            int rand_int = rand.nextInt(max - min + 1) + min;
            

            do {
                System.out.println("Please guess the number\n");
                num = sc.nextInt();
                count++;

                if(num == rand_int) {
                    System.out.println("Yay! You are right");
                    break;
                } else if(num > rand_int) {
                    System.out.println("You are too high");
                } else {
                    System.out.println("You are too low");
                }
    
            } while (num != rand_int && count < 10);

            if(num != rand_int) {
                System.out.println("Sorry, you are out of limits. The correct answer was "+rand_int);
            }

            System.out.println("Do you want to play again ?[Y/N]");
            response = sc.next().charAt(0);

        } while(Character.toLowerCase(response) == 'y');
        

        }
    }
