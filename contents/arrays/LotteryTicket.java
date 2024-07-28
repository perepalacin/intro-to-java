package contents.arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    
    private static final int LENGTH = 6; //This is basically a constant, it is set to final and is static!
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main (String[] args) {
        int[] ticket = generateNumbers();

        System.out.println(ticket.toString());
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i<LENGTH; i++) {
            int randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            while (!search(ticket, randomNumber)) {
                randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            }
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value: array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

    // @Override
    // public String toString() {
    //     return Arrays.toString();
    // }


}
