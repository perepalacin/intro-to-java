
import java.util.Scanner;

public class LiquidContainers {
    
    private int amount1;
    private int amount2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LiquidContainers containers = new LiquidContainers();

        System.out.println(containers.toString());
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if ("add".equals(command)) {
                // System.out.println("1");
                containers.add(amount);
            } else if ("remove".equals(command)) {
                // System.out.println("2");
                containers.remove(amount);
            } else if ("move".equals(command)) {
                // System.out.println("3");
                containers.move(amount);
            }
            System.out.println(containers.toString());
        }
    }

    public void add(int amount) {
        if (amount > 0) {
            if (amount + this.amount1 >= 100) {
                this.amount1 = 100;
            } else {
                this.amount1 = this.amount1 + amount;
            }
        }
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount > amount1) {
                if (this.amount2 + this.amount1 >= 100) {
                    this.amount2 = 100;
                } else {
                    this.amount2 = this.amount2 + this.amount1;
                }
                this.amount1 = 0;
            } else {
                if (this.amount2 + amount >= 100) {
                    this.amount2 = 100;
                } else {
                    this.amount2 = this.amount2 + amount;
                }
                this.amount1 = this.amount1 - amount;
            }
        }
    }

    public void remove (int amount) {
        if (amount > 0) {
            if (this.amount2 < amount) {
                this.amount2 = 0;
            } else {
                this.amount2 = this.amount2 - amount;
            }
        }
    }

    @Override
    public String toString() {
        return "First: " + this.amount1 + "/100\nSecond: " + this.amount2 + "/100\n";
    }

}
